package Volkswagen;

import Interface.ITransport;
import Interface.ITransportFactory;
import Vehicles.MetroVolkswagen;

public class MetroVolkswagenTransportFactory implements ITransportFactory {

    @Override
    public ITransport createTransport() {
        return new MetroVolkswagen();
    }
    
}
