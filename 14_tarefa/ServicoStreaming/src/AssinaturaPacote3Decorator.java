public class AssinaturaPacote3Decorator extends AssinaturaDecorator {
    public AssinaturaPacote3Decorator(IServicoStream servicoStream) {
        super(servicoStream);
    }

    @Override
    public void assinarStreaming() {
        super.assinarStreaming();
        System.out.println("Pacote 3 - Caixa surpresa com produtos relacionados a filmes e séries R$29,99.");
    }
}
