package FabricaUmbro;
import Interfaces.ICamisaEsportiva;
import Interfaces.IFabricaProdutosEsportivos;

public class FabricaUmbro implements IFabricaProdutosEsportivos{

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaFluminense();
    }

    @Override
    public void imprimirDadosFabrica() {
        String info = """
            -----------------------------------------
            FABRICA UMBRO

            A Umbro é uma empresa inglesa de material esportivo, 
            sendo uma das grandes empresas do ramo no mundo. Em 2007, 
            foi comprada pela norte-americana Nike, e, em 2012, foi 
            vendida para a também americana Iconix Brand Group.
            -----------------------------------------
        """;
        System.out.println(info);
    }
    
}
