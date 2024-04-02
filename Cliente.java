import java.time.LocalDate;

public class Cliente  extends  Pessoa{
    private LocalDate dataCadastro;

    public Cliente() {}
    public Cliente(LocalDate dataCadastro) { this.dataCadastro = dataCadastro;}

    public Cliente(String nome, String cpf, LocalDate dataCadastro) {
        super(nome, cpf);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() { return dataCadastro; }

    public void setDataCadastro(LocalDate dataCadastro) { this.dataCadastro = dataCadastro; }
}
