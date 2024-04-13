public class DatabaseAccessThread3 implements Runnable {
    @Override
    public void run() {
        DatabaseConnectionManager singleton = DatabaseConnectionManager.connectToDatabase("IFGoianoBase3");
        System.out.println(singleton.databaseName);
    }
}