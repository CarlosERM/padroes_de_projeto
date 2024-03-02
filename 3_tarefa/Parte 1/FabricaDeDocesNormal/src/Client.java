public class Client {
    // https://drive.google.com/file/d/1--6Kt-HBm_rF0_IPhmfyUWwBZ-2Otdfu/view?usp=sharing
    public static void main(String[] args) throws Exception {
        ICandyFactory kakau = new KakauShoes();
        INormalCandy chocolate =  kakau.normalCandy();
        ICrazyCandy saltyCaramel = kakau.crazyCandy();

        ICandyFactory magazine = new MagazineBoomBoom();
        INormalCandy milkCandy = magazine.normalCandy();
        ICrazyCandy sweetBeans = magazine.crazyCandy();

        System.out.println();
        System.out.println("KAKAU SHOES");
        System.out.println();

        System.out.println(chocolate);
        System.out.println(saltyCaramel);

        System.out.println();
        System.out.println("MAGAZINE BOOMBOOM");
        System.out.println();

        System.out.println(milkCandy);
        System.out.println(sweetBeans);
    }
}
