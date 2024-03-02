public class Client {
    // https://drive.google.com/file/d/1MApmfp-kgE_qXWbt7_pjvVnoA__W_8-U/view?usp=sharing
    public static void main(String[] args) throws Exception {
        ICandyFactory kakau = new KakauShoes();
        INormalCandy chocolate =  kakau.normalCandy();
        ICrazyCandy saltyCaramel = kakau.crazyCandy();
        IFitCandy eggplant = kakau.fitCandy();

        ICandyFactory magazine = new MagazineBoomBoom();
        INormalCandy milkCandy = magazine.normalCandy();
        ICrazyCandy sweetBeans = magazine.crazyCandy();
        IFitCandy avocado = magazine.fitCandy();

        System.out.println();
        System.out.println("KAKAU SHOES");
        System.out.println();

        System.out.println(chocolate);
        System.out.println(saltyCaramel);
        System.out.println(eggplant);

        System.out.println();
        System.out.println("MAGAZINE BOOMBOOM");
        System.out.println();

        System.out.println(milkCandy);
        System.out.println(sweetBeans);
        System.out.println(avocado);
    }
}
