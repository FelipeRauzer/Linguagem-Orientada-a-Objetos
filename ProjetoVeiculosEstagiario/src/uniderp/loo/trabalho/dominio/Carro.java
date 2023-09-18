package uniderp.loo.trabalho.dominio;

import java.time.LocalDate;

public class Carro extends BaseTerrestres implements IImpressao {
    private String Tracao;
    private String Potencia;


    public String getTracao() {
        return Tracao;
    }
    public void setTracao(String tracao) {
        Tracao = tracao;
    }
    public String getPotencia() {
        return Potencia;
    }
    public void setPotencia(String potencia) {
        Potencia = potencia;
    }
    public Carro(int codigo, String nomeProprietário, String chassi, String anoModelo, String anoFabricacao,
            String fabricante, String endCadastrado, LocalDate dataInsercao, String cor, String modelo,
            String tipoCombustivel, String tipoVeiculo, int qtdeOcupantes, String peso, int assentos,
            String capacidadeCarga, String placa, String renavam, int rodas, String transmissao, String tracao,
            String potencia) {
        super(codigo, nomeProprietário, chassi, anoModelo, anoFabricacao, fabricante, endCadastrado, dataInsercao, cor,
                modelo, tipoCombustivel, tipoVeiculo, qtdeOcupantes, peso, assentos, capacidadeCarga, placa, renavam,
                rodas, transmissao);
        this.Tracao = tracao;
        this.Potencia = potencia;


        
    }
    public void Imprimir() {
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
            System.out.println("Placa: " + this.Placa);
            System.out.println("Renavam: " + this.Renavam);
            System.out.println("Rodas: " + this.Rodas);
            System.out.println("Transmissão: " + this.transmissao);
            System.out.println("Tração: " + this.Tracao);
            System.out.println("Potencia: " + this.Potencia);
    }
}
