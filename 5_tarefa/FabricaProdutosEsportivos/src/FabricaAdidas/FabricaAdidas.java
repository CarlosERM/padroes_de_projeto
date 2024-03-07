package FabricaAdidas;

import Interfaces.ICamisaEsportiva;
import Interfaces.IFabricaProdutosEsportivos;

public class FabricaAdidas  implements IFabricaProdutosEsportivos{

    @Override
    public void imprimirDadosFabrica() {
        String info = """
            -----------------------------------------
            FABRICA ADIDAS

            A Adidas é uma empresa de calçados, roupas esportivas e equipamentos 
            esportivos fundada na Alemanha. Tem o nome de seu fundador, 
            Adolf Dassler, também conhecido pelo apelido de Adi, que começou a 
            produzir sapatilhas nos anos 1920, juntamente com o seu irmão Rudolf 
            Dassler, em Herzogenaurach, próximo de Nuremberg.
            -----------------------------------------
        """;
        System.out.println(info);
    }

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
    
}
