public class DatabaseAccessThread5 implements Runnable {
    @Override
    public void run() {
        DatabaseConnectionManager singleton = DatabaseConnectionManager.connectToDatabase("IFGoianoBase5");
        System.out.println(singleton.databaseName);
    }
}
