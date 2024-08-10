public class Miniatura extends Item {

    public Miniatura(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
