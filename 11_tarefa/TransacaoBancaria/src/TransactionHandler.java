public abstract class TransactionHandler {
    private TransactionHandler next;

    public static TransactionHandler link(TransactionHandler first, TransactionHandler... chain) {
        TransactionHandler head = first;

        for (TransactionHandler nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    public abstract boolean check(Account account1, double value, Account account2);

    protected boolean checkNext(Account account1, double value, Account account2) {
        if (next == null) {
            return true;
        }

        return next.check(account1, value, account2);
    }
}
