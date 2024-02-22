public class PersonCorrect {
    // Essa classe está correta porque possui apenas uma única responsabilidade: comer. 
    // Isso segue o princípio da responsabilidade única.
    String name;
    double height;
    double weight;

    public PersonCorrect(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void eat(double bmi) {
        if (bmi == 120) {
            System.err.println("You exploded!");
        } else {
            System.err.println("Eating...\nCurrent Weight: " + this.weight);        
            this.weight +=  1;
        }
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    } 
    
}
