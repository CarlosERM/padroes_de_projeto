package Usuario;

import Banco.Paradox;

public class UsuarioBasico extends Usuario {
    public UsuarioBasico(String nome) {
        this.nome = nome;
    }
    @Override
    public void conectarSGBD(Paradox sgbd) {
        System.err.println("Conectando......");
        sgbd.autorizarUsuario((this.nome));
        System.err.println("SUCESSO!!!");
    }
    
}
