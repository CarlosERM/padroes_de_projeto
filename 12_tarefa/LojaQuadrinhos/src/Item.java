public abstract class Item implements Caixa {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "Nome: " + this.name + "\n" + "Preço: " + this.price + "\n";
    }
}
