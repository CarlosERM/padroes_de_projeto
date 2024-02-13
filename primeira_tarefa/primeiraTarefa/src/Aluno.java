import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {
    LocalDate dataMatricula;
    ArrayList<Matricula> matricula = new ArrayList<Matricula>();
   
    public Aluno (String nome, int idade, LocalDate dataMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.dataMatricula = dataMatricula;
    }

    public  ArrayList<Matricula> getMatricula() {
        return matricula;
    }
    public void setMatricula( ArrayList<Matricula> matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
