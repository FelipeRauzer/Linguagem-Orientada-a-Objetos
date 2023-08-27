package LOO_Projeto_Aula3.src.Uniderp;

import java.time.LocalDate;

public class atendente extends pessoa {
    private int cabine;

    public int getCabine() {
        return cabine;
    }

    public void setCabine(int cabine) {
        this.cabine = cabine;
    }

    public atendente(int codigo, String nome, String endereco, String telefone, LocalDate datanascimento, String rg,
            String cpf, LocalDate dataInsercao, int cabine) {
        super(codigo, nome, endereco, telefone, datanascimento, rg, cpf, dataInsercao);
        this.cabine = cabine;
    }

    public atendente(int cabine) {
        this.cabine = cabine;
    }

    public atendente(){
        
    }
    
    
}
