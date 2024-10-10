package models;

import java.time.LocalDate;

public class Skate extends Automotor {
	private String marca;
	private String tipo_rodas;

	
	public Skate(String modelo, LocalDate anoFabricacao, String montadora, String cor, double kilometragem, String marca, String tipo_rodas) {
		super(modelo, anoFabricacao, montadora, cor, kilometragem);
		this.marca = marca;
		this.tipo_rodas = tipo_rodas;
	}

    @Override
    public String getInsert() {
        return String.format("INSERT INTO Skate (modelo, ano_fabricacao, montadora, cor, kilometragem, marca, tipo_rodas) VALUES ('%s', '%s', '%s', '%s', %.2f, '%s', '%s');",
                getModelo(), getAno_fabricacao(), getMontadora(), getCor(), getKilometragem(),
                marca, tipo_rodas);
    }
}
