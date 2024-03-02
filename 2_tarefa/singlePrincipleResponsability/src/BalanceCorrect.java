public class BalanceCorrect {
    // Essa classe está correta porque possui apenas uma única responsabilidade: calcular IMC. 
    // Isso segue o princípio da responsabilidade única.
    public double calculateBmi(double weight, double height) {
        double imc = weight / (height * height);
        
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
}
