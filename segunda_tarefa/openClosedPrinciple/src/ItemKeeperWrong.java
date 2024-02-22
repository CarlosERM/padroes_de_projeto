public class ItemKeeperWrong {
    // Esta classe é incorreta porque a partir do momento que 
    // ouver novos locais para o Jogador guardar os seus items, 
    // o desenvolvedor terá de adicionar uma nova funcionalidade.

    public void putOnInventory(String item) {
        System.err.println("Placing " + item + " on the Inventory.");
    }
    // Isso aqui não é bom. Quanto mais lugares for possível colocar
    //  items, mais funcionalidades essa classe terá.
    public void putOnChest(String item) {
        System.err.println("Placing " + item + " on the Chest.");
    }
    public void putOnBag(String item) {
        System.err.println("Placing " + item + " on the Bag.");

    }
}
