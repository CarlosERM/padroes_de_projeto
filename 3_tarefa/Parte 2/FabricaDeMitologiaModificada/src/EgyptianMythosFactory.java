public class EgyptianMythosFactory implements IMythosFactory {

    @Override
    public IGod createGod() {
        return new Set();
    }

    @Override
    public IMonster createMonster() {
        return new Sphinx();
    }

    @Override
    public IDemiGod createDemiGod() {
        return new Imhotep();
    }
}