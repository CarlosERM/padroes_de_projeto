import java.util.Random;
import java.time.LocalDate;

public class Secretaria{
    private Disciplina[] disciplinas = {
        new Disciplina("Matemática", 0),
        new Disciplina("Português", 1),
        new Disciplina("Inglês", 2),
        new Disciplina("Geografia", 3),
        new Disciplina("História", 4),
    };

    public Disciplina executarMatriculaAluno(String nome, int idade, String disciplina) {
        Random gerador = new Random();
        int index = 0;
        for( int i = 0; i < disciplinas.length; i++){
            if(disciplinas[i].nome == disciplina) {
                index = i;
                break;
            }
        }
        Matricula matricula = new MatriculaDisciplina(gerador.nextInt(100), disciplinas[index]);
        Aluno aluno = new Aluno(nome, idade, LocalDate.now());
        
        matricula.matricular(aluno, matricula);

        return disciplinas[index];
    }
}
