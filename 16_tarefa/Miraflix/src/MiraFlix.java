public class MiraFlix {
    private final NotificationService notificationService;

    public MiraFlix() {
        this.notificationService = new NotificationService();
    }

    public void newMovie(Category eventType) {
        notificationService.notifyy(eventType);
    }

    public void newSeries(Category eventType) {
        notificationService.notifyy(eventType);
    }

    public NotificationService getService() {
        return notificationService;
    }
}
