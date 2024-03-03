package FabricaHersheys;

import Interfaces.IOvoMedio;

public class HersheysMedio implements IOvoMedio{

    @Override
    public String infoOvoMedio() {
        return """
            ---------------------------------------------------
            OVO HERSHEY'S (225g)
            Informação Nutricional (25g 1/6 de ovo)
            Valor Energético \t 121KCAL = 510KJ	
            Carboidratos \t 11
            Açúcares Totais	 \t 9,1
            Proteínas \t 1,9
            Sódio \t 0
            ---------------------------------------------------
            """;
    }
    
}
