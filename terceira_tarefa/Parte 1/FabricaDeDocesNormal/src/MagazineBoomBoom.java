public class MagazineBoomBoom implements ICandyFactory {

    @Override
    public INormalCandy normalCandy() {
        return new MilkCandy();
    }

    @Override
    public ICrazyCandy crazyCandy() {
        return new SweetBeans();
    }
}
