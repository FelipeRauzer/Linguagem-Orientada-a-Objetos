package LOO_Projeto_Aula3.src.Uniderp;

import java.time.LocalDate;

public class cliente extends pessoa {

    private Double credito;

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public cliente(int codigo, String nome, String endereco, String telefone, LocalDate datanascimento, String rg,
            String cpf, LocalDate dataInsercao, Double credito) {
        super(codigo, nome, endereco, telefone, datanascimento, rg, cpf, dataInsercao);
        this.credito = credito;
    }

    public cliente(Double credito) {
        this.credito = credito;
    }

    public cliente(){
        
    }
  

    
}
