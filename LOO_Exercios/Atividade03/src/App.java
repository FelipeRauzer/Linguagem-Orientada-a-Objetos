import java.time.LocalDate;

import uniderp.loo.escola.dominio.aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        aluno C1 = new aluno();
        C1.setCodigo(1);
        C1.setNome("Felipe");
        C1.setEndereco("Rua píratininga, 777");
        C1.setTelefone("67992884553");
        C1.setDataNascimento(LocalDate.of(2010, 12, 31));
        C1.setRg("2225481");
        C1.setCpf("82448130524");
        C1.setDataMatricula(LocalDate.now());
        C1.setMatricula("222");
    }
}
