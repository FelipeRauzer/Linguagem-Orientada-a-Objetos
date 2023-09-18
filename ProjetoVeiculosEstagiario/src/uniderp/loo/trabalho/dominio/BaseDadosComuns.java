package uniderp.loo.trabalho.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseIdentificador{
    protected String NomeProprietário;
    protected String Chassi;
    protected String AnoModelo;
    protected String AnoFabricacao;
    protected String Fabricante;
    protected String EndCadastrado;
    protected LocalDate DataInsercao;
    public String getNomeProprietário() {
        return NomeProprietário;
    }
    public void setNomeProprietário(String nomeProprietário) {
        NomeProprietário = nomeProprietário;
    }
    public String getChassi() {
        return Chassi;
    }
    public void setChassi(String chassi) {
        Chassi = chassi;
    }
    public String getAnoModelo() {
        return AnoModelo;
    }
    public void setAnoModelo(String anoModelo) {
        AnoModelo = anoModelo;
    }
    public String getAnoFabricacao() {
        return AnoFabricacao;
    }
    public void setAnoFabricacao(String anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }
    public String getFabricante() {
        return Fabricante;
    }
    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }
    public String getEndCadastrado() {
        return EndCadastrado;
    }
    public void setEndCadastrado(String endCadastrado) {
        EndCadastrado = endCadastrado;
    }
    public LocalDate getDataInsercao() {
        return DataInsercao;
    }
    public void setDataInsercao(LocalDate dataInsercao) {
        DataInsercao = dataInsercao;
    }
    public BaseDadosComuns(int codigo, String nomeProprietário, String chassi, String anoModelo, String anoFabricacao,
            String fabricante, String endCadastrado, LocalDate dataInsercao) {
        super(codigo);
        NomeProprietário = nomeProprietário;
        Chassi = chassi;
        AnoModelo = anoModelo;
        AnoFabricacao = anoFabricacao;
        Fabricante = fabricante;
        EndCadastrado = endCadastrado;
        DataInsercao = dataInsercao;
    }
    
    
}
