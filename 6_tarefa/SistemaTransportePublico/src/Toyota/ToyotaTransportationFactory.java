package Toyota;
import Interface.ITransport;
import Interface.ITransportationFactory;

public class ToyotaTransportationFactory implements ITransportationFactory {

    @Override
    public ITransport createTransportationBus() {
        return new BusToyotaTransportFactory().createTransport();
    }

    @Override
    public ITransport createTransportationMetro() {
        return new MetroToyotaTransportFactory().createTransport();
    }
    
}
