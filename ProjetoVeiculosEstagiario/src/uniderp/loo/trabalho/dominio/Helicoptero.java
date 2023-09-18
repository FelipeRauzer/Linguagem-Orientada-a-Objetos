package uniderp.loo.trabalho.dominio;

import java.time.LocalDate;

public class Helicoptero extends BaseAereos implements IImpressao{
    private int NumeroDePas;

    public int getNumeroDePas() {
        return NumeroDePas;
    }

    public void setNumeroDePas(int numeroDePas) {
        NumeroDePas = numeroDePas;
    }

    public Helicoptero(int codigo, String nomeProprietário, String chassi, String anoModelo, String anoFabricacao,
            String fabricante, String endCadastrado, LocalDate dataInsercao, String cor, String modelo,
            String tipoCombustivel, String tipoVeiculo, int qtdeOcupantes, String peso, int assentos,
            String capacidadeCarga, String prefixoAeronautico, int qtdeMotores, String tipoAeronave, String vidaUtil,
            String autonomia, int numeroDePas) {
        super(codigo, nomeProprietário, chassi, anoModelo, anoFabricacao, fabricante, endCadastrado, dataInsercao, cor,
                modelo, tipoCombustivel, tipoVeiculo, qtdeOcupantes, peso, assentos, capacidadeCarga,
                prefixoAeronautico, qtdeMotores, tipoAeronave, vidaUtil, autonomia);
        this.NumeroDePas = numeroDePas;
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
        System.out.println("Numero de Pás: " + this.NumeroDePas);
    }
}
