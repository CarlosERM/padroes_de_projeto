public class SenhaCaractereEspecialChainMiddleware extends ChainMiddleware {

    @Override
    public boolean check(String email, String senha) {
        if(!senha.matches(".*[@#$%&].*")) {
            System.out.println("A senha não tem caracteres especiais[@, #, $, %, &]!!!");
            return false;
        }

        return checkNext(email, senha);
    }
}
