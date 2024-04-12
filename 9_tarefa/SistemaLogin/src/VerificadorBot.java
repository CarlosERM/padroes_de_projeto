import java.util.Random;

public class VerificadorBot {
    public static String gerador_random() {
        int limiteEsquerda = 48; // Número '0'
        int limiteDireita = 122; // Letra 'z'
        int tamanhoStringAlvo = 5;
        Random random = new Random();
    
        String codigo = random.ints(limiteEsquerda, limiteDireita + 1)
          .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
          .limit(tamanhoStringAlvo)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
        return codigo;
    }
}