public class Caneta extends Item {

    public Caneta(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
