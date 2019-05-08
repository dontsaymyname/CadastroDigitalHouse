import java.util.Date;

public class Aula {

    private Materia materia;
    private Date horarioInicio;
    private Date horrioTermino;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorrioTermino() {
        return horrioTermino;
    }

    public void setHorrioTermino(String horrioTermino) {
        this.horrioTermino = horrioTermino;
    }
}
