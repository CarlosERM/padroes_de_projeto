import Banco.Firebird;
import Banco.FirebirdAdapter;
import Banco.MySQL;
import Banco.MySQLAdapter;
import Banco.Paradox;
import Usuario.UsuarioBasico;
import Usuario.UsuarioGratuito;
import Usuario.UsuarioUltimate;

public class App {
    public static void main(String[] args) throws Exception {

        UsuarioGratuito usuarioGratuito = new UsuarioGratuito("Carlos");
        UsuarioBasico usuarioBasico = new UsuarioBasico("Jéssica");
        UsuarioUltimate usuarioUltimate = new UsuarioUltimate("Jesmmer");

        Paradox paradox = new Paradox();
        Firebird firebird = new Firebird();
        MySQL mySQL = new MySQL();

        FirebirdAdapter firebirdAdapter = new FirebirdAdapter(firebird);
        MySQLAdapter mySQLAdapter = new MySQLAdapter(mySQL);


        usuarioGratuito.conectarSGBD(paradox);
        usuarioBasico.conectarSGBD(firebirdAdapter);
        usuarioUltimate.conectarSGBD(mySQLAdapter);
    }
}
