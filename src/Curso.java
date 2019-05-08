import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    List<Aula> conjuntoDeAulas = new ArrayList<>();
    List<Aluno> listaDeAlunos = new ArrayList<>();
    private Professor professorResponsavel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
