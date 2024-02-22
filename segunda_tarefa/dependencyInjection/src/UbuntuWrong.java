public class UbuntuWrong {
    // Essa classe viola o princípio da Inversão de Dependências. 
    // Ela depende das classes concretas CoolKeyboard e UltraWideMonitor. 
    // Será difícil adicionar um novo tipo de Keyboard e Monitor na classe Ubuntu,
    // pois ela depende de classes "concretas".
    CoolKeyboardWrong keyboard;
    UltraWideMonitorWrong monitor;

    public UbuntuWrong(CoolKeyboardWrong keyboard, UltraWideMonitorWrong monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}