import java.time.LocalDate;
import java.util.*;

public class Loja {
    private Set<Produto> produtos;
    private Set<Cliente> clientes;
    private Set<Vendedor> vendedores;
    private Set<Pedido> pedidos;

    public Loja() {
        this.produtos = new HashSet<>();
        this.clientes = new HashSet<>();
        this.vendedores = new HashSet<>();
        this.pedidos = new HashSet<>();
    }

    public void inicializarVendedores() {
           vendedores.addAll(Arrays.asList(
                   new Vendedor("Matheus da Silva", "123.456.789-00", "M001", 4.5, LocalDate.of(2020, 1, 05)),
                   new Vendedor("Sol Mazzarolo", "987.654.321-00", "M002", 5.5, LocalDate.of(2019, 12, 20))
           ));
    }
        public void inicializarProdutos() {

            produtos.addAll(Arrays.asList(
                    new Produto("Camisa", 50.0, 50),
                    new Produto("Calça Jeans", 120.0, 50),
                    new Produto("Tênis", 200.0, 30),
                    new Produto("Boné", 30.0, 100),
                    new Produto("Bolsa", 150.0, 60),
                    new Produto("Relógio", 300.0, 30),
                    new Produto("Shorts", 80.0, 50),
                    new Produto("Sapato", 250.0, 30),
                    new Produto("Óculos de Sol", 100.0, 100),
                    new Produto("Jaqueta", 180.0, 10)
            ));

    }
    public Produto getProdutoPorNome(String nomeProduto) throws RegistroNaoEncontradoException{
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                return produto;
            }
        }
        throw new RegistroNaoEncontradoException(nomeProduto);
    }

    public Vendedor getVendedorPorNome(String nomeVendedor) throws RegistroNaoEncontradoException{
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getNome().equalsIgnoreCase(nomeVendedor)) {
                return vendedor;
            }
        }
        throw new RegistroNaoEncontradoException(nomeVendedor);
    }
    public Cliente getClientePorNome(String nomeCliente) throws RegistroNaoEncontradoException{
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                return cliente;
            }
        }
        throw new RegistroNaoEncontradoException(nomeCliente);
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!!");
    }
    public void cadastrarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido cadastrado com sucesso!!");
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!!");
    }

    public void cadastrarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!!");
    }

    public void listarClientes() {
        if (clientes.isEmpty()){
            System.out.println("Ainda não há clientes cadastrados!");
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

    public void listarVendedores() {
        if (vendedores.isEmpty()){
            System.out.println("Ainda não há vendedores cadastrado!");
        }
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.getNome());
        }
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " | R$ " + produto.getValor());
        }
    }

    public double calcularTotalBrutoVendas() {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
             total += pedido.getTotal();
            }
        return total;
    }

    public double calcularTotalLiquidoVendas() {
        double totalLiquido = calcularTotalBrutoVendas();
        double comissaoTotalVendedor = 0.0;
        for (Vendedor vendedor : vendedores) {
            for (Pedido pedido : pedidos) {
                    if (pedido.getVendedor().equals(vendedor)) {
                        comissaoTotalVendedor += pedido.getTotal() * (vendedor.getPercentualComissao()/100);
                    }
            }
            totalLiquido -= comissaoTotalVendedor;
        }
        return totalLiquido;
    }

    public void listarPedidos () {
        if (pedidos.isEmpty()) {
            System.out.println("Ainda não há pedidos registrados.");
        } else {
            System.out.println("=== Listagem de Pedidos ===");
            for (Pedido pedido : pedidos) {
                System.out.println("Valor total: " + pedido.getTotal());
                System.out.println("Cliente: " + pedido.getCliente().getNome());
                System.out.println("Vendedor: " + pedido.getVendedor().getNome());
                System.out.println("Itens do Pedido:");
                List<PedidoItem> itens = pedido.getItens();
                for (PedidoItem item : itens) {
                    System.out.println("   Produto: " + item.getProduto().getNome());
                    System.out.println("   Quantidade: " + item.getQuantidade());
                }
                System.out.println("------------------------------------");
            }
        }
    }
}