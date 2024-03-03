package FabricaGaroto;
import Interfaces.IOvoMedio;

public class OvoCaribe implements IOvoMedio {

    @Override
    public String infoOvoMedio() {
        return """
        ---------------------------------------------------
        OVO CARIBE (229g)
        Marca \t Garoto
        Linha \t Caribe
        Tipo de chocolate \t Chocolate ao Leite
        Formato de venda \t Unidade
        Conservação do produto \t Temperatura ambiente
        ---------------------------------------------------
        """;
    }
    
}
