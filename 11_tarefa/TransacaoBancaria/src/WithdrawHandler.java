public class WithdrawHandler extends TransactionHandler{

    @Override
    public boolean check(Account account1, double value, Account account2) {
        if (value <= account1.balance) {
            return true;
        }
        return false;
    }
}
