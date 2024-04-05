import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String r;
        FabricaVioloes fabrica = new FabricaVioloes();
        fabrica.fabricarEstoqueViolao();

        do {
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println("          FÁBRICA DE INSTRUMENTOS       ");
            System.out.println("----------------------------------------");
            System.out.println();

            System.out.println("1 - VIOLÃO CLÁSSICO");
            System.out.println("2 - VIOLÃO FOLK");
            System.out.println("3 - VIOLÃO FLAT");
            System.out.println("4 - VIOLÃO JUMBO");
            System.out.println("5 - VIOLÃO 7 CORDAS");
            System.out.println("6 - VIOLÃO 12 CORDAS");
            System.out.println("7 - VIOLÃO ZERO");
            System.out.println("8 - VIOLÃO DUPLO ZERO");
            System.out.println("9 - VIOLÃO TRIPLO ZERO");
            System.out.println("-1 - DESLIGOU");
            
            r = sc.nextLine();

            System.out.println("----------------------------------------");
            switch (r) {
                case "1":
                    System.out.println(fabrica.get("Violão Clássico"));
                    break;
                case "2":
                    System.out.println(fabrica.get("Violão Folk"));
                    break;
                case "3":
                    System.out.println(fabrica.get("Violão Flat"));
                    break;
                case "4":
                    System.out.println(fabrica.get("Violão Jumbo"));
                    break;
                case "5":                                        
                    System.out.println(fabrica.get("Violão 7 Cordas"));
                    break; 
                case "6":
                    System.out.println(fabrica.get("Violão 12 Cordas"));
                    break;
                case "7":
                    System.out.println(fabrica.get("Violões Zero"));
                    break;
                case "8":
                    System.out.println(fabrica.get("Violão Duplo Zero"));
                    break;
                case "9":
                    System.out.println(fabrica.get("Violão Triplo Zero"));
                    break;
                default:
                    break;
            }
            System.out.println("----------------------------------------");
        } while (!r.equals("-1"));
        sc.close();
    }
}
