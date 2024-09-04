package AbstractFactory;

public class Pizza extends AbstractPizza {
    String id;

    public Pizza(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void descreverRecheio() {
        System.out.println("Pizza.");;
    }
}
