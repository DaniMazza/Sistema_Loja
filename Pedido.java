import java.util.*;

public class Pedido implements Comparable<Pedido>  {

    private static int proximoId = 1;
    private int id;
    private List<PedidoItem> itens;
    private Cliente cliente;
    private Vendedor vendedor;
    private double total;


    public Pedido(Cliente cliente, Vendedor vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        if (this.itens == null) {
            this.itens = new ArrayList<>();
        }
        this.id = proximoId++;
    }


    public void adicionarItem(PedidoItem item) throws ItemDuplicadoException{
            for (PedidoItem it : itens) {
                if (it.getProduto().getNome().equals(item.getProduto().getNome())) {
                    throw new ItemDuplicadoException(it.getProduto());
                }
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

    public List<PedidoItem> getItens() {

        return itens;
    }

    public double getTotal(){
        double total = 0.0;
        for (PedidoItem item : itens) {
             total += item.getProduto().getValor() * item.getQuantidade();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido pedido = (Pedido) o;
        return id == pedido.id && Objects.equals(getCliente(), pedido.getCliente()) && Objects.equals(getVendedor(), pedido.getVendedor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCliente(), getVendedor(), id);
    }

    @Override
    public int compareTo(Pedido pedido) {
        if (this.total > pedido.getTotal()){
            return -1;
        }
        return 1;
    }
}
