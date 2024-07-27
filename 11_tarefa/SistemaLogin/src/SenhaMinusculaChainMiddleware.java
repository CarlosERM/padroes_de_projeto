public class SenhaMinusculaChainMiddleware extends ChainMiddleware {
    @Override
    public boolean check(String email, String senha) {
        char caractere;
        boolean ehMinuscula = false;

        for (int i = 0; i < senha.length(); i++) {
            caractere = senha.charAt(i);
            if(Character.isLowerCase(caractere)) {
                ehMinuscula = true;
            }
        }

        if (ehMinuscula) {
            return checkNext(email, senha);
        }

        System.out.println("A senha não tem nenhuma letra minúscula!!!");
        return ehMinuscula;
    }
}
