package Usuario;
import Banco.Paradox;

public abstract class Usuario {
    String nome;
    
    public abstract void conectarSGBD (Paradox sgbd);
}
