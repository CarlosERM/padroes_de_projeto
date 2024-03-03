package FabricaGaroto;
import Interfaces.IFabricaOvosPascoa;
import Interfaces.IOvoGrande;
import Interfaces.IOvoMedio;
import Interfaces.IOvoPequeno;

public class FabricaGaroto implements IFabricaOvosPascoa {

    @Override
    public IOvoPequeno createOvoPequeno() {
        return new OvoBatonLeite();
    }

    @Override
    public IOvoMedio createOvoMedio() {
        return new OvoCrocante();
    }

    public IOvoMedio createOvoMedioCaribe() {
        return new OvoCaribe();
    }

    @Override
    public IOvoGrande createOvoGrande() {
        return new OvoTalento();
    }
}
