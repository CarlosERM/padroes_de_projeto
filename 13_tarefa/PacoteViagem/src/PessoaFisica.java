public class PessoaFisica {
    String nome;
    String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n";
    }
}
