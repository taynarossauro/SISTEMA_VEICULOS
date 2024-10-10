package app;

import models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        AutomovelDomestico carro = new AutomovelDomestico("Fusca", LocalDate.of(1975, 1, 1), "Volkswagen", "Azul", 120000, 4, "Hidráulico", true);

        Motocicleta moto = new Motocicleta("150", LocalDate.of(2020, 5, 20), "Honda", "Preto", 15000, 500, 45.5);

        Caminhao caminhao = new Caminhao("Caminhãozao", LocalDate.of(2018, 3, 15), "Scania", "Vermelho", 250000, 4, 12000.5);
        
        Bicicleta bicicleta = new Bicicleta("Bici", LocalDate.of(2021, 8, 10), "CX f12", "Verde", "Caloi", "Alumínio", 21, true, 0.0);
        
        Skate skate = new Skate("Drop", LocalDate.of(2021, 8, 10), "Drop Streetskate", "Preto", 0.0, "Drop StreetWear", "Redondas");


        // Exibindo os comandos INSERT
        System.out.println("INSERT INTO AutomovelDomestico (modelo, ano_fabricacao, montadora, cor, kilometragem, qtd_max_passageiros, tipo_freio, airbag) VALUES " + carro.getInsert());
        System.out.println("INSERT INTO Motocicleta (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES " + moto.getInsert());
        System.out.println("INSERT INTO Caminhao (modelo, ano_fabricacao, montadora, cor, kilometragem, qtd_eixos, peso_bruto) VALUES " + caminhao.getInsert());
        System.out.println("INSERT INTO Bicicleta (modelo, ano_fabricacao, montadora, cor, kilometragem, marca, material, qtd_marchas, amortecedor) VALUES " + bicicleta.getInsert());
        System.out.println("INSERT INTO Skate (modelo, ano_fabricacao, montadora, cor, kilometragem, marca, tipo_rodas) VALUES " + skate.getInsert());
        
    }
}
