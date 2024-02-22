public class PersonWrong {
    // Essa classe está errada porque tem muitas responsabilidades. 
    // A classe PersonWrong tem uma funcionalidade eat(), que aumenta o weight 
    // da pessoa, e também tem outro método que calcula o BMI. Isso viola o princípio
    // da responsabilidade única.
    String name;
    double height;
    double weight;

    public PersonWrong(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void eat() {
        if (calculateBmi() == 120) {
            System.err.println("You exploded!");
        } else {
            System.err.println("Eating...\nCurrent Weight: " + this.weight);        
            this.weight +=  1;
        }
    } 

    public double calculateBmi() {
        double imc = this.weight / (this.height * this.height);
        if ( imc < 16 ) {
            System.err.println("Magreza Grau III: " +   imc);
        } else if (imc >= 16 && imc <= 16.9) {
            System.err.println("Magreza Grau II: " +    imc);
        } else if(imc >= 17 && imc <= 18.4) {
            System.err.println("Magreza Grau I: " +     imc);
        } else if(imc >= 18.5 && imc <= 24.9) {
            System.err.println("Adequado: " +           imc);
        } else if(imc >= 25 && imc <= 29.9) {
            System.err.println("Pré-Obeso: " +          imc);
        } else if(imc >= 30 && imc <= 34.9) {
            System.err.println("Obesidade Grau I: " +   imc);
        } else if(imc >= 35 && imc <= 39.9) {
            System.err.println("Obesidade Grau II: " +  imc);
        }  else if(imc >= 40) {
            System.err.println("Obesidade Grau III: " + imc);
        }

        return imc;
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

    public void setHeight(float height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

  
}
