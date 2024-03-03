package FabricaRocher;

import Interfaces.IFabricaOvosPascoa;
import Interfaces.IOvoGrande;
import Interfaces.IOvoMedio;
import Interfaces.IOvoPequeno;

public class FabricaRocher implements IFabricaOvosPascoa {
    // Ferreiro: 1) Ferreiro Rocher 137g 2) Ferreiro Rocher 255g 3) Ferreiro Rocher 366g

    @Override
    public IOvoPequeno createOvoPequeno() {
        return new OvoRocherPequeno();
    }

    @Override
    public IOvoMedio createOvoMedio() {
        return new OvoRocherMedio();
    }

    @Override
    public IOvoGrande createOvoGrande() {
        return new OvoRocherGrande();
    }
    
}
