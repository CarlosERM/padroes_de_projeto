package Banco;

public class FirebirdAdapter extends Paradox {
    private Firebird firebird;

    public FirebirdAdapter(Firebird firebird){
        this.firebird = firebird;
    }
    @Override
    public void autorizarUsuario(String usuario) {
        firebird.autorizarUsuario(usuario);
    }
}
