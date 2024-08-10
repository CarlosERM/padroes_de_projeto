public class Camiseta extends Item {
    public Camiseta(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
