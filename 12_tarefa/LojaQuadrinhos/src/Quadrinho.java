
public class Quadrinho extends Item {

    public Quadrinho(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
