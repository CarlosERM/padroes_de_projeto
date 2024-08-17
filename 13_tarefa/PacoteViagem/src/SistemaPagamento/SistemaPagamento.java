package SistemaPagamento;

public class SistemaPagamento {
     public Double realizarPagamento(TipoPagamento pagamento) {
        String resposta = "O tipo de pagamento escolhido é o " + pagamento + " com desconto de: " ;
        System.out.println("Escolhendo o tipo de pagamento...");
        if (pagamento == TipoPagamento.CREDITO) {
            resposta = "O tipo de pagamento escolhido é o " + TipoPagamento.CREDITO + " com acréscimo de: " + pagamento.getValor() * 100 + "%" + " caso aja 2-6 parcelas.";
        } else if (pagamento == TipoPagamento.DEBITO) {
            resposta = "O tipo de pagamento escolhido é o " + TipoPagamento.DEBITO;
        } else {
            resposta += pagamento.getValor() * 100 + "%";
        }

        System.out.println(resposta);
        
        return pagamento.getValor();
    }
}
