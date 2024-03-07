package FabricaUmbro;

import Interfaces.ICamisaEsportiva;

public class CamisaFluminense implements ICamisaEsportiva {

    @Override
    public void imprimirDadosCamisa() {
        String info = """
            -----------------------------------------
            CAMISA DO FLUMINENSE

            A Camisa de Futebol Oficial Masculina Umbro Fluminense 1/2023 
            ressalta as cores tradicionais do clube (verde, grená e branco), 
            o escudo tricolor e um selo personalizado em homenagem à conquista 
            do mundial de 1952. Confeccionada em poliéster, a peça ainda 
            adiciona conforto em seu visual.
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
