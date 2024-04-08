import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente  extends  Pessoa{
    private LocalDate dataCadastro;
    private Set<Cliente> clientes;

    public  Cliente() {
        if (clientes.isEmpty()){
            clientes = new HashSet<>();
        }
    }
    private void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente(LocalDate dataCadastro) {
        if (clientes.isEmpty()){
        clientes = new HashSet<>();
        }
        this.dataCadastro = dataCadastro;
    }

    public Cliente(String nome, String cpf, LocalDate dataCadastro) {
        super(nome, cpf);
        this.dataCadastro = dataCadastro;
        if (clientes.isEmpty()){
            clientes = new HashSet<>();
        }
    }

    public LocalDate getDataCadastro() { return dataCadastro; }

    public void setDataCadastro(LocalDate dataCadastro) { this.dataCadastro = dataCadastro; }
}
