package SistemaReservaHotel;
public class SistemaReservaHotel {
    public Double realizarReserva(TiposReservaHotel reserva) {
        System.out.println("Processando pagamento da reserva no hotel...");
        System.out.println("O quarto "+ reserva +" foi reservado por R$ " + reserva.getValor());

        return reserva.getValor();
    }
}
