package Vehicles;

import Interface.ITransport;

public class BusToyota implements ITransport {

    @Override
    public void showTransportInformation() {
        System.out.println("Toyota Coaster\nCapacidade de Passageiros: 60\nVelocidade Média: 100 k/h\n" + //
                        "Método de Cobrança de Tarifas: Cartão\n");
    }
    
}