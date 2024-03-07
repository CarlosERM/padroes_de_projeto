import FabricaAdidas.FabricaAdidas;
import FabricaKappa.FabricaKappa;
import FabricaNike.FabricaNike;
import FabricaPuma.FabricaPuma;
import FabricaUmbro.FabricaUmbro;
import Interfaces.ICamisaEsportiva;
import Interfaces.IFabricaProdutosEsportivos;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String resp;

        IFabricaProdutosEsportivos nike = new FabricaNike();
        IFabricaProdutosEsportivos adidas = new FabricaAdidas();
        IFabricaProdutosEsportivos puma = new FabricaPuma();
        IFabricaProdutosEsportivos umbro = new FabricaUmbro();
        IFabricaProdutosEsportivos kappa = new FabricaKappa();
       
        do {
            System.out.println("1 - Camisa do Brasil (NIKE)");
            System.out.println("2 - Camisa do Flamengo (ADIDAS)");
            System.out.println("3 - Camisa do Botafogo (PUMA)");
            System.out.println("4 - Camisa do Fluminense (UMBRO)");
            System.out.println("5 - Camisa do Vasco (KAPPA)");
            System.out.println("-1 - Desligar");

            resp = sc.nextLine();

            switch (resp) {
                case "1":
                    ICamisaEsportiva brasil = nike.criarCamisa();
                    nike.imprimirDadosFabrica();
                    brasil.imprimirDadosCamisa();
                    break;
                case "2":
                    ICamisaEsportiva flamengo = adidas.criarCamisa();
                    adidas.imprimirDadosFabrica();
                    flamengo.imprimirDadosCamisa();
                    break;
                case "3":
                    ICamisaEsportiva botafogo = puma.criarCamisa();
                    puma.imprimirDadosFabrica();
                    botafogo.imprimirDadosCamisa();
                    break;
                case "4":
                    ICamisaEsportiva fluminense = umbro.criarCamisa();
                    umbro.imprimirDadosFabrica();
                    fluminense.imprimirDadosCamisa();
                    break;
                case "5":
                    ICamisaEsportiva vasco = kappa.criarCamisa();
                    kappa.imprimirDadosFabrica();
                    vasco.imprimirDadosCamisa();
                    break;
                case "-1":
                    System.out.println("DESLIGANDO...");
                    break;
                default:
                    System.out.println("DIGITE UM VALOR VÁLIDO");
                    break;
            }
        } while (!resp.equals("-1"));

        sc.close();
    }
}
