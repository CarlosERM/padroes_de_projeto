public class GreekMythosFactory implements IMythosFactory{

    @Override
    public IGod createGod() {
        return new Zeus();
    }

    @Override
    public IMonster createMonster() {
        return new Minotaurus();
    }

    @Override
    public IDemiGod createDemiGod() {
        return new Hercules();
    }
    
}
