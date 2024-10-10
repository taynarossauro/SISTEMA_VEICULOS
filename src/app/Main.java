package app;

import models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        AutomovelDomestico carro = new AutomovelDomestico("Fusca", LocalDate.of(1975, 1, 1), "Volkswagen", "Azul", 120000, 4, "Hidráulico", true);

        Motocicleta moto = new Motocicleta("150", LocalDate.of(2020, 5, 20), "Honda", "Preto", 15000, 500, 45.5);

        Caminhao caminhao = new Caminhao("Caminhãozao", LocalDate.of(2018, 3, 15), "Scania", "Vermelho", 250000, 4, 12000.5);
        
        Bicicleta bicicleta = new Bicicleta("Bici", LocalDate.of(2021, 8, 10), "Caloi", "Verde", "Caloi", "Alumínio", 21, true, 0.0);


        // exibindo os comandos INSERT
        System.out.println(carro.getInsert());
        System.out.println(moto.getInsert());
        System.out.println(caminhao.getInsert());
        System.out.println(bicicleta.getInsert());
    }
}
