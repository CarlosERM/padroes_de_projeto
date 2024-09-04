package Decorator;

public abstract class RecheioBaseDecorator implements IRecheio {
    private final IRecheio wrapped;

    public RecheioBaseDecorator(IRecheio wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void descreverRecheio() {
        wrapped.descreverRecheio();
    }

    @Override
    public String toString() {
        return "RecheioBaseDecorator [wrapped=" + wrapped + ", getClass()=" + getClass() + "]";
    }
}
