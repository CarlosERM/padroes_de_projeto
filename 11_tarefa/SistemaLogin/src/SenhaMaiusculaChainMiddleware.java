public class SenhaMaiusculaChainMiddleware extends ChainMiddleware {

    @Override
    public boolean check(String email, String senha) {
        char caractere;
        boolean ehMaiuscula = false;

        for (int i = 0; i < senha.length(); i++) {
            caractere = senha.charAt(i);
            if(Character.isUpperCase(caractere)) {
                ehMaiuscula = true;
            }
        }

        if(ehMaiuscula) {
            return checkNext(email, senha);
        }

        System.out.println("A senha não tem nenhuma letra maiúscula!!!");
        return ehMaiuscula;
    }
    
}
