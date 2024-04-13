public class DatabaseAccessThread1 implements Runnable {
    @Override
    public void run() {
        DatabaseConnectionManager singleton = DatabaseConnectionManager.connectToDatabase("IFGoianoBase1");
        System.out.println(singleton.databaseName);
    }
}