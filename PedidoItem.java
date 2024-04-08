import java.util.ArrayList;

public class PedidoItem {
    private Produto produto;
    private int quantidade;

    public PedidoItem() {
    }

    public PedidoItem(Produto produto, int quantidade) throws QuantidadeNaoPermitadaException{
        this.produto = produto;
        if (quantidade > produto.getQuantidadeMaxima()) {
          throw new QuantidadeNaoPermitadaException("Quantidade de itens requecitados maior do que o máximo permitido");
        }
        else {
            this.quantidade =  quantidade;
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Produto produto, int quantidade) throws QuantidadeNaoPermitadaException {

        if (quantidade > produto.getQuantidadeMaxima()) {
            throw new QuantidadeNaoPermitadaException("Quantidade de itens requecitados maior do que o máximo permitido");
        }
        else {
            this.quantidade =  quantidade;
        }
    }
}
