import java.util.ArrayList;
import java.util.stream.Collectors;

public class Disciplina {
    String nome;
    int codigoDisciplina;
    ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();

    public Disciplina(
        String nome, 
        int codigoDisciplina) {
            this.nome = nome;
            this.codigoDisciplina = codigoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    @Override
    public String toString() {
        String listString = alunosMatriculados.stream().map(Object::toString)
                        .collect(Collectors.joining("\n"));
        System.err.println(listString);
        return "Disciplina: " + nome + 
        "\nCódigo da Disciplina: " + codigoDisciplina +
        "\nLista de Alunos: \n" + listString;
    }
}
