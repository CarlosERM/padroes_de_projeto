package AbstractFactory;

public class CocaCula extends AbstractDrink {
    String id;

    public CocaCula(String id) {
        this.id = id;
    }
    
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void descreverRecheio() {
        System.out.println("Coca Cula");
    }
}
