public class Poster extends Item {

    public Poster(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
