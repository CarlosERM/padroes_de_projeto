import SistemaAluguelCarro.SistemaAluguelCarro;
import SistemaAluguelCarro.TiposAluguel;
import SistemaPagamento.SistemaPagamento;
import SistemaPagamento.TipoPagamento;
import SistemaReservaHotel.SistemaReservaHotel;
import SistemaReservaHotel.TiposReservaHotel;
import SistemaVendaPassagem.ClassesPassagem;
import SistemaVendaPassagem.SistemaVendaPassagem;

public class PacoteViagemFacade {
    public void comprarPacote(PessoaFisica[] pessoas, String assento, ClassesPassagem passagem, TiposReservaHotel reserva, TiposAluguel aluguel, TipoPagamento pagamento, int parcela) {
        SistemaVendaPassagem sistemaVendaPassagem = new SistemaVendaPassagem();
        SistemaReservaHotel sistemaReservaHotel = new SistemaReservaHotel();
        SistemaAluguelCarro sistemaAluguelCarro = new SistemaAluguelCarro();
        SistemaPagamento sistemaPagamento = new SistemaPagamento();
        Double valorFinal = 0.0;

        System.out.println("-----------------------------");
        System.out.println("SISTEM DE PACOTE DE VIAGEM");
        System.out.println("-----------------------------");
        System.out.println();

        for (PessoaFisica pessoa : pessoas) {
            System.out.println(pessoa);

            valorFinal += sistemaVendaPassagem.comprarPassagem(assento, passagem);
            System.out.println();
    
            valorFinal += sistemaReservaHotel.realizarReserva(reserva);
            System.out.println();
        }

        valorFinal += sistemaAluguelCarro.alugarCarro(aluguel);
        System.out.println();

        if (parcela >= 2 && parcela <= 6) {
            while(parcela != 1) {
                System.out.println("Piranah");
                valorFinal += valorFinal * sistemaPagamento.realizarPagamento(pagamento); 
                parcela--;
            }
        }
        else if(pagamento != TipoPagamento.CREDITO)valorFinal += valorFinal * sistemaPagamento.realizarPagamento(pagamento);

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("VALOR TOTAL: " + valorFinal);
        System.out.println("-----------------------------");
    }

    public void comprarPacote(PessoaFisica[] pessoas, String assento, ClassesPassagem passagem, TiposReservaHotel reserva, TiposAluguel aluguel, TipoPagamento pagamento) {
        comprarPacote(pessoas, assento, passagem, reserva, aluguel, pagamento, 1);
    }
}
