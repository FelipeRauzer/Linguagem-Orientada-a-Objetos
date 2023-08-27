package LOO_Projeto_Aula3.src.Uniderp;

import java.time.LocalDate; 

public class tecnico extends pessoa {

    private String cracha;

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public tecnico(int codigo, String nome, String endereco, String telefone, LocalDate datanascimento, String rg,
            String cpf, LocalDate dataInsercao, String cracha) {
        super(codigo, nome, endereco, telefone, datanascimento, rg, cpf, dataInsercao);
        this.cracha = cracha;
    }

    public tecnico(String cracha) {
        this.cracha = cracha;
    }

    public tecnico(){
        
    }
    
    
}
