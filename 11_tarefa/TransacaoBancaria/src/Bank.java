import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();
    private TransactionHandler transaction;

    public void createAccount(String id, double balance) {
        Account newAccount = new Account(id, balance);
        accounts.put(newAccount.id, newAccount);
    }

    public void setTransaction(TransactionHandler transaction) {
        this.transaction = transaction;
    }

    public boolean deposit(String id, double balance) {
        Account account = accounts.get(id);
        if (transaction.check(account, balance, null)) {
            account.balance += balance;
            System.out.println("DEPÓSITO CONCLUÍDO");
            System.out.println("Conta: " + account.balance);
            System.out.println("VALOR DEPOSITADO: " + balance);
            return true;
        }
        return false;
    }

    public boolean withdraw(String id, double balance) {
        Account account = accounts.get(id);

        if (transaction.check(account, balance, null)) {
            account.balance -= balance;
            System.out.println("SAQUE CONCLUÍDO");
            System.out.println("Conta 1: " + account.balance);
            System.out.println("VALOR SACADO: " + balance);

            return true;
        }
        return false;
    }

    public boolean transfer(String id1, double balance, String id2) {
        Account account1 = accounts.get(id1);
        Account account2 = accounts.get(id2);

        if (transaction.check(account1, balance, account2)) {
            account1.balance -= balance;
            account2.balance += balance;
            System.out.println("TRANSFERÊNCIA CONCLUÍDA");
            System.out.println("Conta 1: " + account1.balance);
            System.out.println("Valor transferido: " + balance);
            System.out.println("Conta 2: " + account2.balance);
            return true;
        }
        return false;
    }
}