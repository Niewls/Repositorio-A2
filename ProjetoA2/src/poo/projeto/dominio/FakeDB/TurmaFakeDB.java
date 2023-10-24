package poo.projeto.dominio.FakeDB;
import java.util.ArrayList;
import java.util.List;

import poo.projeto.dominio.Turma;
import poo.projeto.dominio.Disciplina;
import poo.projeto.dominio.Professor;

public class TurmaFakeDB extends BaseGenericaFakeDB <Turma>{ // Turma -> 400 - 499
  DisciplinaFakeDB disciplinas = new DisciplinaFakeDB();
  ArrayList<Disciplina> listaDisciplina = disciplinas.getLista();
  ProfessorFakeDB professor = new ProfessorFakeDB();
  ArrayList<Professor> listaProfessor = professor.getLista();
  List<Disciplina> disciplinaTurma1 = new ArrayList<Disciplina>(); 
  List<Disciplina> disciplinaTurma2 = new ArrayList<Disciplina>(); 
  List<Disciplina> disciplinaTurma3 = new ArrayList<Disciplina>(); 
  List<Disciplina> disciplinaTurma4 = new ArrayList<Disciplina>(); 
  List<Disciplina> disciplinaTurma5 = new ArrayList<Disciplina>(); 
  List<Disciplina> disciplinaTurma6 = new ArrayList<Disciplina>(); 
  List<Disciplina> disciplinaTurma7 = new ArrayList<Disciplina>(); 
  List<Disciplina> disciplinaTurma8 = new ArrayList<Disciplina>();

  private void CarregarDisciplinas(){
      this.disciplinaTurma1.add(listaDisciplina.get(0));
      this.disciplinaTurma1.add(listaDisciplina.get(1));
      this.disciplinaTurma1.add(listaDisciplina.get(2));
      this.disciplinaTurma2.add(listaDisciplina.get(3));
      this.disciplinaTurma2.add(listaDisciplina.get(4));
      this.disciplinaTurma2.add(listaDisciplina.get(5));
      this.disciplinaTurma3.add(listaDisciplina.get(6));
      this.disciplinaTurma3.add(listaDisciplina.get(7));
      this.disciplinaTurma3.add(listaDisciplina.get(8));
      this.disciplinaTurma4.add(listaDisciplina.get(9));
      this.disciplinaTurma4.add(listaDisciplina.get(10));
      this.disciplinaTurma4.add(listaDisciplina.get(11));
      this.disciplinaTurma5.add(listaDisciplina.get(12));
      this.disciplinaTurma5.add(listaDisciplina.get(13));
      this.disciplinaTurma5.add(listaDisciplina.get(14));
      this.disciplinaTurma6.add(listaDisciplina.get(15));
      this.disciplinaTurma6.add(listaDisciplina.get(16));
      this.disciplinaTurma6.add(listaDisciplina.get(17));
      this.disciplinaTurma7.add(listaDisciplina.get(18));
      this.disciplinaTurma7.add(listaDisciplina.get(19));
      this.disciplinaTurma7.add(listaDisciplina.get(20));
      this.disciplinaTurma8.add(listaDisciplina.get(21));
      this.disciplinaTurma8.add(listaDisciplina.get(23));
    }
    @Override
    protected void CarregarDados() {
      CarregarDisciplinas();
      this.lista.add(new Turma(401, disciplinaTurma1, listaProfessor.get(1), 60)); // Luiz Martins -> Turma 1
      this.lista.add(new Turma(402, disciplinaTurma2, listaProfessor.get(2), 56)); // Nicole Souza -> Turma 2
      this.lista.add(new Turma(403, disciplinaTurma3, listaProfessor.get(1), 49)); // Luiz Martins -> Turma 3
      this.lista.add(new Turma(404, disciplinaTurma4, listaProfessor.get(4), 58)); // Alberto Farias -> Turma 4
      this.lista.add(new Turma(405, disciplinaTurma5, listaProfessor.get(3), 45)); // Gerivaldo Lopes -> Turma 5
      this.lista.add(new Turma(406, disciplinaTurma6, listaProfessor.get(0), 38)); // André Ocampos -> Turma 6
      this.lista.add(new Turma(407, disciplinaTurma7, listaProfessor.get(3), 35)); // Gerivaldo Lopes -> Turma 7
      this.lista.add(new Turma(408, disciplinaTurma8, listaProfessor.get(1), 29)); // Luiz Martins -> Turma 8
    }
  
    

    TurmaFakeDB(){
      super();
    }
}
