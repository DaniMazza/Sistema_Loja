import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pedido  {
    private List<PedidoItem> itens;
    private Cliente cliente;
    private Vendedor vendedor;
    private double total;


    private Set<Pedido> pedidos;

    public  Pedido() {
        if (pedidos.isEmpty()){
            pedidos = new HashSet<>();
        }
    }
    public Pedido(Cliente cliente, Vendedor vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        if (this.itens == null) {
            this.itens = new ArrayList<>();
        }
        if (pedidos.isEmpty()){
            pedidos = new HashSet<>();
        }
    }

    private void adicionar(Pedido pedido) {
        pedidos.add(pedido);
    }
    public void adicionarItem(PedidoItem item){
        try {
            for (PedidoItem it : itens) {
                if (it.getProduto().getNome().equals(item.getProduto().getNome())) {
                    throw new ItemDuplicadoException(it.getProduto());
                }
            }

        } catch (ItemDuplicadoException e){
            e.toString();
        }
        if (item != null){
            itens.add(item);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public double getTotal(){
        double total = 0;
        for (PedidoItem item : itens) {
             total += item.getProduto().getValor();
        }
        return total;
    }
}
