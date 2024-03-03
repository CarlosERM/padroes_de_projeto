package FabricaHersheys;

import Interfaces.IOvoGrande;

public class HersheysGrande implements IOvoGrande {

    @Override
    public String infoOvoGrande() {
        return """
            ---------------------------------------------------
            OVO HERSHEY'S (336g)
            Informação Nutricional (25g 1/6 de ovo)
            Valor Energético \t 131kcal = 550kj	
            Carboidratos \t 14g
            Açúcares Totais	 \t 14g
            Proteínas \t 1,6g	
            Sódio \t 24mg
            ---------------------------------------------------
            """;
    }
    
}
