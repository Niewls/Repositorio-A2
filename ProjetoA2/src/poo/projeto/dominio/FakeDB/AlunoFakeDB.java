package poo.projeto.dominio.FakeDB;
import java.time.LocalDate;

import poo.projeto.dominio.Aluno;


public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{ //Aluno -> 0 - 99
    @Override
    protected void CarregarDados() {
        this.lista.add(new Aluno(11, "Daniel Souza Pires", "654321", LocalDate.of(2004, 03, 22), "Daniel", 1));
        this.lista.add(new Aluno(12, "Igor Matheus Sampaio de Souza", "1406", LocalDate.of(2004, 06, 14), "Igor", 1));
        this.lista.add(new Aluno(13, "Diogo Molina", "312455", LocalDate.of(2003, 05, 27), "Diogo", 1)); // 1 periodo
        this.lista.add(new Aluno(14, "Victor Conceição Teixeira", "49223", LocalDate.of(2002, 05, 22), "Victor", 2));
        this.lista.add(new Aluno(15, "Yuri Barbosa", "Flar123", LocalDate.of(2005, 8, 10), "Yuri", 2));
        this.lista.add(new Aluno(16, "Roberto Ribeiro", "rpx44321", LocalDate.of(2003, 01, 05), "Roberto", 2)); // 2 periodo
        this.lista.add(new Aluno(17, "Marcos Leonardo Castro", "ix3390", LocalDate.of(1999, 06, 24), "Igor", 3));
        this.lista.add(new Aluno(18, "João Vitor", "m3321", LocalDate.of(2004, 01, 27), "João", 3));
        this.lista.add(new Aluno(19, "Leonardo Castro", "x99864", LocalDate.of(2002, 8, 21), "Leonardo", 3)); // 3 periodo
        this.lista.add(new Aluno(20, "Daniel Davi", "DV7761", LocalDate.of(2000, 9, 7), "Daniel2", 4));
        this.lista.add(new Aluno(21, "David Molina", "DVM5595", LocalDate.of(2002, 10, 5), "David", 4));
        this.lista.add(new Aluno(22, "Marcelo Espindola", "Me937", LocalDate.of(1998, 03, 5), "Marcelo", 4)); // 4 periodo

    }

    public AlunoFakeDB(){
        super();
    }
}
