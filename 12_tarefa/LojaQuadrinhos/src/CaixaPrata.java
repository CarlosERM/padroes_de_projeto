import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaixaPrata implements Caixa {
    int limit = 5;
    private final List<Caixa> children = new ArrayList<>(limit);

    public CaixaPrata(Caixa... caixas) {
        try {
            if(caixas.length <= limit) {
                children.addAll(Arrays.asList(caixas));
            } 
            else {
                throw new Error("Muita coisa.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double calculatePrice() {
        return children.stream().mapToDouble(Caixa::calculatePrice).sum();
    }

    @Override
    public String toString() {
        String caixaDescription = "CAIXA DE OURO\nQuantidade de Itens: " + children.size() + "\n" + "Preço total: " + calculatePrice() + "\n\n" + "ITENS:";
        for (Caixa child : children) {
            caixaDescription += child;
        }
        return caixaDescription;
    }
}
