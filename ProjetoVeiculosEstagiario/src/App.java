import java.time.LocalDate;

import uniderp.loo.trabalho.dominio.Aviao;
import uniderp.loo.trabalho.dominio.Caminhao;
import uniderp.loo.trabalho.dominio.Carro;
import uniderp.loo.trabalho.dominio.Helicoptero;
import uniderp.loo.trabalho.dominio.Onibus;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        System.out.println("");

        Carro carro =  new Carro(1, "Felipe Rauzer", "FE895623GH", "1990", "1995", "Nissan", "Rua X, numero 2, bairro do zé", (LocalDate.now()), "Azul", "Skyline R34 GTR", "Gasolina", "Carro", 2, " 1,5 Toneladas", 2, "500 KG", "NRR2332", "2827485669", 4, "Manual", "Traseira", "600 WHP");
        carro.Imprimir();

        System.out.println("------------------------------");
        System.out.println("");
        
        Caminhao caminhao = new Caminhao(2, "Felipe Rauzer", "FE895621GH", "2015", "2015", "Volvo", "Rua Y, Numero 362", (LocalDate.now()), "Branco", "Volvo VM", "Diesel", "Caminhão", 4, "5 Tolenadas", 4, "10 Toneladas", "GTR2585", "865947223", 26, "Manual", "BiTrem", 7);
        caminhao.Imprimir();

        System.out.println("------------------------------");
        System.out.println("");

        Onibus onibus = new Onibus(3, "Delry Thiagp", "FE5648512GH", "1993", "1994", "Mercedes", "Rua Z, Numero 555", (LocalDate.now()), "Amarelo", "UrbamModern", "Diesel", "Onibus", 30, "5 Toneladas", 0, "500 KG", "FEL7894", "7539514682", 8, "Automatico", "5 Metros", "Não Articilado");
        onibus.Imprimir();

        System.out.println("------------------------------");
        System.out.println("");

        Aviao aviao = new Aviao(4, "Isadora", "FE875421GH", "2021", "2021", "Embraer", "Rua J,Numero 786", (LocalDate.now()), "Branco", "Boing 747", "Querosene de Aviação", "Avião", 20, "20 Toneladas", 10, "5 Toneladas", "ANR7895", 4, "Cargueiro", "25 Mil Horas de Voo", "10 horas", "5.000 pés", "5 Metros");
        aviao.Imprimir();

        System.out.println("------------------------------");
        System.out.println("");

        Helicoptero helicoptero = new Helicoptero(5, "Fernando", "FE5468245GH", "2020", "2021", "Helibras", "Rua O, Numero 362", (LocalDate.now()), "preto", "Dhruv", "Querosene de Aviação", "Helicoptero", 6, "3 Toneladas", 5, "200 KG", "HEL7895", 1, "Militar", "5 Mil horas de Voo", "3 Horas de Voo", 5);
        helicoptero.Imprimir();

        System.out.println("");
        System.out.println("");        
        System.out.println("FInalizando...");

        System.out.println("");
        System.out.println("");        
        System.out.println("FInalizando...");

        System.out.println("");
        System.out.println("");        
        System.out.println("FInalizando...");
    }
}
