package Vehicles;

import Interface.ITransport;

public class MetroToyota implements ITransport {

    @Override
    public void showTransportInformation() {
        System.out.println("Toyota Metro\nCapacidade de Passageiros: 450\nVelocidade Média: 320 k/h\n" + //
        "Método de Cobrança de Tarifas: Cartão e Pix\n");
    }
    
}
