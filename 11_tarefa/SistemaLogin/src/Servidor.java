import java.util.HashMap;
import java.util.Map;

public class Servidor {
    private Map<String, String> usuarios = new HashMap<>();
    private ChainMiddleware chainMiddleware;

    public void setChainMiddleware(ChainMiddleware chainMiddleware) {
        this.chainMiddleware = chainMiddleware;
    }

    public boolean login(String email, String senha) {
        if(chainMiddleware.check(email, senha)) {
            System.out.println("Usuário logado com sucesso!!!!");
            return true;
        }

        return false;
    }

    public void registrar(String email, String password) {
        usuarios.put(email, password);
    }

    public boolean temEmail(String email) {
        return usuarios.containsKey(email);
    }

    public boolean validaSenha(String email, String senha) {
        return usuarios.get(email).equals(senha);
    }

}
