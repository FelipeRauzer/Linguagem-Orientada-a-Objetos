package uniderp.loo.trabalho.dominio;

import java.time.LocalDate;

public abstract class BaseAereos extends BaseVeiculo {
    protected String PrefixoAeronautico;
    protected int QtdeMotores;
    protected String TipoAeronave;
    protected String VidaUtil;
    protected String Autonomia;
    public String getPrefixoAeronautico() {
        return PrefixoAeronautico;
    }
    public void setPrefixoAeronautico(String prefixoAeronautico) {
        PrefixoAeronautico = prefixoAeronautico;
    }
    public int getQtdeMotores() {
        return QtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        QtdeMotores = qtdeMotores;
    }
    public String getTipoAeronave() {
        return TipoAeronave;
    }
    public void setTipoAeronave(String tipoAeronave) {
        TipoAeronave = tipoAeronave;
    }
    public String getVidaUtil() {
        return VidaUtil;
    }
    public void setVidaUtil(String vidaUtil) {
        VidaUtil = vidaUtil;
    }
    public String getAutonomia() {
        return Autonomia;
    }
    public void setAutonomia(String autonomia) {
        Autonomia = autonomia;
    }
    public BaseAereos(int codigo, String nomeProprietário, String chassi, String anoModelo, String anoFabricacao,
            String fabricante, String endCadastrado, LocalDate dataInsercao, String cor, String modelo,
            String tipoCombustivel, String tipoVeiculo, int qtdeOcupantes, String peso, int assentos,
            String capacidadeCarga, String prefixoAeronautico, int qtdeMotores, String tipoAeronave, String vidaUtil,
            String autonomia) {
        super(codigo, nomeProprietário, chassi, anoModelo, anoFabricacao, fabricante, endCadastrado, dataInsercao, cor,
                modelo, tipoCombustivel, tipoVeiculo, qtdeOcupantes, peso, assentos, capacidadeCarga);
        this.PrefixoAeronautico = prefixoAeronautico;
        this.QtdeMotores = qtdeMotores;
        this.TipoAeronave = tipoAeronave;
        this.VidaUtil = vidaUtil;
        this.Autonomia = autonomia;
    }

    
}
