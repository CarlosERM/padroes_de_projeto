public class Adesivo extends Item {
    public Adesivo(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
