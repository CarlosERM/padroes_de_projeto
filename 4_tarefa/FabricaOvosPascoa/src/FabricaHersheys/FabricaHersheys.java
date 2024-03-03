package FabricaHersheys;
import Interfaces.IFabricaOvosPascoa;
import Interfaces.IOvoGrande;
import Interfaces.IOvoMedio;
import Interfaces.IOvoPequeno;

public class FabricaHersheys implements IFabricaOvosPascoa {
    // Hershey não vende ovos de Páscoa.
    // Hershey's: 1) Hershey's 137g 2) Hershey's 225g 3) Hershey's 336g
    @Override
    public IOvoPequeno createOvoPequeno() {
        return new HersheysPequeno();
    }

    @Override
    public IOvoMedio createOvoMedio() {
        return new HersheysMedio();
    }

    @Override
    public IOvoGrande createOvoGrande() {
        return new HersheysGrande();
    }
    
}
