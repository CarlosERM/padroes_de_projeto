package SistemaAluguelCarro;
public class SistemaAluguelCarro {
        public Double alugarCarro(TiposAluguel classe) {
        System.out.println("Processando o aluguel do carro...");
        System.out.println("O carro com diária "+ classe + " foi alugado por R$ " + classe.getValor());
        return classe.getValor();
    }
}
