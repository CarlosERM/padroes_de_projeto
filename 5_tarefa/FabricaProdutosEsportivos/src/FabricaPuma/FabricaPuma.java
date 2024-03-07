package FabricaPuma;

import Interfaces.ICamisaEsportiva;
import Interfaces.IFabricaProdutosEsportivos;

public class FabricaPuma implements IFabricaProdutosEsportivos{

    @Override
    public ICamisaEsportiva criarCamisa() {
       return new CamisaBotafogo();
    }

    @Override
    public void imprimirDadosFabrica() {
        String info = """
            -----------------------------------------
            FABRICA PUMA

            PUMA é uma empresa alemã de equipamentos desportivos, fundada 
            em 1948 pelo empresário alemão Rudolf Dassler, com sede em 
            Herzogenaurach, Alemanha.
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
