public class Usuario {
    String nome;
    String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return  "USUÁRIO" + "\n" + "Nome: " + nome + "\n" + "Senha: " + senha;
    }
}