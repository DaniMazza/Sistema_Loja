public class Produto {
    private String nome;
    private double valor;
    private int quantidadeMaxima;
    private int codigo;

    public Produto() { }
    public Produto(String nome) { this.nome = nome; }
    public Produto(String nome, double valor, int quantidadeMaxima, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeMaxima = quantidadeMaxima;
        this.codigo = codigo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public int getQuantidadeMaxima() { return quantidadeMaxima; }
    public void setQuantidadeMaxima(int quantidadeMaxima) { this.quantidadeMaxima = quantidadeMaxima; }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
}
