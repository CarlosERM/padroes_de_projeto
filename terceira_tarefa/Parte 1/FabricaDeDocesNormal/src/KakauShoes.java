public class KakauShoes implements ICandyFactory{

    @Override
    public INormalCandy normalCandy() {
        return new Chocolate();
    }

    @Override
    public ICrazyCandy crazyCandy() {
        return new SaltyCaramel();
    }
}
