package poo.projeto.dominio;
import java.util.ArrayList;

public class RendimentoEscolar extends BaseObjetoAluno{
    private Turma turma;
    private double nota1Prova;
    private double nota2Prova;
    private ArrayList<NotaTrabalho> Notastrabalhos; 
    private double mediaTrabalhos;
    private double mediaGeral;
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public double getNota1Prova() {
        return nota1Prova;
    }
    public void setNota1Prova(double nota1Prova) {
        this.nota1Prova = nota1Prova;
    }
    public double getNota2Prova() {
        return nota2Prova;
    }
    public void setNota2Prova(double nota2Prova) {
        this.nota2Prova = nota2Prova;
    }
    public ArrayList<NotaTrabalho> getTrabalhos() {
        return Notastrabalhos;
    }
    public void setTrabalhos(ArrayList<NotaTrabalho> Notastrabalhos) {
        this.Notastrabalhos = Notastrabalhos;
    }
    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }
    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }
    public double getMediaGeral() {
        return mediaGeral;
    }
    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
    public RendimentoEscolar() {
    }
    public RendimentoEscolar(int codigo, Aluno aluno, Turma turma, double nota1Prova, double nota2Prova,
            ArrayList<NotaTrabalho> Notastrabalhos, double mediaTrabalhos, double mediaGeral) {
        super(codigo, aluno);
        this.turma = new Turma();
        this.nota1Prova = nota1Prova;
        this.nota2Prova = nota2Prova;
        this.Notastrabalhos = new ArrayList<NotaTrabalho>();
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaGeral = mediaGeral;
    }
    @Override
    public String toString() {
        return "RendimentoEscolar [codigo = "+ codigo + "aluno = "+ aluno + "turma=" + turma + ", nota1Prova=" + nota1Prova + ", nota2Prova=" + nota2Prova
                + ", Notastrabalhos=" + Notastrabalhos + ", mediaTrabalhos=" + mediaTrabalhos + ", mediaGeral="
                + mediaGeral + "]";
    }
    
}
