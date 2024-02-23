public class App {
    // https://drive.google.com/file/d/169FW6uED1pDkKA8PGePiXlipv_lnbaQp/view?usp=sharing
    public static void main(String[] args) throws Exception {
        IMythosFactory greek = new GreekMythosFactory();
        IMythosFactory norse = new NorseMythosFactory();
        IMythosFactory egypt = new EgyptianMythosFactory();

        IGod zeus = greek.createGod();
        IMonster minotaurus = greek.createMonster();
        IDemiGod hercules = greek.createDemiGod();

        IGod thor = norse.createGod();
        IMonster jormungard = norse.createMonster();
        IDemiGod sleipnir = norse.createDemiGod();

        IGod set = egypt.createGod();
        IMonster sphinx = egypt.createMonster();
        IDemiGod imhotep = egypt.createDemiGod();

        System.out.println();
        System.out.println("GREEK");
        System.out.println();

        System.out.println(zeus);
        System.out.println(minotaurus);
        System.out.println(hercules);

        System.out.println();
        System.out.println("norse");
        System.out.println();

        System.out.println(thor);
        System.out.println(jormungard);
        System.out.println(sleipnir);

        System.out.println();
        System.out.println("EGYPTIAN");
        System.out.println();

        System.out.println(set);
        System.out.println(sphinx);
        System.out.println(imhotep);
    }
}
