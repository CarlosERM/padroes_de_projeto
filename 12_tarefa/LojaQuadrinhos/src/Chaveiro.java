public class Chaveiro extends Item{

    public Chaveiro(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
