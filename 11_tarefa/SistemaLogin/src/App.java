import java.util.Scanner;

public class App {
    // private static Server server;
    private static Servidor servidor;

    private static void init() {
        servidor = new Servidor();

        servidor.registrar("carlos@gmail.com", "Pipoca@578");
        servidor.registrar("fernando@gmail.com", "Pipoca@571");
        servidor.registrar("maria@gmail.com", "Pipoca@931");

        ChainMiddleware chainMiddleware = ChainMiddleware.link(
            new UsuarioCadastradoChainMiddleware(servidor), 
            new SenhaMaiusculaChainMiddleware(),
            new SenhaMinusculaChainMiddleware(),
            new SenhaCaractereEspecialChainMiddleware(),
            new SenhaNumeroChainMiddleware(),
            // Consecutivo.
            new Senha8CaractereChainMiddleware(),
            new Senha16CaractereChainMiddleware()
        );

        servidor.setChainMiddleware(chainMiddleware);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean sucesso;

        init();

        do {
            System.out.print("Seu email: ");
            String email = sc.nextLine();

            System.out.print("Sua senha: ");
            String password = sc.nextLine();

            sucesso = servidor.login(email, password);
        } while (!sucesso);

        sc.close();
    }
}
