package SistemaVendaPassagem;
public enum ClassesPassagem {
    ECONOMICA(500.00), EXECUTIVA(500 * 2.5), PRIMEIRA(500 * 4.0);

    private final Double valor;

    ClassesPassagem(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }
}