public class App {
    // Dependa de abstrações e não de implementações.
    public static void main(String[] args) throws Exception {
        // A classe UbuntuWrong só aceita as classes concretas CoolKeyboardWrong e
        //  UltraWideMonitorWrong.
        CoolKeyboardWrong keyboard = new CoolKeyboardWrong();
        UltraWideMonitorWrong monitor = new UltraWideMonitorWrong();
        UbuntuWrong ubuntu = new UbuntuWrong(keyboard, monitor);

        // A classe CoolKeyboardCorrect aceita qualquer clase que implemente
        // as interfaces IKeyboard e IMonitor.
        CoolKeyboardCorrect keyboard2 = new CoolKeyboardCorrect();
        UltraWideMonitorCorrect monitor2 = new UltraWideMonitorCorrect();
        UbuntuCorrect ubuntu2 = new UbuntuCorrect(keyboard2, monitor2);
    }
}
