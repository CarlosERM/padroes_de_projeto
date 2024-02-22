public class FabricaToyota implements IFabricaDeCarros {

    @Override
    public ICarroSedan carroSedan() {
        return new Corolla();
    }

    @Override
    public ICarroSuv carroSuv() {
        return new CorollaCross();
    }
    
}
