public class Senha8CaractereChainMiddleware extends ChainMiddleware {

    @Override
    public boolean check(String email, String senha) {
        if(senha.length() < 8) {
            System.out.println("A senha é menor que 8 caracteres!!!");
            return false;
        }

        return checkNext(email, senha);
    }
}
