public class HumanCorrect implements IInteligentBeingCorrect{
    // Todos os métodos são utilizados.
    @Override
    public void talk(String msg) {
        System.out.println("I am a human and i talk: " + msg);
    }

    @Override
    public void think(String think) {
        System.out.println("I am a human and i think: " + think);
    }

    @Override
    public void walk() {
        System.out.println("I am walking....");
    } 
}
