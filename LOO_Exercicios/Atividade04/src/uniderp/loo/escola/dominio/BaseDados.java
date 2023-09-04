package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseDados extends BaseIdentificador {
    protected String nome;  
    protected String endereco;
    protected String teleefone;
    protected String cpf;
    protected String rg;
    protected LocalDate DataNascimento;
    protected LocalDate DataInsercao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTeleefone() {
        return teleefone;
    }
    public void setTeleefone(String teleefone) {
        this.teleefone = teleefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public LocalDate getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }
    public LocalDate getDataInsercao() {
        return DataInsercao;
    }
    public void setDataInsercao(LocalDate dataInsercao) {
        DataInsercao = dataInsercao;
    }
    public BaseDados(int codigo, String nome, String endereco, String teleefone, String cpf, String rg,
            LocalDate dataNascimento, LocalDate dataInsercao) {
        super(codigo);
        this.nome = nome;
        this.endereco = endereco;
        this.teleefone = teleefone;
        this.cpf = cpf;
        this.rg = rg;
        DataNascimento = dataNascimento;
        DataInsercao = dataInsercao;
    }

    

}
