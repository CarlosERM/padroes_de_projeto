public class AssinaturaPacote4Decorator extends AssinaturaDecorator {
    public AssinaturaPacote4Decorator(IServicoStream servicoStream) {
        super(servicoStream);
    }

    @Override
    public void assinarStreaming() {
        super.assinarStreaming();
        System.out.println("Pacote 4 - Caixa surpresa com produtos relacionados a filmes e séries: R$29,99.");

    }
}
