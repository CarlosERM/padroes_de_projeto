public class UbuntuCorrect {
    // Essa classe implementa corretamenta o princípio da inversão de depêndencias. 
    // Agora UbuntuCorrect não depende de classes concretas, mas sim de interfaces. 
    // Caso seja necessário adicionar um novo Keyboard ou Monitor, posso implementá-los
    // com suas respectivas interfaces e adicioná-los neste construtor sem nenhum problema.
    IKeyboard keyboard;
    IMonitor monitor;

    public UbuntuCorrect(IKeyboard keyboard, IMonitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
