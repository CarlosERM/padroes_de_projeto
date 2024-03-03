package FabricaLacta;
import Interfaces.IOvoGrande;

public class OvoBis implements IOvoGrande{

    @Override
    public String infoOvoGrande() {
       return """
            ---------------------------------------------------
            OVO BIS (318g)
            Informação Nutricional (25g 1/12 de ovo)
            Valor Energético \t 127kcal = 531 kj		
            Carboidratos \t 16	
            Açúcares Totais	 \t 15	
            Proteínas \t 0,9
            Sódio \t 29	
            ---------------------------------------------------
            """;
    }
    
}
