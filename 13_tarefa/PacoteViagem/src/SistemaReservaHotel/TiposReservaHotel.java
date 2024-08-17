package SistemaReservaHotel;
public enum TiposReservaHotel {
    SIMPLES(200.00), EXECUTIVO(200 * 1.5), PRESIDENCIAL(500 * 4.5);

    private final Double valor;

    TiposReservaHotel(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }
}
