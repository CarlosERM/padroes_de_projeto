package FabricaRocher;

import Interfaces.IOvoGrande;

public class OvoRocherGrande implements IOvoGrande {

    @Override
    public String infoOvoGrande() {
        return """
            ---------------------------------------------------
            OVO ROCHER GRANDE (336g)
            Marca \t Ferrero Rocher
            Dimensões da embalagem	 \t 25 x 20 x 15 cm; 400 g
            ASIN \t B086MKYXQ8
            Glúten \t Contém
            Tipo de Chocolate \t Ao leite
            ---------------------------------------------------
            """;
    }
    
}
