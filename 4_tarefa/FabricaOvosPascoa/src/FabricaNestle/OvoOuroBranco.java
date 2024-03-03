package FabricaNestle;
import Interfaces.IOvoGrande;

public class OvoOuroBranco implements IOvoGrande {

    @Override
    public String infoOvoGrande() {
        return """
            ---------------------------------------------------
            OVO OURO BRANCO (359g)
            Informação Nutricional (25g 1/13 de ovo)
            Valor Energético \t 131kcal = 548kj			
            Carboidratos \t 15	
            Açúcares Totais	 \t 15	
            Proteínas \t 1,2
            Sódio \t 27	
            ---------------------------------------------------
            """;
    }
    
}
