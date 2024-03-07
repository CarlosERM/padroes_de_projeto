package FabricaKappa;

import Interfaces.ICamisaEsportiva;

public class CamisaVasco implements ICamisaEsportiva {

    @Override
    public void imprimirDadosCamisa() {
        String info = """
            -----------------------------------------
            CAMISA DO VASCO

            Camisa Vasco Oficial III 2023 Kappa Masculina - Camisas Negras 
            O novo uniforme tem como inspiração a vestimenta utilizada pelo 
            time mais importante da história do Vasco, mas trazendo tons de 
            modernidade. Localizada acima da cruz de Cristo encarnada, a 
            estrela é alusiva ao título de 1923 e a parte interna da gola traz 
            o nome dos 11 jogadores campeões. Já as datas remetem ao centenário 
            dos Camisas Negras.

            O Jacquard na camisa é composto por frases da famosa música cantada 
            pela torcida cruzmaltina nas arquibancadas. A canção exalta o orgulho 
            de ser Vasco e também presta homenagem aos Camisas Negras, que foram 
            representados no ensaio por três gerações de luta de uma família 
            vascaína: Walmir (pai), Manoela (filha) e Jaime (sobrinho).
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
