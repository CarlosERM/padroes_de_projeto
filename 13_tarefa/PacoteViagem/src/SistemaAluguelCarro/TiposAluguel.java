package SistemaAluguelCarro;
public enum TiposAluguel {
    ECONOMICA(150.0), EXECUTIVA(150.0 * 1.0), LUXO(150.0 * 1.0);

    private final Double valor;

    TiposAluguel(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }
}
