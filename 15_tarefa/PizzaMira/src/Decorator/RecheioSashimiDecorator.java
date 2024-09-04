package Decorator;

public class RecheioSashimiDecorator extends RecheioBaseDecorator {

    public RecheioSashimiDecorator(IRecheio wrapped) {
        super(wrapped);
    }

    @Override
    public void descreverRecheio() {
        super.descreverRecheio();
        System.out.println("Sashimi");
    }

    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String toString() {
        return "RecheioSashimiDecorator []";
    }
}
