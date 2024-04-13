public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instancia;
    public String databaseName;

    private DatabaseConnectionManager(String databaseName) {
        this.databaseName = databaseName;
    }

    public static DatabaseConnectionManager connectToDatabase(String value) {
        DatabaseConnectionManager resultado = instancia;

        if(resultado != null) {
            return resultado;
        }

        synchronized(DatabaseConnectionManager.class) {
            if (instancia == null) {
                instancia = new DatabaseConnectionManager(value);
            }

            return instancia;
        }
    }
}