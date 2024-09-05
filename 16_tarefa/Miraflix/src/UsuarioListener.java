public class UsuarioListener {
    private final String nome;
    
    public UsuarioListener(String nome) {
        this.nome = nome;
    }

    public void update(Category eventType) {
        System.out.println("Oi, " + nome + " um novo filme de " + eventType + " foi adicionado: " );
    }
}
