import java.time.LocalDate;
import java.util.Objects;

public class Vendedor extends Pessoa implements Comparable<Vendedor>{
    private String matricula;
    private double percentualComissao;
    private LocalDate dataAdmissao;
    public  Vendedor() {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vendedor)) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(getMatricula(), vendedor.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }
    @Override
    public int compareTo(Vendedor vendedor) {
        return this.getNome().compareTo(vendedor.getNome());
    }
}
