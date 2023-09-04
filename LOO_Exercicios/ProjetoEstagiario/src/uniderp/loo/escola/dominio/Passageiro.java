package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BaseDados{
    private int passaporte;
    private String assento;
    private String destino;
    private int codigoBagagens;
    public int getPassaporte() {
        return passaporte;
    }
    public void setPassaporte(int passaporte) {
        this.passaporte = passaporte;
    }
    public String getAssento() {
        return assento;
    }
    public void setAssento(String assento) {
        this.assento = assento;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getCodigoBagagens() {
        return codigoBagagens;
    }
    public void setCodigoBagagens(int codigoBagagens) {
        this.codigoBagagens = codigoBagagens;
    }
    public Passageiro(int codigo, String nome, String endereco, String teleefone, String cpf, String rg,
            LocalDate dataNascimento, LocalDate dataInsercao, int passaporte, String assento, String destino,
            int codigoBagagens) {
        super(codigo, nome, endereco, teleefone, cpf, rg, dataNascimento, dataInsercao);
        this.passaporte = passaporte;
        this.assento = assento;
        this.destino = destino;
        this.codigoBagagens = codigoBagagens;
    }

    

}
