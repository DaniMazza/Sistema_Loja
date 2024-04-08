
public class RegistroNaoEncontradoException extends Exception{

    private String nome;

    public RegistroNaoEncontradoException(String nome) {
        super("Nome informado não foi encontrado, esta pessoa não está cadastrada");
        this.nome = nome;
    }


}