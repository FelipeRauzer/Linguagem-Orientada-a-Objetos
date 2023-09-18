package uniderp.loo.trabalho.dominio;

import java.time.LocalDate;

public abstract class BaseVeiculo extends BaseDadosComuns {
    protected String Cor;
    protected String Modelo;
    protected String TipoCombustivel;
    protected String TipoVeiculo;
    protected int QtdeOcupantes;
    protected String Peso;
    protected int assentos;
    protected String CapacidadeCarga;
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getTipoCombustivel() {
        return TipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        TipoCombustivel = tipoCombustivel;
    }
    public String getTipoVeiculo() {
        return TipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }
    public int getQtdeOcupantes() {
        return QtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        QtdeOcupantes = qtdeOcupantes;
    }
    public String getPeso() {
        return Peso;
    }
    public void setPeso(String peso) {
        Peso = peso;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String getCapacidadeCarga() {
        return CapacidadeCarga;
    }
    public void setCapacidadeCarga(String capacidadeCarga) {
        CapacidadeCarga = capacidadeCarga;
    }
    public BaseVeiculo(int codigo, String nomeProprietário, String chassi, String anoModelo, String anoFabricacao,
            String fabricante, String endCadastrado, LocalDate dataInsercao, String cor, String modelo,
            String tipoCombustivel, String tipoVeiculo, int qtdeOcupantes, String peso, int assentos,
            String capacidadeCarga) {
        super(codigo, nomeProprietário, chassi, anoModelo, anoFabricacao, fabricante, endCadastrado, dataInsercao);
        Cor = cor;
        Modelo = modelo;
        TipoCombustivel = tipoCombustivel;
        TipoVeiculo = tipoVeiculo;
        QtdeOcupantes = qtdeOcupantes;
        Peso = peso;
        this.assentos = assentos;
        CapacidadeCarga = capacidadeCarga;
    }
    
    
    
}
