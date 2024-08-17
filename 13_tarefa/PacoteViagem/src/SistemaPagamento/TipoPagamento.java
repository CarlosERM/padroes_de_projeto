package SistemaPagamento;
public enum TipoPagamento {
    PIX(-0.1), BOLETO(-0.05), DEBITO(0.0), CREDITO(0.0399);
    private final Double valor;

    TipoPagamento(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }
}
