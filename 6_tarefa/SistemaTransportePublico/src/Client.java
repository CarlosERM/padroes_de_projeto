import Interface.ITransport;
import Toyota.ToyotaTransportationFactory;
import Volkswagen.VolkswagenTransportationFactory;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Client {


    public static void createVehicles(Scanner sc, ToyotaTransportationFactory toyota, VolkswagenTransportationFactory volkswagen, ArrayList<ITransport> vehicles) {
        String resp;
        do {
            System.out.println("-------------------------------------");
            System.out.println("           CRIAR VEÍCULOS            ");
            System.out.println("-------------------------------------");
            System.out.println("1 - Criar Ônibus da Toyota");
            System.out.println("2 - Criar Metrô da Toyota");
            System.out.println("3 - Criar Ônibus da Volkswagen");
            System.out.println("4 - Criar Metrô da Volkswagen");
            System.out.println("-1 - Sair");
            resp = sc.nextLine();

            switch (resp) {
                case "1":
                    ITransport transport = toyota.createTransportationBus();
                    transport.showTransportInformation();
                    vehicles.add(transport);
                    break;
                case "2":
                    ITransport transport2 = toyota.createTransportationMetro();
                    transport2.showTransportInformation();
                    vehicles.add(transport2);
                    break;
                case "3":
                    ITransport transport3 = volkswagen.createTransportationBus();
                    transport3.showTransportInformation();
                    vehicles.add(transport3);
                    break;
                case "4":
                    ITransport transport4 = volkswagen.createTransportationMetro();
                    transport4.showTransportInformation();
                    vehicles.add(transport4);
                    break;
                default:
                    break;
            }
        } while (!resp.contains("-1"));
    }

    public static void generateRoutes(ArrayList<ITransport> vehicles) {
        Random rand = new Random();
        for (ITransport a: vehicles) {
            String str = rand.ints(48, 123)
            .limit(4)
            .mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
            .toString();
            a.showTransportInformation();
            System.out.println("Rota: " + str);
        }
    }

    public static void enterOutRate(ArrayList<ITransport> vehicles) {
        System.out.println("-------------------------------------");
        System.out.println("            ENTROU E SAIU            ");
        System.out.println("-------------------------------------");
        Random rand = new Random();
        for (ITransport a: vehicles) {
            int entrou = rand.nextInt(300);
            int saiu = rand.nextInt(200);
            a.showTransportInformation();
            System.out.println("Quem entrou: " + entrou);
            System.out.println("Quem saiu: " + saiu);
        }
    }

    public static void vehicleCapacity(ArrayList<ITransport> vehicles) {
        System.out.println("-------------------------------------");
        System.out.println("      CAPACIDADE DOS VEÍCULOS        ");
        System.out.println("-------------------------------------");
        Random rand = new Random();
        for (ITransport a: vehicles) {
            int capacity = rand.nextInt(60);
            a.showTransportInformation();
            System.out.println("Capacidade: " + capacity);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<ITransport> vehicles = new ArrayList<ITransport>();
        String resp;
        ToyotaTransportationFactory toyota = new ToyotaTransportationFactory();
        VolkswagenTransportationFactory volkswagen = new VolkswagenTransportationFactory();
    
        do {
            System.out.println("1 - Criar veículos de transporte");
            System.out.println("2 - Geração de rotas para os veículos");
            System.out.println("3 - Gestão de passageiros embarcando e desembarcando");
            System.out.println("4 - Monitoramento da capacidade dos veículos");
            System.out.println("-1 - Desligar");
            resp = sc.nextLine();

            switch (resp) {
                case "1":
                    createVehicles(sc, toyota, volkswagen, vehicles);
                    break;
                case "2":
                    generateRoutes(vehicles);
                    break;
                case "3":
                    enterOutRate(vehicles);
                    break;
                case "4":
                    vehicleCapacity(vehicles);
                    break;
                case "-1":
                    break;
                default:
                    break;
            }
        } while (!resp.contains("-1"));
    }
}
