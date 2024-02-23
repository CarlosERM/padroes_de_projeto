public class NorseMythosFactory implements IMythosFactory{

    @Override
    public IGod createGod() {
        return new Thor();
    }

    @Override
    public IMonster createMonster() {
        return new Jormungard();
    }

    @Override
    public IDemiGod createDemiGod() {
        return new Sleipnir();
    }
    
}
