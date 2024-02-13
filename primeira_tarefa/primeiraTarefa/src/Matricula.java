public abstract class Matricula {
    int numeroMatricula;
    Disciplina disciplina;

    public abstract void matricular(Aluno aluno, Matricula disciplina);

    @Override
    public String toString() {
        return "Matricula [numeroMatricula=" + numeroMatricula + ", disciplina=" + disciplina + "]";
    }
}
