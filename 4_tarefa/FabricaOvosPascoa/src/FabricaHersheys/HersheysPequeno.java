package FabricaHersheys;

import Interfaces.IOvoPequeno;

public class HersheysPequeno implements IOvoPequeno {

    @Override
    public String infoOvoPequeno() {
        return """
            ---------------------------------------------------
            OVO HERSHEY'S (137g)
            Informação Nutricional (25g 1/6 de ovo)
            Valor Energético \t 132kcal = 552kj
            Carboidratos \t 9,2
            Açúcares Totais	 \t 7,2
            Proteínas \t 7,2
            Sódio \t 5,3
            ---------------------------------------------------
            """;
    }
    
}
