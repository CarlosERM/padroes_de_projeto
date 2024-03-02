public class MatriculaDisciplina implements Matricula {
    int numeroMatricula;
    Disciplina disciplina;

    public MatriculaDisciplina(int numeroMatricula, Disciplina disciplina) {
        this.numeroMatricula = numeroMatricula;
        this.disciplina = disciplina;
    }

    @Override
    public void matricular(Aluno aluno, Matricula matricula) {
        System.err.println(matricula);
        aluno.matricula.add(matricula);
        disciplina.alunosMatriculados.add(aluno);
    }

    
}
