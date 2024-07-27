public abstract class ChainMiddleware {
    private ChainMiddleware proxima;

    public static ChainMiddleware link(ChainMiddleware primeira, ChainMiddleware... cadeia) {
        ChainMiddleware head = primeira;

        for(ChainMiddleware proximaNaCadeia: cadeia) {
            head.proxima = proximaNaCadeia;
            head = proximaNaCadeia;
        }

        return primeira;
    }
    
    public abstract boolean check(String email, String senha);

    protected boolean checkNext(String email, String senha) {
        if(proxima == null) {
            return true;
        }
        return proxima.check(email, senha);
    }
}
