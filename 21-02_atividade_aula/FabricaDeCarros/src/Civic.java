public class Civic implements ICarroSedan{

    @Override
    public void exibirInfoSedan() {
        System.out.println();
        System.out.println(
            "CIVIC\n" + 
            "Preço sugerido: A partir de R$ 259.900\n" +
            "Potência: 297 HP\n" +
            "Marca: Honda\n" +
            "Transmissão: CVT, Manual de 6 marchas\n" +
            "Volume de carga: 337 - 495 l"
        );
    }
    
}
