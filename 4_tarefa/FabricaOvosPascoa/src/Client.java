import FabricaHersheys.FabricaHersheys;
import FabricaLacta.FabricaLacta;
import FabricaNestle.FabricaNestle;
import FabricaRocher.FabricaRocher;
import Interfaces.IFabricaOvosPascoa;
import Interfaces.IOvoGrande;
import Interfaces.IOvoMedio;
import Interfaces.IOvoPequeno;

import java.util.Scanner;

import FabricaGaroto.FabricaGaroto;
public class Client {
    public static void printAllOptions() {
        System.out.println("-----------------------------");
            System.out.println("     ESTOQUE DE PRODUTOS     ");
            System.out.println("-----------------------------");
            System.out.println("1 - OVO ALPINO (337g)");
            System.out.println("2 - OVO CLASSIC (185g)");
            System.out.println("3 - OVO KIT KAT (227g)");
            System.out.println("4 - OVO CROCANTE (215g)");
            System.out.println("5 - OVO BATON LEITE (350g)");
            System.out.println("6 - OVO TALENTO (172g)");
            System.out.println("7 - OVO AO LEITE (170g)");
            System.out.println("8 - OVO OREO (257g)");
            System.out.println("9 - OVO SONHO VALSA (277g)");
            System.out.println("10 - OVO BIS");
            System.out.println("11 - OVO CARIBE");
            System.out.println("12 - OVO OURO BRANCO");
            System.out.println("13 - OVO HERSHEY'S (137g)");
            System.out.println("14 - OVO HERSHEY'S (225g)");
            System.out.println("15 - OVO HERSHEY'S (336g)");
            System.out.println("16 - OVO FERRERO ROCHER (137g)");
            System.out.println("17 - OVO FERRERO ROCHER (255g)");
            System.out.println("18 - OVO FERRERO ROCHER (366g)");
            System.out.println("-1 - DESLIGAR PROGRAMA");
    }

    public static void main(String[] args) throws Exception {
        IFabricaOvosPascoa nestle = new FabricaNestle();
        IFabricaOvosPascoa garoto = new FabricaGaroto();
        IFabricaOvosPascoa lacta = new FabricaLacta();
        IFabricaOvosPascoa hersheys = new FabricaHersheys();
        IFabricaOvosPascoa rocher = new FabricaRocher();

        Scanner input = new Scanner(System.in);
        String resp = "0";
        do {
            printAllOptions();
            resp = input.nextLine();
            switch (resp) {
                case "1":
                    IOvoGrande ovoAlpino = nestle.createOvoGrande();
                    System.out.println(ovoAlpino.infoOvoGrande());
                    break;
                case "2":
                    IOvoPequeno ovoClassic = nestle.createOvoPequeno();
                    System.out.println(ovoClassic.infoOvoPequeno());
                    break;
                case "3":
                    IOvoMedio ovoKitkat = nestle.createOvoMedio();
                    System.out.println(ovoKitkat.infoOvoMedio());
                    break;
                case "4":
                    IOvoMedio ovoCrocante = garoto.createOvoMedio();
                    System.out.println(ovoCrocante.infoOvoMedio());
                    break;
                case "5":
                    IOvoPequeno ovoBaton = garoto.createOvoPequeno();
                    System.out.println(ovoBaton.infoOvoPequeno());
                    break;
                case "6":
                    IOvoGrande ovoTalento = garoto.createOvoGrande();
                    System.out.println(ovoTalento.infoOvoGrande());
                    break;
                case "7":
                    IOvoPequeno ovoLeite = lacta.createOvoPequeno();
                    System.out.println(ovoLeite.infoOvoPequeno());
                    break;
                case "8":
                    IOvoMedio ovoOreo = lacta.createOvoMedio();
                    System.out.println(ovoOreo.infoOvoMedio());
                    break;
                case "9":
                    IOvoGrande ovoValsa = lacta.createOvoGrande();
                    System.out.println(ovoValsa.infoOvoGrande());
                    break;
                case "10":
                    IOvoGrande ovoVBis = ((FabricaLacta) lacta).createOvoGrandeBis();
                    System.out.println(ovoVBis.infoOvoGrande());
                    break;
                case "11":
                    IOvoMedio ovoCaribe = ((FabricaGaroto) garoto).createOvoMedioCaribe();
                    System.out.println(ovoCaribe.infoOvoMedio());
                    break;
                case "12":
                    IOvoGrande ovoOuroBranco = ((FabricaNestle) nestle).createOvoGrandeOuroBranco();
                    System.out.println(ovoOuroBranco.infoOvoGrande());
                    break;
                case "13":
                    IOvoPequeno ovoHersheysPequeno = hersheys.createOvoPequeno();
                    System.out.println(ovoHersheysPequeno.infoOvoPequeno());
                    break;
                case "14":
                    IOvoMedio ovoHersheysMedio = hersheys.createOvoMedio();
                    System.out.println(ovoHersheysMedio.infoOvoMedio());
                    break;
                case "15":
                    IOvoGrande ovoHersheysGrande = hersheys.createOvoGrande();
                    System.out.println(ovoHersheysGrande.infoOvoGrande());
                    break;
                case "16":
                    IOvoPequeno ovoRocherPequeno = rocher.createOvoPequeno();
                    System.out.println(ovoRocherPequeno.infoOvoPequeno());
                    break;
                case "17":
                    IOvoMedio ovoRocherMedio = rocher.createOvoMedio();
                    System.out.println(ovoRocherMedio.infoOvoMedio());
                    break;
                case "18":
                    IOvoGrande ovoRocherGrande = rocher.createOvoGrande();
                    System.out.println(ovoRocherGrande.infoOvoGrande());
                    break;
                default:
                    System.out.println("SELECIONE UM DOS VALORES VÁLIDOS!");
                    break;
            }
          
        } while(!resp.equals("-1"));

        input.close();
    }
}
