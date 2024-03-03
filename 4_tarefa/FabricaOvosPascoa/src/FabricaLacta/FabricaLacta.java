package FabricaLacta;
import Interfaces.IFabricaOvosPascoa;
import Interfaces.IOvoGrande;
import Interfaces.IOvoMedio;
import Interfaces.IOvoPequeno;

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

    public IOvoGrande createOvoGrandeBis() {
        return new OvoBis();
    }
    
}
