public class DatabaseAccessThread4 implements Runnable {
    @Override
    public void run() {
        DatabaseConnectionManager singleton = DatabaseConnectionManager.connectToDatabase("IFGoianoBase4");
        System.out.println(singleton.databaseName);
    }
}
