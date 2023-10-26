package poo.projeto.dominio;
import java.util.ArrayList;
import java.time.LocalDate;


public class Professor extends BasePessoa{
    private String cargo;
    private ArrayList<Turma> turmas;
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    public Professor() {
    }
    public Professor(int codigo, String nome, String senha, LocalDate dataNascimento, String nomeUsuario, String cargo,
            ArrayList<Turma> turmas) {
        super(codigo, nome, senha, dataNascimento, nomeUsuario);
        this.cargo = cargo;
        this.turmas = new ArrayList<Turma>();
    }
    public void ListarTurmasProfessor(){
        for(Turma t1 : turmas){
            System.out.println(t1.toString());
        }
    }

    @Override
    public String toString() {
        return "Professor [codigo = "+ codigo + "nome = "+ nome + "senha = " + senha + "Data de Nascimento = "+ dataNascimento +"Nome de Usuário = "+ nomeUsuario + "cargo=" + cargo + ", turmas=" + turmas + "]";
    }
    

    
    
    
}
