public class DatabaseAccessThread2 implements Runnable {
    @Override
    public void run() {
        DatabaseConnectionManager singleton = DatabaseConnectionManager.connectToDatabase("IFGoianoBase2");
        System.out.println(singleton.databaseName);
    }
}
