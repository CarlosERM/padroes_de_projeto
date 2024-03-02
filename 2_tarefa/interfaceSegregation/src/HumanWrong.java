public class HumanWrong implements ILivingBeingWrong {
    // A classe Human está incorreta porque um dos métodos implementados está vazio. 
    // Isso porque Human é forçada a implementar o método fly que ela não consegue fazer. 
    // Isso viola o princípio da Segregação de Interfaces.
    @Override
    public void talk(String msg) {
        System.err.println("I am a human and i talk: " + msg);
    }

    @Override
    public void think(String think) {
        System.err.println("I am a human and i think: " + think);
    }

    @Override
    public void walk() {
        System.err.println("I am walking....");
    }

    @Override
    public void fly() {}           
}
