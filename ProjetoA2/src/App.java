import java.util.ArrayList;
import poo.projeto.dominio.*;

public class App {
    public static void main(String[] args) throws Exception{
      Turma t1 = new Turma();
      t1.setCodigo(1122);
      ArrayList<Turma> turma = new ArrayList<>(); 
      turma.add(t1);
      Professor professor = new Professor();
      professor.setTurmas(turma);
      professor.ListarTurmasProfessor();
    }
}
