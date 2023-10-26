package poo.projeto.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa{
    private int periodo;
    private Turma turma;
    private RendimentoEscolar rendimentoEscolar;
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public RendimentoEscolar getRendimentoEscolar() {
        return rendimentoEscolar;
    }
    public void setRendimentoEscolar(RendimentoEscolar rendimentoEscolar) {
        this.rendimentoEscolar = rendimentoEscolar;
    }
    
    public Aluno() {
    }
    public Aluno(int codigo, String nome, String senha, LocalDate dataNascimento, String nomeUsuario, int periodo,
            Turma turma, RendimentoEscolar rendimentoEscolar) {
        super(codigo, nome, senha, dataNascimento, nomeUsuario);
        this.periodo = periodo;
        this.turma = new Turma();
        this.rendimentoEscolar = new RendimentoEscolar();
    }
    @Override
    public String toString() {
        return "Aluno [codigo =" + codigo + "nome = "+ nome + "Senha = "+ senha + "Data de Nascimento =" + dataNascimento + "Nome de Usuário = " + nomeUsuario + "periodo=" + periodo + ", turma=" + turma + ", rendimentoEscolar=" + rendimentoEscolar + "]";
    }

    public void ListarTurmaAluno(){
        System.out.println(turma.toString());
    }

    public void ListarDisciplinasAluno(){
       for(Disciplina d1 : turma.getDisciplina()){
        System.out.println(d1.toString());
       }
    }

    
    

    

}
