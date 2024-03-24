package Toyota;

import Interface.ITransport;
import Interface.ITransportFactory;
import Vehicles.BusToyota;

public class BusToyotaTransportFactory implements ITransportFactory {

    @Override
    public ITransport createTransport() {
        return new BusToyota();
    }
    
}
