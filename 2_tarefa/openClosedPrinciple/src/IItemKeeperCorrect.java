interface IItemKeeperCorrect {
    // Essa é a forma correta de lidar com esse problema. 
    // Ao criar uma interface que possui o método abstrato
    // put, permito que o comportamento de colocar itens
    // dentro de outros objetos seja extensível. Isso impede
    // a adição de novas funcionalidades numa classe que já está funcionando.
    public void put(String item);
}
