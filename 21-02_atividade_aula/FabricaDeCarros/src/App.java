public class App {
    public static void main(String[] args) throws Exception {
        IFabricaDeCarros fabricaHonda = new FabricaHonda();
        ICarroSuv hrv = fabricaHonda.carroSuv();
        ICarroSedan civ = fabricaHonda.carroSedan();
        
        hrv.exibirInfoSuv();
        civ.exibirInfoSedan();

        IFabricaDeCarros fabricaToyota = new FabricaToyota();
        ICarroSuv corolla = fabricaToyota.carroSuv();
        ICarroSedan corollaCross = fabricaToyota.carroSedan();

        corolla.exibirInfoSuv();
        corollaCross.exibirInfoSedan();
    }
}
