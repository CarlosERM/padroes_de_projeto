package FabricaAdidas;
import Interfaces.ICamisaEsportiva;

public class CamisaFlamengo implements ICamisaEsportiva {

    @Override
    public void imprimirDadosCamisa() {
        String info = """
            -----------------------------------------
            CAMISA DO FLAMENGO

            FEITA COM MATERIAIS RECICLADOS PARA OS TORCEDORES RUBRO-NEGROS
            Homenageie o Mengão com um toque moderno. Esta camisa adidas do 
            primeiro uniforme do Flamengo moderniza um dos uniformes mais 
            icônicos do futebol. Por trás do novo visual, o tecido AEROREADY 
            antitranspirante mantém os torcedores confortáveis, seja para 
            torcer nas arquibancadas ou assistir ao jogo na TV. O escudo bordado
            ajuda a turbinar a sua paixão pelo time.
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
