public class App {
    public static void main(String[] args) {
        Person model = getPersonFromDB();
 
        PersonView view = new PersonView();
 
        PersonController controller = new PersonController(model, view);
        System.out.println("----------------------");
        controller.updateView();
        System.out.println("----------------------");
        
        controller.setPersonFirstName("Pipoca");
        controller.setPersonLastName("Maluca");
        controller.setPersonCPF("12098734664");
        controller.setBirthDate("08/08/2008");

        System.out.println("----------------------");
        controller.updateView();
        System.out.println("----------------------");
    }
 
    private static Person getPersonFromDB() {
        Person person = new Person();
        person.setFirstName("Carlos Eduardo");
        person.setLastName("Rocha Miranda");
        person.setCpf("000.000.000-00");
        person.setBirthDate("07/07/2007");
        return person;
    }
}
