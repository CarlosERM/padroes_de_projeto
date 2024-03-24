package Toyota;

import Interface.ITransport;
import Interface.ITransportFactory;
import Vehicles.MetroToyota;

public class MetroToyotaTransportFactory implements ITransportFactory {

    @Override
    public ITransport createTransport() {
        return new MetroToyota();
    }
    
}
