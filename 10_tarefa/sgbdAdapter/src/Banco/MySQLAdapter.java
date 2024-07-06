package Banco;

public class MySQLAdapter extends Paradox {
    private MySQL mySql;

    public MySQLAdapter(MySQL mySql){
        this.mySql = mySql;
    }

    @Override
    public void autorizarUsuario(String usuario) {
        mySql.autorizarUsuario(usuario);
    }
}
