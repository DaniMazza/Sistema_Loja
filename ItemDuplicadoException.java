public class ItemDuplicadoException extends Exception{

    private Produto produto;
    public ItemDuplicadoException(Produto produto) {
        super();
        this.produto = produto;
    }
    @Override
    public String toString() {
        return "não é permitido ter duas vezes o produto " + produto.getNome() +
                "\n Caso queira adicionar outro dele, altere a quantidade do produto no pedido!";
    }
}
