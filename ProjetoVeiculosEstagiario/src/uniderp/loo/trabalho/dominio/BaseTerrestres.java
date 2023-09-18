package uniderp.loo.trabalho.dominio;

import java.time.LocalDate;

public abstract class BaseTerrestres extends BaseVeiculo {
    protected String Placa;
    protected String Renavam;
    protected int Rodas;
    protected String transmissao;
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getRenavam() {
        return Renavam;
    }
    public void setRenavam(String renavam) {
        Renavam = renavam;
    }
    public int getRodas() {
        return Rodas;
    }
    public void setRodas(int rodas) {
        Rodas = rodas;
    }
    public String getTransmissao() {
        return transmissao;
    }
    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }
    public BaseTerrestres(int codigo, String nomeProprietário, String chassi, String anoModelo, String anoFabricacao,
            String fabricante, String endCadastrado, LocalDate dataInsercao, String cor, String modelo,
            String tipoCombustivel, String tipoVeiculo, int qtdeOcupantes, String peso, int assentos,
            String capacidadeCarga, String placa, String renavam, int rodas, String transmissao) {
        super(codigo, nomeProprietário, chassi, anoModelo, anoFabricacao, fabricante, endCadastrado, dataInsercao, cor,
                modelo, tipoCombustivel, tipoVeiculo, qtdeOcupantes, peso, assentos, capacidadeCarga);
        Placa = placa;
        Renavam = renavam;
        Rodas = rodas;
        this.transmissao = transmissao;
    }
    
    

    
}
