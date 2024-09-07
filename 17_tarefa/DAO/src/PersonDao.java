import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PersonDao implements Dao<Person> {
    
    private List<Person> users = new ArrayList<>();
    
    public PersonDao() {
        users.add(new Person("Carlos", "000.000.00-11", "carlos@domain.com"));
        users.add(new Person("Maria", "000.000.00-12", "maria@domain.com"));
    }
    
    @Override
    public Optional<Person> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }
    
    @Override
    public List<Person> getAll() {
        return users;
    }
    
    @Override
    public void save(Person user) {
        users.add(user);
    }
    
    @Override
    public void update(Person user, String[] params) {
        user.setName(Objects.requireNonNull(
          params[0], "Nome não pode ser nulo."));
        user.setEmail(Objects.requireNonNull(
          params[1], "Email não pode ser nulo."));
    }
    
    @Override
    public void delete(Person user) {
      users.remove(user);
    }
}