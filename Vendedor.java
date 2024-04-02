import java.time.LocalDate;

public class Vendedor extends Pessoa{
    private String matricula;
    private double percentualComissao;
    private LocalDate dataAdmissao;

    public Vendedor() { }
    public Vendedor(String matricula, double percentualComissao, LocalDate dataAdmissao) {
        this.matricula = matricula;
        this.percentualComissao = percentualComissao;
        this.dataAdmissao = dataAdmissao;
    }
    public Vendedor(String nome, String cpf, String matricula, double percentualComissao, LocalDate dataAdmissao) {
        super(nome, cpf);
        this.matricula = matricula;
        this.percentualComissao = percentualComissao;
        this.dataAdmissao = dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
