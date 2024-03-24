package Interface;
public interface ITransportationFactory {
    abstract ITransport createTransportationBus();
    abstract ITransport createTransportationMetro();
}
