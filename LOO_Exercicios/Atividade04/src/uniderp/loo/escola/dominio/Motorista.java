package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Motorista extends BaseDados {
    private int cracha;
    private int cnh;
    private LocalDate vencimentocnh;
    private int numveiculo;
    public int getCracha() {
        return cracha;
    }
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
    public int getCnh() {
        return cnh;
    }
    public void setCnh(int cnh) {
        this.cnh = cnh;
    }
    public LocalDate getVencimentocnh() {
        return vencimentocnh;
    }
    public void setVencimentocnh(LocalDate vencimentocnh) {
        this.vencimentocnh = vencimentocnh;
    }
    public int getNumveiculo() {
        return numveiculo;
    }
    public void setNumveiculo(int numveiculo) {
        this.numveiculo = numveiculo;
    }
    public Motorista(int codigo, String nome, String endereco, String teleefone, String cpf, String rg,
            LocalDate dataNascimento, LocalDate dataInsercao, int cracha, int cnh, LocalDate vencimentocnh,
            int numveiculo) {
        super(codigo, nome, endereco, teleefone, cpf, rg, dataNascimento, dataInsercao);
        this.cracha = cracha;
        this.cnh = cnh;
        this.vencimentocnh = vencimentocnh;
        this.numveiculo = numveiculo;
    }
    

    
}
