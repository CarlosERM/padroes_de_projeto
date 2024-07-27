public class DepositHandler extends TransactionHandler {

    @Override
    public boolean check(Account account1, double value, Account account2) {
        if (value > 0.0) {
            return true;
        }
        return false;
    }
}
