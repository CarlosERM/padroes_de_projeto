public class TransferHandler extends TransactionHandler {

    @Override
    public boolean check(Account account1, double value, Account account2) {
        if (account1.balance >= value) {
            return true;
        }
        return false;
    }
}
