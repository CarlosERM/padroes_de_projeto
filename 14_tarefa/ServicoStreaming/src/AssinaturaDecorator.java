public abstract class AssinaturaDecorator implements IServicoStream {
    private IServicoStream servicoStream;

    public AssinaturaDecorator(IServicoStream servicoStream) {
        this.servicoStream = servicoStream;
    }

    @Override
    public void assinarStreaming() {
        this.servicoStream.assinarStreaming();
    }
}
