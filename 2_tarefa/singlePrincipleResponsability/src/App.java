// Enviar o arquivo em PDF com o Link do GitHub aqui até 21/02
// Aberto: terça, 18 mai 2021, 00:00
// Vencimento: quarta, 21 fev 2024, 23:59

// Fazer uma implementação em uma linguagem Orientada a Objetos
//  para cada princípio de programação SOLID. a implementação inicialmente 
//  deve apresentar o código em desacordo com o princípio. Você deve
//   mostrar o que está ferindo o princípio, explicando por meio de 
//   comentários no código e depois deve apresentar o código corrigido 
//   e que esteja de acordo com o princípio. O código incorreto deve ser 
//   colocado numa classe e o código correto em outra classe. A aplicação 
//   deve ser submetido ao Github e o link deve ser colocado no arquivo em PDF.

// Pode colocar todos os links no arquivo de modelo disponibilizado

public class App {
    public static void main(String[] args) throws Exception {
        System.err.println();
        System.err.println("WRONG IMPLEMENTATION");
        System.err.println();

        PersonWrong johnDoe = new PersonWrong("John Doe", 1.50, 70.0);

        for (int i = 0; i < 5; i++) {
            johnDoe.eat();
        }
        System.err.println("BMI: " + johnDoe.calculateBmi());

        System.err.println();
        System.err.println("CORRECT IMPLEMENTATION");
        System.err.println();

        PersonCorrect bigJohn = new PersonCorrect("Big John", 1.87, 70.0);
        BalanceCorrect balance = new BalanceCorrect();

        for (int i = 0; i < 5; i++) {
            double bmi = balance.calculateBmi(bigJohn.weight, bigJohn.height);
            bigJohn.eat(bmi);
        }
    }
}
