public class SenhaConsecutivaChainMiddleware extends ChainMiddleware {

    @Override
    public boolean check(String email, String senha) {
        char caractere1;
        char caractere2;
        char caractere3;

        for (int i = 0; i < senha.length() - 2; i++) {
            caractere1 = senha.charAt(i);
            caractere2 = senha.charAt(i + 1);
            caractere3 = senha.charAt(i + 2);
            if(
                Character.isDigit(caractere1) && 
                Character.isDigit(caractere2) && 
                Character.isDigit(caractere3)) {
                    if(caractere2 - caractere1 == 1 && caractere3 - caractere2 == 1) {
                        System.out.println("A senha possui números consecutivos!!!");
                        return false;
                        // System.out.println(caractere1);
                        // System.out.println(caractere2);
                        // System.out.println(caractere3);
                        // System.out.println(caractere2 - caractere1);
                        // System.out.println(caractere3 - caractere2);
                    }
            }
        }
        return checkNext(email, senha);
    }
    
}

