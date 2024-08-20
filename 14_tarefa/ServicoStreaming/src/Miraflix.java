public class Miraflix implements IServicoStream {
    @Override
    public void assinarStreaming() {
        System.err.println("Assinado com Sucesso!");
        System.out.println("Sua assinatura possui: ");
        System.out.println("Assinatura Base - Assistir vídeos num único dispositivo: R$9,99.");
    }
}
