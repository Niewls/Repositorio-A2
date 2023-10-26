package poo.projeto.dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseDadosComuns{
    protected String senha;
    protected LocalDate dataNascimento;
    protected String nomeUsuario;
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public BasePessoa() {
       
    }
    public BasePessoa(int codigo, String nome, String senha, LocalDate dataNascimento, String nomeUsuario) {
        super(codigo, nome);
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.nomeUsuario = nomeUsuario;
    }
    
}
