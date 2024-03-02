public class FabricaGaroto implements IFabricaOvosPascoa {

    @Override
    public IOvoPequeno createOvoPequeno() {
        return new OvoBatonLeite();
    }

    @Override
    public IOvoMedio createOvoMedio() {
        return new OvoCrocante();
    }

    @Override
    public IOvoGrande createOvoGrande() {
        return new OvoTalento();
    }
}
