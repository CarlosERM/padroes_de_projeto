public class Senha16CaractereChainMiddleware extends ChainMiddleware {

    @Override
    public boolean check(String email, String senha) {
        if(senha.length() > 16) {
            System.out.println("A senha é maior que 16 caracteres!!!");
            return false;
        }

        return checkNext(email, senha);
    }
}
