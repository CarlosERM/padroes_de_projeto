public class App {
    // Uma classe não deve ser forçada a depender de interfaces que não utiliza por completo.
    public static void main(String[] args) throws Exception {
        HumanWrong humanWrong = new HumanWrong();
        BirdWrong birdWrong = new BirdWrong();
        
        HumanCorrect humanCorrect = new HumanCorrect();
        BirdCorrect birdCorrect = new BirdCorrect();

        System.out.println();
        System.out.println("WRONG");
        System.out.println();
        
        System.out.println("HUMAN");
        humanWrong.fly();
        humanWrong.talk("Eu gosto de Elden Ring, mas nunca joguei...");
        humanWrong.think("Dá pra rodar Elden Ring no Ubuntu?");
        System.out.println();
        System.out.println("BIRD");
        birdWrong.fly();
        birdWrong.talk("... pru, pru");
        birdWrong.think("...");
        
        System.out.println();
        System.out.println("CORRECT");
        System.out.println();

        System.out.println("HUMAN");
        
        humanCorrect.talk("Eu gosto de Elden Ring, mas nunca joguei...");
        humanCorrect.think("Dá pra rodar Elden Ring no Ubuntu?");
        System.out.println();
        System.out.println("BIRD");
        birdCorrect.fly();
        

    }
}
