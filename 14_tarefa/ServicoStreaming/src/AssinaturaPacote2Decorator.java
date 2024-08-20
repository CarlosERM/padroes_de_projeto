public class AssinaturaPacote2Decorator extends AssinaturaDecorator {
    public AssinaturaPacote2Decorator(IServicoStream servicoStream) {
        super(servicoStream);
    }

    @Override
    public void assinarStreaming() {
        super.assinarStreaming();
        System.out.println("Pacote 2 -  Frete Grátis em produtos: R$9,99.");
    }
}
