package FabricaRocher;

import Interfaces.IOvoPequeno;

public class OvoRocherPequeno implements IOvoPequeno{

    @Override
    public String infoOvoPequeno() {
        return """
            ---------------------------------------------------
            OVO ROCHER PEQUENO (137g)
            Linha \t Ferrero Rocher
            Formato do ovo de páscoa \t Ovo, Bombons
            Formato de venda \t Unidade
            Conservação do produto \t Temperatura ambiente
            Sabor do chocolate \t Ao Leite
            ---------------------------------------------------
            """;
    }
    
}
