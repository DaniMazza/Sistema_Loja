import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private List<PedidoItem> items = new ArrayList<>();
    private Cliente cliente;
    private Vendedor vendedor;
    private double total;
}
