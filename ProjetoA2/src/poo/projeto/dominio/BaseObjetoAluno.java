package poo.projeto.dominio;

public abstract class  BaseObjetoAluno extends BaseIdentificador{
    protected Aluno aluno;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public BaseObjetoAluno() {
    }

    public BaseObjetoAluno(int codigo, Aluno aluno) {
        super(codigo);
        this.aluno = new Aluno();
    }
    
}
