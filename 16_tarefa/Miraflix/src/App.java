public class App {
    public static void main(String[] args) throws Exception {
        MiraFlix store = new MiraFlix();
        NotificationService notificationService = store.getService();

        // Criando os listeners.
        UsuarioListener listener1 = new UsuarioListener("1");
        UsuarioListener listener2 = new UsuarioListener("2");
        UsuarioListener listener3 = new UsuarioListener("3");
        UsuarioListener listener4 = new UsuarioListener("4");
        UsuarioListener listener5 = new UsuarioListener("5");

        // Cadastrando os listeners em suas respectivas categorias.
        notificationService.subscribe(Category.ACAO, listener1);
        notificationService.subscribe(Category.ANIME, listener2);
        notificationService.subscribe(Category.COMEDIA, listener3);
        notificationService.subscribe(Category.FICCAO_CIENTIFICA, listener4);
        notificationService.subscribe(Category.TERROR, listener5);

        // Notificando cada listener cadastrado nestas categorias:
        store.newMovie(Category.ACAO);
        store.newSeries(Category.ANIME);
        store.newSeries(Category.COMEDIA);
        store.newSeries(Category.FICCAO_CIENTIFICA);
        store.newSeries(Category.TERROR);

        // Agora o listener 5 não receberá mais notificações de filmes de terror.
        notificationService.unsubscribe(Category.TERROR, listener5);
        store.newSeries(Category.TERROR);

    }
}
