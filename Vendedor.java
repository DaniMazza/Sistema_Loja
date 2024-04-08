import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Vendedor extends Pessoa{
    private String matricula;
    private double percentualComissao;
    private LocalDate dataAdmissao;
    private Set<Vendedor> vendedores;

    public  Vendedor() {
        if (vendedores.isEmpty()){
            vendedores = new HashSet<>();
        }
    }

    public Vendedor(String nome, String cpf, String matricula, double percentualComissao, LocalDate dataAdmissao) {
        super(nome, cpf);
        this.matricula = matricula;
        this.percentualComissao = percentualComissao;
        this.dataAdmissao = dataAdmissao;
        if (vendedores.isEmpty()){
            vendedores = new HashSet<>();
        }
    }
    private void adicionar(Vendedor vendedor) {
        vendedores.add(vendedor);
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
