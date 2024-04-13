public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Se aparecer o mesmo valor do Banco de Dados, o Singleton foi reusado." + "\n" +
        "Se diferentes valores aparecerem, isso significa que está errado." + "\n\n" +
        "Resultado:" + "\n");
        
        Thread thread1 = new Thread(new DatabaseAccessThread1());
        Thread thread2 = new Thread(new DatabaseAccessThread2());
        Thread thread3 = new Thread(new DatabaseAccessThread3());
        Thread thread4 = new Thread(new DatabaseAccessThread4());
        Thread thread5 = new Thread(new DatabaseAccessThread5());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
