public class App {
    // https://drive.google.com/file/d/1nn0Opf5TCvQ9PwV49nBHB3Ob8Fw3f3bP/view?usp=sharing
    public static void main(String[] args) throws Exception {
        IMythosFactory greek = new GreekMythosFactory();
        IMythosFactory norse = new NorseMythosFactory();

        IGod zeus = greek.createGod();
        IMonster minotaurus = greek.createMonster();
        IDemiGod hercules = greek.createDemiGod();

        IGod thor = norse.createGod();
        IMonster jormungard = norse.createMonster();
        IDemiGod sleipnir = norse.createDemiGod();

        System.out.println();
        System.out.println("GREEK");
        System.out.println();

        System.out.println(zeus);
        System.out.println(minotaurus);
        System.out.println(hercules);

        System.out.println();
        System.out.println("GREEK");
        System.out.println();

        System.out.println(thor);
        System.out.println(jormungard);
        System.out.println(sleipnir);

    }
}
