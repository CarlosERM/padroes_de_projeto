package Vehicles;

import Interface.ITransport;

public class MetroVolkswagen implements ITransport {

    @Override
    public void showTransportInformation() {
        System.out.println("Volkswagen Metro\nCapacidade de Passageiros: 500\nVelocidade Média: 300 k/h\n" + //
        "Método de Cobrança de Tarifas: Cartão e Pix\n");
    }
}
