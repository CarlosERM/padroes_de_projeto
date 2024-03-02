public class FabricaLacta implements IFabricaOvosPascoa {

    @Override
    public IOvoPequeno createOvoPequeno() {
        return new OvoLeite();
    }

    @Override
    public IOvoMedio createOvoMedio() {
        return new OvoOreo();
    }

    @Override
    public IOvoGrande createOvoGrande() {
        return new OvoSonhoValsa();
    }
    
}
