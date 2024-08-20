public class AssinaturaPacote5Decorator extends AssinaturaDecorator {
    public AssinaturaPacote5Decorator(IServicoStream servicoStream) {
        super(servicoStream);
    }

    @Override
    public void assinarStreaming() {
        super.assinarStreaming();
        System.out.println("Pacote 5 - Compra com Cash Back: R$ 19,99.");

    }
}
