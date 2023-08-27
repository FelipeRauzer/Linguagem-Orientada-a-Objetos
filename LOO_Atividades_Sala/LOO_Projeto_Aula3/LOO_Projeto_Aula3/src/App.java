package LOO_Projeto_Aula3.src;

import java.time.LocalDate;

import LOO_Projeto_Aula3.src.Uniderp.cliente;

public class App {
    public static void main(String[] args) throws Exception {
        cliente C1 = new cliente();
        C1.setCodigo(0);
        C1.setNome("Felipe");
        C1.setEndereco("Rua Victor Horta, 68");
        C1.setTelefone("99286557796");
        C1.setDatanascimento(LocalDate.of(1945, 10, 15));
        C1.setRg("05902748135");
        C1.setCpf("2240210");
        C1.setDataInsercao(LocalDate.now());
    }
}
