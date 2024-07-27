public class SenhaNumeroChainMiddleware extends ChainMiddleware {

    @Override
    public boolean check(String email, String senha) {
        char caractere;
        boolean ehNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            caractere = senha.charAt(i);
            if (Character.isDigit(caractere)) {
                ehNumero = true;
            }
        }

        if (ehNumero) {
            return checkNext(email, senha);
        }

        System.out.println("A senha não tem nenhum número!!!");
        return ehNumero;
    }
}
