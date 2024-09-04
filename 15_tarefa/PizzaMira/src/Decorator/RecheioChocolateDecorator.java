package Decorator;

public class RecheioChocolateDecorator extends RecheioBaseDecorator {
    public RecheioChocolateDecorator(IRecheio wrapped) {
        super(wrapped);
    }

    @Override
    public void descreverRecheio() {
        super.descreverRecheio();
        System.out.println("Chocolate");
    }

    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String toString() {
        return "RecheioChocolateDecorator []";
    }
    
}
