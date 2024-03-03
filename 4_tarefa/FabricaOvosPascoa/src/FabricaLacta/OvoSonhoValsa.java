package FabricaLacta;
import Interfaces.IOvoGrande;

public class OvoSonhoValsa implements IOvoGrande {

    @Override
    public String infoOvoGrande() {
        return """
            ---------------------------------------------------
            OVO SONHO DE VALSA (277g)
            Informação Nutricional (25g 1/9 de ovo)
            Valor Energético \t 131kcal = 545 kj	
            Carboidratos \t 14
            Açúcares Totais	 \t 13
            Proteínas \t 1,5
            Sódio \t 13
            ---------------------------------------------------
            """;
    }
    
}
