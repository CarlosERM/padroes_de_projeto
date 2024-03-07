package FabricaKappa;

import Interfaces.ICamisaEsportiva;
import Interfaces.IFabricaProdutosEsportivos;

public class FabricaKappa implements IFabricaProdutosEsportivos{

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaVasco();
    }

    @Override
    public void imprimirDadosFabrica() {
        String info = """
            -----------------------------------------
            FABRICA KAPPA

            Kappa é uma empresa italiana especializada na fabricação 
            de roupas e acessórios esportivos fundada em 1916 em Turim.
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
