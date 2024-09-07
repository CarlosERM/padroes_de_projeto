class PersonController {
    private Person model;
    private PersonView view;
 
    public PersonController(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }
 
    public void setPersonFirstName(String firstName) {
        model.setFirstName(firstName);
    }
    public String getPersonFirstName() {
        return model.getFirstName();
    }


    public void setPersonLastName(String secondName) {
        model.setLastName(secondName);
    }
    public String getPersonLastName() {
        return model.getLastName();
    }

    public void setPersonCPF(String cpf) {
        model.setCpf(cpf);
    }
    public String getPersonCPF() {
        return model.getCpf();
    }
 
    public void setBirthDate(String birthDate) {
        model.setBirthDate(birthDate);
    }
    public String getBirthDate() {
        return model.getBirthDate();

    }
 
    public void updateView() {
        view.printStudentDetails(model.getFirstName(), model.getLastName(), model.getCpf(), model.getBirthDate());
    }
}