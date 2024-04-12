public class SistemaLogin {
    private static SistemaLogin instancia;
    public Usuario usuario;
    public boolean isLogado;

    private SistemaLogin(boolean isLogado, Usuario usuario) {
        this.isLogado = isLogado;
        this.usuario = usuario;
    }

    public static SistemaLogin login(boolean isLogado, Usuario usuario) {
        if (instancia == null) {
            instancia = new SistemaLogin(isLogado, usuario);
            System.out.println("O login foi realizado com sucesso!");
        }
        return instancia;
    }

    public static void checkLogado() {
        if(instancia != null) {
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("             USUÁRIO LOGADO            ");
            System.out.println("---------------------------------------");
            System.out.println();
            System.out.println(instancia.usuario);
        } else {
            System.out.println("Nenhum usuário está logado!");
        }
    }

    public static void deslogar() {
        if(instancia == null) {
            System.out.println("Não existe nenhum usuário logado!!!");
        } else {
            instancia = null;
            System.out.println("O usuário foi deslogado com sucesso!");
        }
    }
}
