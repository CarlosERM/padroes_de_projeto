import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final Map<Category, List<UsuarioListener>> customers;
    
    public NotificationService() {
        this.customers = new HashMap<>();
        Arrays.stream(Category.values()).forEach(
            event -> customers.put(
                event, 
                new ArrayList<>()
            )
        );
    }

    public void subscribe(Category eventType, UsuarioListener listener) {
        this.customers.get(eventType).add(listener);
    }

    public void unsubscribe(Category eventType, UsuarioListener listener) {
        this.customers.get(eventType).remove(listener);
    }

    public void notifyy(Category eventType) {
        this.customers.get(eventType).forEach(listener -> listener.update(eventType));
    }
}
