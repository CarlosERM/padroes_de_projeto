package FabricaNike;

import Interfaces.ICamisaEsportiva;
import Interfaces.IFabricaProdutosEsportivos;

public class FabricaNike implements IFabricaProdutosEsportivos {

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }

    @Override
    public void imprimirDadosFabrica() {
        String info = """
            -----------------------------------------
            FABRICA NIKE

            Nike, Inc. é uma empresa estadunidense de calçados, roupas, e acessórios 
            fundada em 1972 por Bill Bowerman e Philip Knight. A sua sede fica em 
            Beaverton, no estado de Oregon, nos Estados Unidos.
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
