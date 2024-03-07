package FabricaNike;

import Interfaces.ICamisaEsportiva;

public class CamisaBrasil implements ICamisaEsportiva {
    @Override
    public void imprimirDadosCamisa() {
        String info = """
            -----------------------------------------
            CAMISA DO BRASIL
            Benefícios

            Tecnologia Nike Dri-FIT absorve o suor da sua pele para evaporação mais rápida, ajudando a manter você seco e confortável.
            O design de réplica é baseado naquele que os craques usam em campo.
            
            Detalhes do Produto
            
            Ajuste padrão para sensação relaxada e fácil
            100% poliéster
            Lavável à máquina
            Tamanho & Caimento
            -----------------------------------------
        """;
        System.out.println(info);
    }
}
