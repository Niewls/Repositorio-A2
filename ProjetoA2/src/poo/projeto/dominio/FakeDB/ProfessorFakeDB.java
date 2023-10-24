package poo.projeto.dominio.FakeDB;
import java.time.LocalDate;

import poo.projeto.dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> { // Professor -: 100 - 199

    @Override
    protected void CarregarDados() {
        this.lista.add(new Professor(105, "Andre Ocampos", "78912", LocalDate.of(1982, 05, 2), "Andre", "Professor"));
        this.lista.add(new Professor(110, "Luiz Martins", "123423", LocalDate.of(1988, 01, 29), "Luiz", "Professor"));
        this.lista.add(new Professor(115, "Nicole Souza", "67456", LocalDate.of(1995, 12, 30), "Nicole", "Professor"));
        this.lista.add(new Professor(120, "Gerivaldo Lopes", "0000", LocalDate.of(1968,07, 16), "Gerivaldo", "Professor"));
        this.lista.add(new Professor(125, "Alberto Farias", "098012", LocalDate.of(1970, 10, 10), "Alberto", "Professor"));
        
    }
    public ProfessorFakeDB(){
        super();
    }
}
