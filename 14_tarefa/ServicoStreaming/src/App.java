import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String resp;
        Scanner sc = new Scanner(System.in);
        IServicoStream miraflix = new Miraflix();
        AssinaturaDecorator assinatura = new AssinaturaBaseDecorator(miraflix);
        Set<String> pacotesAdicionados = new HashSet<>();
        String nomePacote = "";


        do {
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("    MIRAFLIX - SERVIÇO DE STREAMING   ");
            System.out.println("--------------------------------------");
            System.out.println();

            System.out.println("0 - Assinatura Base.");
            System.out.println("1 - Pacote 1: Assistir vídeos em vários dispositivos R$19,99.");
            System.out.println("2 - Pacote 2: Frete Grátis em produtos R$9,99.");
            System.out.println("3 - Pacote 3: Caixa surpresa com produtos relacionados a filmes e séries R$29,99.");
            System.out.println("4 - Pacote 4: Cartão de crédito Platinum R$49,99.");
            System.out.println("5 - Pacote 5: Compra com Cash Back R$ 19,99.");
            System.out.println("-1 - Desligar.");

            resp = sc.nextLine();

            switch (resp) {
                case "0":
                    nomePacote = "Base";

                    if(!pacotesAdicionados.contains(nomePacote)) {
                        assinatura.assinarStreaming();
                        pacotesAdicionados.add(nomePacote);
                        System.out.println("Assinatura base foi assinada.");
                    } else {
                        System.out.println("Você já possui a assinatura base.");
                    }

                    break;
                case "1":
                    nomePacote = "Pacote1";

                    if(!pacotesAdicionados.contains(nomePacote) && pacotesAdicionados.contains("Base")) {
                        assinatura = new AssinaturaPacote1Decorator(assinatura);
                        assinatura.assinarStreaming();
                        pacotesAdicionados.add(nomePacote);
                    } else {
                        System.out.println("Você precisa realizar a assinatura base ou então adicionar um pacote diferente.");
                    }

                    break;
                case "2":
                    nomePacote = "Pacote2";

                    if(!pacotesAdicionados.contains(nomePacote) && pacotesAdicionados.contains("Base")) {
                        assinatura = new AssinaturaPacote2Decorator(assinatura);
                        assinatura.assinarStreaming();
                        pacotesAdicionados.add(nomePacote);
                    } else {
                        System.out.println("Você precisa realizar a assinatura base ou então adicionar um pacote diferente.");
                    }

                    break;
                case "3":
                    nomePacote = "Pacote3";

                    if(!pacotesAdicionados.contains(nomePacote) && pacotesAdicionados.contains("Base")) {
                        assinatura = new AssinaturaPacote3Decorator(assinatura);
                        assinatura.assinarStreaming();
                        pacotesAdicionados.add(nomePacote);
                    } else {
                        System.out.println("Você precisa realizar a assinatura base ou então adicionar um pacote diferente.");
                    }

                    break;
                case "4":
                    nomePacote = "Pacote4";

                    if(!pacotesAdicionados.contains(nomePacote) && pacotesAdicionados.contains("Base")) {
                        assinatura = new AssinaturaPacote4Decorator(assinatura);
                        assinatura.assinarStreaming();
                        pacotesAdicionados.add(nomePacote);
                    } else {
                        System.out.println("Você precisa realizar a assinatura base ou então adicionar um pacote diferente.");
                    }

                    break;
                case "5":
                    nomePacote = "Pacote5";

                    if(!pacotesAdicionados.contains(nomePacote) && pacotesAdicionados.contains("Base")) {
                        assinatura = new AssinaturaPacote5Decorator(assinatura);
                        assinatura.assinarStreaming();
                        pacotesAdicionados.add(nomePacote);
                    } else {
                        System.out.println("Você precisa realizar a assinatura base ou então adicionar um pacote diferente.");
                    }

                    break;
                default:
                    break;
            }
        } while(!resp.equals(("-1")));

        System.out.println("Desligando....");

        sc.close();
    }
}
