package poo.projeto.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa{
    private int periodo;

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Aluno(int codigo, String nome, String senha, LocalDate dataNascimento, String nomeUsuario, int periodo) {
        super(codigo, nome, senha, dataNascimento, nomeUsuario);
        this.periodo = periodo;
    }
}
