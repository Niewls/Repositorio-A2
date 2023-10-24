package poo.projeto.dominio;
import java.util.List;

public class RendimentoEscolar {
    private Aluno aluno;
    private Turma turma;
    private double nota1Prova;
    private double nota2Prova;
    private List<NotaTrabalho> trabalhos; 
    private double mediaTrabalhos;
    private double mediaGeral;
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
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
    public List<NotaTrabalho> getTrabalhos() {
        return trabalhos;
    }
    public void setTrabalhos(List<NotaTrabalho> trabalhos) {
        this.trabalhos = trabalhos;
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
    public RendimentoEscolar(Aluno aluno, Turma turma, double nota1Prova, double nota2Prova,
            List<NotaTrabalho> trabalhos, double mediaTrabalhos, double mediaGeral) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota1Prova = nota1Prova;
        this.nota2Prova = nota2Prova;
        this.trabalhos = trabalhos;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaGeral = mediaGeral;
    }
}
