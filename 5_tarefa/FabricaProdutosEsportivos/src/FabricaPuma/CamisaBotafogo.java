package FabricaPuma;

import Interfaces.ICamisaEsportiva;

public class CamisaBotafogo implements ICamisaEsportiva {

    @Override
    public void imprimirDadosCamisa() {
        String info = """
            -----------------------------------------
            CAMISA DO BOTAFOGO

            Descrição
            A Camisa Puma Botafogo I 2015 é confeccionada em poliéster 
            com a tecnologia Dry Cell, que ajuda a manter o jogador seco 
            durante a partida. O design apresenta o tradicional listrado 
            vertical em preto e branco e o escudo da equipe bordado no peito.

            Informações Técnicas
            A Camisa Puma Botafogo I 2015 é confeccionada em poliéster e 
            conta com a tecnologia Dry Cell, que ajuda a manter o jogador 
            seco durante a partida. 
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
