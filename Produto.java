import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double valor;
    private int quantidadeMaxima;
    private int codigo = 10100;
    private static int proximoCodigo = 100;

    public  Produto() {
    }
    public Produto(String nome, double valor, int quantidadeMaxima) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeMaxima = quantidadeMaxima;
        this.codigo = proximoCodigo++;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public int getQuantidadeMaxima() { return quantidadeMaxima; }
    public void setQuantidadeMaxima(int quantidadeMaxima) { this.quantidadeMaxima = quantidadeMaxima; }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return getCodigo() == produto.getCodigo() && Objects.equals(getNome(), produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCodigo());
    }


    @Override
    public int compareTo(Produto produto) {

        return this.nome.compareTo(produto.getNome());
    }
}
