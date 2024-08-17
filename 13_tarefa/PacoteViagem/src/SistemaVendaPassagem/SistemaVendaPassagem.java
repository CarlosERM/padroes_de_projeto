package SistemaVendaPassagem;
public class SistemaVendaPassagem {
    public Double comprarPassagem(String assento, ClassesPassagem classe) {
        System.out.println("Processando pagamento da passagem...");
        System.out.println("O assento " + assento + " da classe " + classe + " foi comprado por R$ " + classe.getValor());
        return classe.getValor();
    }
}
