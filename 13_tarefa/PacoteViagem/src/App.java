import SistemaAluguelCarro.TiposAluguel;
import SistemaPagamento.TipoPagamento;
import SistemaReservaHotel.TiposReservaHotel;
import SistemaVendaPassagem.ClassesPassagem;

public class App {
    public static void main(String[] args) throws Exception {
        PacoteViagemFacade pacoteViagem = new PacoteViagemFacade();
        PessoaFisica[] pessoas = new PessoaFisica[2];

        pessoas[0] = new PessoaFisica("Carlos", "111111111");
        pessoas[1] = new PessoaFisica("Maria", "2222222222");

        pacoteViagem.comprarPacote(pessoas, "2d", ClassesPassagem.ECONOMICA, TiposReservaHotel.EXECUTIVO, TiposAluguel.ECONOMICA, TipoPagamento.PIX);
        // pacoteViagem.comprarPacote(pessoas, "2d", ClassesPassagem.EXECUTIVA, TiposReservaHotel.PRESIDENCIAL, TiposAluguel.EXECUTIVA, TipoPagamento.DEBITO);
        // pacoteViagem.comprarPacote(pessoas, "2d", ClassesPassagem.PRIMEIRA, TiposReservaHotel.SIMPLES, TiposAluguel.LUXO, TipoPagamento.BOLETO);
        // pacoteViagem.comprarPacote(pessoas, "2d", ClassesPassagem.ECONOMICA, TiposReservaHotel.EXECUTIVO, TiposAluguel.ECONOMICA, TipoPagamento.CREDITO);

    }
}
