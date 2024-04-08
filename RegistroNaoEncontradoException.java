
public class RegistroNaoEncontradoException extends Exception{

    private int codigo;
    private String cpf;
    public RegistroNaoEncontradoException(int codigo) {
        super();
        this.codigo = codigo;
    }
    public RegistroNaoEncontradoException(String cpf) {
        super("CPF informado não encontrado, pessoa não cadastrado");
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " não encontrado, produto não cadastrado";
    }

}