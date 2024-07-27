public class DepositHandler extends TransactionHandler {

    @Override
    public boolean check(Account account1, double value, Account account2) {
        if (value > 0.0) {
            return checkNext(account1, value, account2);
        }
        return false;
    }
}
