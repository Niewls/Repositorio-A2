package poo.projeto.dominio;
import java.util.List;
import java.util.ArrayList;

public class Turma extends BaseIdentificador{
    private List<Disciplina> disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private int capacidadeTurma;
    public List<Disciplina> getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }
    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }
    @Override
    public String toString() {
        return "Turma [Codigo = " + codigo + "disciplina=" + disciplina + ", professor=" + professor + ", alunos=" + alunos
                + ", capacidadeTurma=" + capacidadeTurma + "]";
    }
    public Turma() {
    }
    public Turma(int codigo, ArrayList<Disciplina> disciplina, Professor professor, ArrayList<Aluno> alunos,
            int capacidadeTurma) {
        super(codigo);
        this.disciplina = new ArrayList<Disciplina>();
        this.professor = new Professor();
        this.alunos = new ArrayList<Aluno>();
        this.capacidadeTurma = capacidadeTurma;
    }
    public void ListarAlunos(){
        for(Aluno a1 : alunos){
            System.out.println(a1.toString());
        }
    }
    
}
