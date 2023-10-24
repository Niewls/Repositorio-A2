package poo.projeto.dominio.FakeDB;
import java.util.ArrayList;
import poo.projeto.dominio.Disciplina;
import poo.projeto.dominio.Trabalho;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> { // 500 - 599 -> Trabalhos

    private TrabalhoFakeDB t1 = new TrabalhoFakeDB();
    private ArrayList<Trabalho> trabalhos = t1.getLista();
    private DisciplinaFakeDB disciplinas = new DisciplinaFakeDB();
    private ArrayList<Disciplina> listaDisciplina = disciplinas.getLista();

    @Override
    protected void CarregarDados() {
        this.lista.add(new Trabalho(501, listaDisciplina.get(0), "Primeiro Trabalho da Matéria de Arquitetura de Computadores"));
        this.lista.add(new Trabalho(502, listaDisciplina.get(0), "Segundo Trabalho da Matédia de"));
    }
    
}
