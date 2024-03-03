package FabricaGaroto;
import Interfaces.IOvoPequeno;

public class OvoBatonLeite implements IOvoPequeno {

    @Override
    public String infoOvoPequeno() {
        return """
        ---------------------------------------------------
        OVO BATON AO LEITE (172g)
        Informação Nutricional (25g Cerca de 1/8 do ovo)
        Valor Energético \t 139kcal	
        Carboidratos \t 14g
        Açúcares Totais	 \t 14g
        Açúcares Adicionados (cm) \t 11g
        Proteínas \t 2g
        ---------------------------------------------------
        """;
    }
    
}
