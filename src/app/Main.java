package app;

import models.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {

    // Conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/veiculos";
    private static final String USUARIO = "root";
    private static final String SENHA = "UPXTaynara123+";

    public static void main(String[] args) {
        // Carregando o driver JDBC do MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Erro ao carregar o driver JDBC: " + e.getMessage());
            return;  // Encerrar a execução caso o driver não seja encontrado
        }

        // Criando os objetos
        AutomovelDomestico carro = new AutomovelDomestico("Fusca", LocalDate.of(1975, 1, 1), "Volkswagen", "Azul", 120000, 4, "Hidráulico", true);
        Motocicleta moto = new Motocicleta("150", LocalDate.of(2020, 5, 20), "Honda", "Preto", 15000, 500, 45.5);
        Caminhao caminhao = new Caminhao("Caminhãozao", LocalDate.of(2018, 3, 15), "Scania", "Vermelho", 250000, 4, 12000.5);
        Bicicleta bicicleta = new Bicicleta("Bici", LocalDate.of(2021, 8, 10), "CX f12", "Verde", "Caloi", "Alumínio", 21, true, 0.0);
        Skate skate = new Skate("Drop", LocalDate.of(2021, 8, 10), "Drop Streetskate", "Preto", 0.0, "Drop StreetWear", "Redondas");

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement stmt = conn.createStatement()) {

            System.out.println("Conexão com o banco de dados estabelecida!");

            // Inserindo os dados diretamente com INSERT
            stmt.executeUpdate(carro.getInsert());
            stmt.executeUpdate(moto.getInsert());
            stmt.executeUpdate(caminhao.getInsert());
            stmt.executeUpdate(bicicleta.getInsert());
            stmt.executeUpdate(skate.getInsert());

            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou executar no banco de dados: " + e.getMessage());
        }
    }
}
