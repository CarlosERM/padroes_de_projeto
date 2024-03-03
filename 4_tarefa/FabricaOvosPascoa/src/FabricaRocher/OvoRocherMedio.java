package FabricaRocher;

import Interfaces.IOvoMedio;

public class OvoRocherMedio implements IOvoMedio {

    @Override
    public String infoOvoMedio() {
        return """
            ---------------------------------------------------
            OVO ROCHER MEDIO (255g)
            Cor \t Branco
            Marca \t Ferrero Rocher
            Altura do Produto (cm) \t 40
            Largura do produto (cm) \t 0.9
            Glúten \t Contém
            ---------------------------------------------------
            """;
    }
    
}
