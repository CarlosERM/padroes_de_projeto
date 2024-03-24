package Volkswagen;
import Interface.ITransport;
import Interface.ITransportationFactory;

public class VolkswagenTransportationFactory implements ITransportationFactory {

    @Override
    public ITransport createTransportationBus() {
        return new BusVolkswagenTransportFactory().createTransport();
    }

    @Override
    public ITransport createTransportationMetro() {
        return new MetroVolkswagenTransportFactory().createTransport();
    }
    
}
