package FabricaNestle;
import Interfaces.IOvoMedio;

public class OvoKitKat implements IOvoMedio {

    @Override
    public String infoOvoMedio() {
        return """
        ---------------------------------------------------
        OVO KIT KAT (227g)
        Informação Nutricional (25g 5/63 do ovo)
        Valor Energético \t 561kcal=139kj			
        Carboidratos \t 14g
        Açúcares Totais	 \t 13g
        Açúcares Adicionados (cm) \t 11g
        Proteínas \t 1,9g
        ---------------------------------------------------
        """;
    }
    
}
