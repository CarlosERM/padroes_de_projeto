public class BirdWrong implements ILivingBeingWrong{
    // A classe Bird está incorreta porque 3 dos métodos implementados estão vazios. 
    // Bird é forçada a implementar os métodos talk e think, e um Bird não fala e nem pensa. 
    // Isso viola o princípio da Segregação de Interfaces.
    @Override
    public void talk(String msg) {}

    @Override
    public void think(String think) {}

    @Override
    public void walk() {
        System.out.println("I am walking...");
    }

    @Override
    public void fly() {
        System.out.println("I am flying....");
    }           
}
