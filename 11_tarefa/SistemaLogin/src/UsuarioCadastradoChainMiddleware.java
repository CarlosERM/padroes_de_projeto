public class UsuarioCadastradoChainMiddleware extends ChainMiddleware {
    private Servidor servidor;

    public UsuarioCadastradoChainMiddleware(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public boolean check(String email, String senha) {
        if(!servidor.temEmail(email)) {
            System.out.println("O email não está registrado.");
            return false;
        }
        if(!servidor.validaSenha(email, senha)) {
            System.out.println("A senha está incorreta!");
            return false;
        }

        return checkNext(email, senha);
    }
}