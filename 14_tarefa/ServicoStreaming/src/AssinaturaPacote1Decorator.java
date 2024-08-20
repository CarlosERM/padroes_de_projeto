public class AssinaturaPacote1Decorator extends AssinaturaDecorator {
    public AssinaturaPacote1Decorator(IServicoStream servicoStream) {
        super(servicoStream);
    }

    @Override
    public void assinarStreaming() {
        super.assinarStreaming();
        System.out.println("Pacote 1 -  Assistir vídeos em vários dispositivos: R$19,99.");

    }
}
