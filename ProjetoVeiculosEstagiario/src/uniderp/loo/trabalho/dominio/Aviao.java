package uniderp.loo.trabalho.dominio;

import java.time.LocalDate;

public class Aviao extends BaseAereos implements IImpressao{
    private String TetodeServiço;
    private String Envergadura;
    public String getCategoria() {
        return TetodeServiço;
    }
    public void setCategoria(String tetodeServiço) {
        TetodeServiço = tetodeServiço;
    }
    public String getEnvergadura() {
        return Envergadura;
    }
    public void setEnvergadura(String envergadura) {
        Envergadura = envergadura;
    }
    public Aviao(int codigo, String nomeProprietário, String chassi, String anoModelo, String anoFabricacao,
            String fabricante, String endCadastrado, LocalDate dataInsercao, String cor, String modelo,
            String tipoCombustivel, String tipoVeiculo, int qtdeOcupantes, String peso, int assentos,
            String capacidadeCarga, String prefixoAeronautico, int qtdeMotores, String tipoAeronave, String vidaUtil,
            String autonomia, String tetodeServiço, String envergadura) {
        super(codigo, nomeProprietário, chassi, anoModelo, anoFabricacao, fabricante, endCadastrado, dataInsercao, cor,
                modelo, tipoCombustivel, tipoVeiculo, qtdeOcupantes, peso, assentos, capacidadeCarga,
                prefixoAeronautico, qtdeMotores, tipoAeronave, vidaUtil, autonomia);
        this.TetodeServiço = tetodeServiço;
        this.Envergadura = envergadura;
    }
    public void Imprimir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome do Proprietario: " + this.NomeProprietário);
        System.out.println("Chassi: " + this.Chassi);
        System.out.println("Ano do Modelo: " + this.AnoModelo);
        System.out.println("Ano de Fabricação: " + this.AnoFabricacao);
        System.out.println("Fabricante: " + this.Fabricante);
        System.out.println("Endereço Cadastrado: " + this.EndCadastrado);
        System.out.println("Data de Inserção: " + this.DataInsercao);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Tipo de Combustivel: " + this.TipoCombustivel);
        System.out.println("Tipo de Veiculo: " + this.TipoVeiculo);
        System.out.println("Qauntidade de Ocupante: " + this.QtdeOcupantes);
        System.out.println("Capacidade de Carga: " + this.CapacidadeCarga);
        System.out.println("Prefixo Aeronáutico: " + this.PrefixoAeronautico);
        System.out.println("Quantidade de Motores: " + this.QtdeMotores);
        System.out.println("Tipo de Aeronave: " + this.TipoAeronave);
        System.out.println("Vida Util: " + this.VidaUtil);
        System.out.println("Autonomia: " + this.Autonomia);
        System.out.println("Teto de Serviço: " + this.TetodeServiço);
        System.out.println("Envergadura: " + this.Envergadura);
    }
    
}
