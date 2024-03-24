package Vehicles;

import Interface.ITransport;

public class BusVolkswagen implements ITransport {

    @Override
    public void showTransportInformation() {
        System.out.println("Volksbus 8.180 E\nCapacidade de Passageiros: 45\nVelocidade Média: 120 k/h\n" + //
        "Método de Cobrança de Tarifas: Cartão\n");
    }
    
}
