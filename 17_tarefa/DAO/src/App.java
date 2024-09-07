import java.util.Optional;

public class App {
    private static Dao<Person> personDao;
    public static void main(String[] args) {
        personDao = new PersonDao();
        
        Person person1 = getPerson(0);

        personDao.update(person1, new String[]{"Pipoca", "pipoca@gmail.com"});
        
        Person person2 = getPerson(1);
        
        personDao.delete(person2);

        personDao.save(new Person("Mamona", "0asiu9as098", "mamona@gmail.com"));
        
        personDao.getAll().forEach(person -> {
            System.out.println("-------------------------");
            System.out.println(person.getName());
            System.out.println(person.getEmail());
            System.out.println(person.getCpf());
            System.out.println("-------------------------");
        });
    }

    private static Person getPerson(long id) {
        Optional<Person> person = personDao.get(id);
        
        return person.orElseGet(
          () -> new Person("Usuario nao existe.", "Nenhum cpf", "Nenhum email"));
    }
}
