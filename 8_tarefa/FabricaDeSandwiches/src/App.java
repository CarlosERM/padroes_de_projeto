import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String resp;
        DirectorChocolate directorChoco = new DirectorChocolate();
        DirectorJilo directorJilo = new DirectorJilo();
        Scanner sc = new Scanner(System.in);
        SandwichBuilder builder = new SandwichBuilder();

        do {
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("           SANDWICHES MALUCOS!            ");
            System.out.println("------------------------------------------");
            System.out.println();

            System.out.println("1 - Chocolate Sandwich");
            System.out.println("2 - Jiló Sandwich");
            System.out.println("3 - Sandwich Personalizado");
            System.out.println("4 - Sair");
            
            resp = sc.nextLine();

            switch (resp) {
                case "1":
                    directorChoco.criarSandwichChocolate(builder);
                    System.out.println("------------------------------------------");
                    System.out.println(builder.getResult());
                    System.out.println("------------------------------------------");
                    break;
                case "2":
                    directorJilo.criarSandwichJilo(builder);
                    System.out.println("------------------------------------------");
                    System.out.println(builder.getResult());
                    System.out.println("------------------------------------------");
                    break;
                case "3":
                    System.out.println("Digite o nome do sanduíche: ");
                    builder.setNome(sc.nextLine());
                    System.out.println("Digite o tipo de carne: ");
                    builder.setTipoCarne(sc.nextLine());
                    System.out.println("Digite o tipo de queijo: ");
                    builder.setTipoQueijo(sc.nextLine());
                    System.out.println("Digite o recheio: ");
                    builder.setRecheio(sc.nextLine());
                    System.out.println("Digite a salada: ");
                    builder.setSalada(sc.nextLine());
                    System.out.println("Digite o molho: ");
                    builder.setMolho(sc.nextLine());
                    System.out.println("Digite o pão: ");
                    builder.setPao(sc.nextLine());
                    System.out.println("Digite o preço: ");
                    builder.setPreco(Double.parseDouble(sc.nextLine()));
                    System.out.println("Digite o tamanho: ");
                    builder.setTamanho(sc.nextLine());
                    System.out.println(builder.getResult());
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (!resp.equals("4"));
        sc.close();
    }
}