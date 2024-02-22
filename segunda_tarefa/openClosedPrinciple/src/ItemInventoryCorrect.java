public class ItemInventoryCorrect implements IItemKeeperCorrect{
    @Override
    public void put(String item) {
        System.err.println("Placing " + item + " on the Inventory.");
    }
}
