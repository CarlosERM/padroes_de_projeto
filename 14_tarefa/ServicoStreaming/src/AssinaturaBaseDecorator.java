public class AssinaturaBaseDecorator extends AssinaturaDecorator {
    public AssinaturaBaseDecorator(IServicoStream servicoStream) {
        super(servicoStream);
    }

    @Override
    public void assinarStreaming() {
        super.assinarStreaming();
    }
}
