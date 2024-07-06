package Usuario;
import Banco.Paradox;

public class UsuarioGratuito extends Usuario {
    public UsuarioGratuito(String nome) {
        this.nome = nome;
    }
    @Override
    public void conectarSGBD(Paradox sgbd) {
        System.err.println("Conectando......");
        sgbd.autorizarUsuario((this.nome));
        System.err.println("SUCESSO!!!");
    }
    
}
