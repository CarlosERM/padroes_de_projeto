import java.util.Scanner;

public class App {
    private static Bank bank;

    private static void init() {
        bank = new Bank();
    
        bank.createAccount("pipoca123", 255.5);
        bank.createAccount("pipoca321", 355.5);

        TransactionHandler transactions = TransactionHandler.link(
            new DepositHandler(),
            new WithdrawHandler(),
            new TransferHandler()
        );

        bank.setTransaction(transactions);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String id, idDestino, resp;
        Double balance;
        init();
        do {
            System.out.println("---------------------------------------");
            System.out.println("          O que você quer fazer ?      ");
            System.out.println("---------------------------------------");
            System.out.println("1 - Depósito.");
            System.out.println("2 - Saque.");
            System.out.println("3 - Transferência.");
            System.out.println("4 - Desligar.");
            System.out.println("---------------------------------------");

            resp = sc.nextLine();
            
            switch (resp) {
                case "1":
                    System.out.println("ID da conta: ");
                    id = sc.nextLine();

                    System.out.println("Valor: ");
                    balance = sc.nextDouble();

                    bank.deposit(id, balance);
                    break;
                case "2":
                    System.out.println("ID da conta: ");
                    id = sc.nextLine();
                    
                    System.out.println("Valor: "); 
                    balance = sc.nextDouble();
                    bank.withdraw(id, balance);
                    break;
                case "3":
                    System.out.println("ID da conta de origem: ");
                    id = sc.nextLine();

                    System.out.println("Valor: ");
                    balance = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("ID da conta de destino: ");
                    idDestino = sc.nextLine();

                    bank.transfer(id, balance, idDestino);      
                    break;
            }
        } while (!resp.equals("4"));

        sc.close();
    }
}
