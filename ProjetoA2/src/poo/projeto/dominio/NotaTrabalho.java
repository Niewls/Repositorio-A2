package poo.projeto.dominio;

public class NotaTrabalho extends BaseObjetoAluno{
    private Trabalho trabalho;
    private double nota;
    public Trabalho getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public NotaTrabalho() {
    }
    public NotaTrabalho(int codigo, Aluno aluno, Trabalho trabalho, double nota) {
        super(codigo, aluno);
        this.trabalho = trabalho;
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "NotaTrabalho [codigo = "+ codigo + "aluno = "+ aluno + "trabalho=" + trabalho + ", nota=" + nota + "]";
    }
    
    
}
