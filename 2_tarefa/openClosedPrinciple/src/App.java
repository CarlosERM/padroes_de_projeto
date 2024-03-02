public class App {
    // entidades (classes, funções, módulos, etc.) devem ser abertas
    //  para extensão, mas fechadas para modificação.
    public static void main(String[] args) throws Exception {
        ItemKeeperWrong itemKeeperWrong = new ItemKeeperWrong();
        
        ItemBagCorrect itemBagCorrect = new ItemBagCorrect();
        ItemChestCorrect itemChestCorrect = new ItemChestCorrect();
        ItemInventoryCorrect itemInventoryCorrect = new ItemInventoryCorrect();

        System.err.println();
        System.err.println("WRONG IMPLEMENTATION");
        System.err.println();
        itemKeeperWrong.putOnBag("Espada de Ouro");
        itemKeeperWrong.putOnChest("Pedra Brilhante");
        itemKeeperWrong.putOnInventory("Alho");

        System.err.println();
        System.err.println("CORRECT IMPLEMENTATION");
        System.err.println();
        itemBagCorrect.put("Abacate");
        itemChestCorrect.put("Pipoca");
        itemInventoryCorrect.put("Doce de Leite");

    }
}
