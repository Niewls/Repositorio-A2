package poo.projeto.dominio.FakeDB;
import java.util.ArrayList;

import poo.projeto.dominio.Trabalho;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {

    private TrabalhoFakeDB t1 = new TrabalhoFakeDB();
    private ArrayList<Trabalho> trabalhos = t1.getLista();

    @Override
    protected void CarregarDados() {
              
    }
    
}
