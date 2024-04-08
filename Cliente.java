import java.time.LocalDate;
import java.util.Objects;

public class Cliente  extends  Pessoa implements Comparable<Cliente>{
    private LocalDate dataCadastro;

    public Cliente(String nome, String cpf, LocalDate dataCadastro) {
        super(nome, cpf);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() { return dataCadastro; }

    public void setDataCadastro(LocalDate dataCadastro) { this.dataCadastro = dataCadastro; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getNome(), cliente.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.getNome().compareTo(cliente.getNome());
    }
}
