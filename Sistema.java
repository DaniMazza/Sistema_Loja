import java.time.LocalDate;
import java.util.Scanner;

public class Sistema {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws RegistroNaoEncontradoException, ItemDuplicadoException, QuantidadeNaoPermitadaException {
        Loja loja = new Loja();
        loja.inicializarVendedores();
        loja.inicializarProdutos();
        boolean sair = false;
        while (!sair) {
            menuPrincipal();
            int opcao = getIntInput();

            switch (opcao) {
                case 1:
                    cadastrarProduto(loja);
                    break;
                case 2:
                    cadastrarCliente(loja);
                    break;
                case 3:
                    cadastrarVendedor(loja);
                    break;
                case 4:
                    cadastrarPedido(loja);
                    break;
                case 5:
                    loja.listarProdutos();
                    break;
                case 6:
                    loja.listarVendedores();
                    break;
                case 7:
                    loja.listarPedidos();
                    break;
                case 8:
                    loja.listarClientes();
                    break;
                case 9:
                    System.out.println("Total Bruto de Vendas: R$" + loja.calcularTotalBrutoVendas());
                    break;
                case 10:
                    System.out.println("Total Líquido de Vendas: R$" + loja.calcularTotalLiquidoVendas());
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static int getIntInput() {
        while (!teclado.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            teclado.next();
        }
        return teclado.nextInt();
    }

    private static void cadastrarPedido(Loja loja) throws RegistroNaoEncontradoException, ItemDuplicadoException, QuantidadeNaoPermitadaException {
        teclado.nextLine();
        boolean sair = false;
        System.out.println("----- CADASTRO-Pedido -----");
        System.out.print("Escreva qual dos Vendedores a seguir atendeu a compra:  \n");
        loja.listarVendedores();
        String vendedorSelecionado = teclado.nextLine();
        System.out.print("Escreva qual dos Clientes a seguir realizou o pedido:  \n");
        loja.listarClientes();
        String clienteSelecionado = teclado.nextLine();
        Pedido pedido = new Pedido(loja.getClientePorNome(clienteSelecionado), loja.getVendedorPorNome(vendedorSelecionado));
        while (!sair) {
            menuAdicionarProdutoPedido();
            int opcao = getIntInput();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Escreva qual dos produtos a seguir você deseja:  ");
                    loja.listarProdutos();
                    String produtoSelecionado = teclado.nextLine();
                    System.out.print("Digite a quantidade desejada: ");
                    int quantidade = getIntInput();
                    PedidoItem item = new PedidoItem(loja.getProdutoPorNome(produtoSelecionado), quantidade);
                    pedido.adicionarItem(item);
                    break;
                case 2:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        loja.cadastrarPedido(pedido);
    }

    private static void cadastrarProduto(Loja loja) {
        teclado.nextLine();
        System.out.println("----- CADASTRO-DE-PRODUTO -----");
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = teclado.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valorProduto = teclado.nextDouble();
        System.out.print("Digite a quantidade máxima do produto: ");
        int quantidadeMaximaProduto = getIntInput();
        teclado.nextLine();
        Produto produto = new Produto(nomeProduto, valorProduto, quantidadeMaximaProduto);
        loja.cadastrarProduto(produto);
    }

    private static void cadastrarCliente(Loja loja) {
        teclado.nextLine();
        System.out.println("----- CADASTRO-DE-CLIENTES -----");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = teclado.nextLine();
        String cpfCliente = "000.000.000-00";
        LocalDate dtCadastro = LocalDate.of(2005,11,16);
        Cliente cliente = new Cliente(nomeCliente, cpfCliente, dtCadastro);
        loja.cadastrarCliente(cliente);


    }

    private static void cadastrarVendedor(Loja loja) {
        teclado.nextLine();
        System.out.println("----- CADASTRO-DE-VENDEDORES -----");
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = teclado.nextLine();
        System.out.print("Digite a comissão do vendedor(em decimal): ");
        double percentualComissao = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite a Matricula do vendedor: ");
        String matricula = teclado.nextLine();
        String cpfVendedor = "000.000.000-00";
        LocalDate dtAdmissao = LocalDate.of(2005,11,16);
        Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, matricula, percentualComissao, dtAdmissao);
        loja.cadastrarVendedor(vendedor);

    }

    public static void menuPrincipal() {
        System.out.println("Escolha uma das opcoes abaixo: ");
        System.out.println("1. Cadastro de Produtos\n");
        System.out.println("2. Cadastro de Cliente\n");
        System.out.println("3. Cadastro de Vendedores\n");
        System.out.println("4. Adicionar Pedido\n");
        System.out.println("5. Listar Produtos\n");
        System.out.println("6. Listar Vendedores\n");
        System.out.println("7. Listar Pedidos\n");
        System.out.println("8. Listar Clientes\n");
        System.out.println("9. Total Bruto de Vendas\n");
        System.out.println("10. Total Liquido de Vendas\n");
        System.out.println("0. Sair");
    }

    public static void menuAdicionarProdutoPedido(){
        System.out.println("---SELECIONE-A-OPÇÃO-DESEJADA---\n");
        System.out.println(" 1 - Adicionar mais um produto;\n");
        System.out.println(" 2 - Finalizar registro de produtos.");
    }
}
