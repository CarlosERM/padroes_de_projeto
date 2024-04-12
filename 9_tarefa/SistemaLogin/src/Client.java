import java.util.Scanner;
import java.util.ArrayList;

public class Client {
    public static boolean isRobot(Scanner sc) {
        System.out.println("---------------------------------------");
        System.out.println("          VERIFICAÇÃO DE ROBÔ          ");
        System.out.println("---------------------------------------");

        String codigo = VerificadorBot.gerador_random();
        
        System.out.println("Digite o código " + codigo + " para provar que você não é um robô!" );
        String resp = sc.nextLine();

        return resp.equals(codigo);
    }

    public static void cadastrarUsuario(Scanner sc,  ArrayList<Usuario> usuariosCadastrados) {
        String nome, senha;
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("            CADASTRO DE USUARIO        ");
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Qual é o seu nome ?");
        nome = sc.nextLine();

        System.out.println("Qual vai ser a sua senha?");
        senha = sc.nextLine();

        try {
            usuariosCadastrados.add(new Usuario(nome, senha));
            System.out.println("O usuário foi cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao cadastrar o usuário!");

        }
    }

    public static void loginUsuario(Scanner sc,  ArrayList<Usuario> usuariosCadastrados) {
        String nome, senha;
        boolean login = false;
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("                 LOGIN                 ");
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Nome: ");
        nome = sc.nextLine();

        System.out.println("Senha:");
        senha = sc.nextLine();

        if (isRobot(sc)) {
            for (Usuario usuario : usuariosCadastrados) {
                if( usuario.nome.equals(nome) && usuario.senha.equals(senha) ) {
                    System.out.println(SistemaLogin.login(true, usuario).usuario);
                    login = true;
                }
            }

            if(!login) {
                System.out.println("Usuário ou senha incorretos!");
            }
        } else {
            System.out.println("Erro: Você é um robô!!!");
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
        Scanner sc = new Scanner(System.in);
        String resp;

        do {
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("         SISTEMA DE AUTENTICAÇÃO       ");
            System.out.println("---------------------------------------");
            System.out.println();

            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Logar");
            System.out.println("3 - Checar usuário logado");
            System.out.println("4 - Deslogar");
            System.out.println("5 - Sair");

            resp = sc.nextLine();

            switch (resp) {
                case "1":
                    cadastrarUsuario(sc, usuariosCadastrados);
                    break;
                case "2":
                    loginUsuario(sc, usuariosCadastrados);
                    break;
                case "3":
                    SistemaLogin.checkLogado();
                    break;
                case "4":
                    SistemaLogin.deslogar();
                    break;
                case "5":
                    System.out.println("Sair....");
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (!resp.equals("5"));
        sc.close();
    }
}
