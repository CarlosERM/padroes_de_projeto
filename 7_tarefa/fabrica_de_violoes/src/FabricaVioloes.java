import java.util.HashMap;
import java.util.Map;

public class FabricaVioloes {
    private Map<String, ViolaoProto> estoque = new HashMap();

    public void fabricarEstoqueViolao() {
        // -------------------------------------------------------------------------------------
        ViolaoProto violaoClassico = new Violao();
        violaoClassico.nome = "Violão Clássico";
        violaoClassico.qtdCorda = 6;
        violaoClassico.tipoCorda = "Nylon";
        violaoClassico.descricao = """
            O violão clássico é um modelo acústico e funciona com seis cordas 
            (na maioria das vezes, feitas de nylon). Além da facilidade em encontrar
             esse modelo, ele possui um custo mais baixo quando comparado aos outros 
             tipos, e também é indicado para iniciantes graças à sua leveza e maciez.
        """;

        estoque.put("Violão Clássico", violaoClassico);
        // -------------------------------------------------------------------------------------
        ViolaoProto violaoFolk = new Violao();
        violaoFolk.nome = "Violão Folk";
        violaoFolk.qtdCorda = 6;
        violaoFolk.tipoCorda = "Aço";
        violaoFolk.descricao = """
            Com o corpo maior e mais “acinturado”, os violões do tipo folk também são
             bastante populares entre os músicos. A maioria dos modelos desse tipo de
              violão funciona com a utilização de cordas de aço, podendo ser elétricos
               ou eletroacústicos. Esse tipo de violão é o mais indicado para gêneros 
               como pop e rock, já que gera um som mais encorpado, com timbre diferenciado.
        """;
        estoque.put("Violão Folk", violaoFolk);
        // -------------------------------------------------------------------------------------
        ViolaoProto violaoFlat = new Violao();
        violaoFlat.nome = "Violão Flat";
        violaoFlat.qtdCorda = 6;
        violaoFlat.tipoCorda = "Nylon";
        violaoFlat.descricao = """
            A palavra flat, do inglês, pode significar “plano” ou “liso”. É justamente essa a 
            principal característica desse tipo de violão: sua caixa acústica é bastante fina! 
            O violão flet é muito utilizado por músicos profissionais e na maioria dos casos é 
            tocado com cordas de nylon. O timbre gerado por esse tipo de violão é mais suave. 
            Vale lembrar que, por ser encontrado quase sempre em modelos elétricos, precisa de 
            amplificação.
        """;
        estoque.put("Violão Flat", violaoFlat);
        // -------------------------------------------------------------------------------------
        ViolaoProto violaoJumbo = new Violao();
        violaoJumbo.nome = "Violão Jumbo";
        violaoJumbo.qtdCorda = 6;
        violaoJumbo.tipoCorda = "Aço";
        violaoJumbo.descricao = """
            O violão jumbo ficou famoso nas mãos de Elvis Presley, mas, apesar de ser bem parecido
             com o tipo clássico, a grande diferença está em seu corpo mais largo e na base mais 
             arredondada. É mais fácil de encontrar modelos eletroacústicos e com cordas de aço. O 
             som gerado pelo violão jumbo é mais grave e encorpado.
        """;
        estoque.put("Violão Jumbo", violaoJumbo);
        // -------------------------------------------------------------------------------------
        ViolaoProto violao7cordas = new Violao();
        violao7cordas.nome = "Violão 7 Cordas";
        violao7cordas.qtdCorda = 7;
        violao7cordas.tipoCorda = "Aço";
        violao7cordas.descricao = """
            Conhecido como o violão brasileiro, já que é indicado para acompanhar gêneros como o choro e o
            samba, esse tipo de violão não apresenta diferenças na sua estrutura quando comparado ao violão 
            clássico. Porém seu diferencial está na sétima corda, que costuma ser afinada de maneira mais 
            grave que as outras seis. Isso exige um conhecimento do músico que for tocá-lo.
        """;
        estoque.put("Violão 7 Cordas", violao7cordas);
        // -------------------------------------------------------------------------------------
        ViolaoProto violao12cordas = new Violao();
        violao12cordas.nome = "Violão 12 Cordas";
        violao12cordas.qtdCorda = 12;
        violao12cordas.tipoCorda = "Aço";
        violao12cordas.descricao = """
            Outro tipo de violão que também não apresenta diferenças na estrutura, o violão 12 cordas traz o 
            dobro de cordas do que o clássico. Essas são agrupadas em duplas (metade delas afinadas com uma 
            oitava acima). Esse tipo apresenta ressonância plena e exige técnica e prática para poder pressionar
            duas cordas simultaneamente.
        """;
        estoque.put("Violão 12 Cordas", violao12cordas);
        // -------------------------------------------------------------------------------------
        ViolaoProto violaoZero = new Violao();
        violaoZero.nome = "Violões Zero";
        violaoZero.qtdCorda = 6;
        violaoZero.tipoCorda = "Aço";
        violaoZero.descricao = """
             Esses tipos de violões são categorizados como Parlor, com estruturas menores e sendo mais 
            indicado para uso casual e não tanto profissional. Entre os três tipos, o violão zero é o 
            menor, com uma estrutura confortável para tocar por bastante tempo. Já o duplo zero é um 
            pouco maior, apresentando uma boa sonoridade e sendo indicado para técnicas de fingerstyle. 
            O triplo zero possui tamanho intermediário e gera um timbre mais peculiar.
        """;
        estoque.put("Violões Zero", violaoZero);
        // -------------------------------------------------------------------------------------
        ViolaoProto violaoDuploZero = new Violao();
        violaoDuploZero.nome = "Violão Duplo Zero";
        violaoDuploZero.qtdCorda = 6;
        violaoDuploZero.tipoCorda = "Aço";
        violaoDuploZero.descricao = """
            Esses tipos de violões são categorizados como Parlor, com estruturas menores e sendo mais 
            indicado para uso casual e não tanto profissional. Entre os três tipos, o violão zero é o 
            menor, com uma estrutura confortável para tocar por bastante tempo. Já o duplo zero é um 
            pouco maior, apresentando uma boa sonoridade e sendo indicado para técnicas de fingerstyle. 
            O triplo zero possui tamanho intermediário e gera um timbre mais peculiar.
         """;
         estoque.put("Violão Duplo Zero", violaoDuploZero);
         // -------------------------------------------------------------------------------------
        ViolaoProto violaoTriploZero = new Violao();
        violaoTriploZero.nome = "Violão Triplo Zero";
        violaoTriploZero.qtdCorda = 6;
        violaoTriploZero.tipoCorda = "Aço";
        violaoTriploZero.descricao = """
           Esses tipos de violões são categorizados como Parlor, com estruturas menores e sendo mais 
            indicado para uso casual e não tanto profissional. Entre os três tipos, o violão zero é o 
            menor, com uma estrutura confortável para tocar por bastante tempo. Já o duplo zero é um 
            pouco maior, apresentando uma boa sonoridade e sendo indicado para técnicas de fingerstyle. 
            O triplo zero possui tamanho intermediário e gera um timbre mais peculiar.
         """;
         estoque.put("Violão Triplo Zero", violaoTriploZero);
        // -------------------------------------------------------------------------------------
    }

    public ViolaoProto put(String key, ViolaoProto violao) {
        estoque.put(key, violao);
        return violao;
    }

    public ViolaoProto get(String key) {
        return estoque.get(key).clone();
    }
}
