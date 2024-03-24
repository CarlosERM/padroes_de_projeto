package Volkswagen;

import Interface.ITransport;
import Interface.ITransportFactory;
import Vehicles.BusVolkswagen;

public class BusVolkswagenTransportFactory  implements ITransportFactory {

    @Override
    public ITransport createTransport() {
        return new BusVolkswagen();
    }
    
}
