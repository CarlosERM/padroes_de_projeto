public class FabricaNestle implements IFabricaOvosPascoa {

    @Override
    public IOvoPequeno createOvoPequeno() {
        return new OvoClassic();
    }

    @Override
    public IOvoMedio createOvoMedio() {
        return new OvoKitKat();
    }

    @Override
    public IOvoGrande createOvoGrande() {
        return new OvoAlpino();
    }
    
}
