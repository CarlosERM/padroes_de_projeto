public class FabricaHonda implements IFabricaDeCarros{

    @Override
    public ICarroSedan carroSedan() {
        return new Civic();
    }

    @Override
    public ICarroSuv carroSuv() {
        return new HRV();
    }
    
}
