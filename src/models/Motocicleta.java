package models;

import java.time.LocalDate;

public class Motocicleta extends Automotor {
	private int cilindrada;
	private double torque;
	
	public Motocicleta(String modelo, LocalDate anoFabricacao, String montadora, String cor, double kilometragem, int cilindrada, double torque) {
		super(modelo, anoFabricacao, montadora, cor, kilometragem);
		this.cilindrada = cilindrada;
		this.torque = torque;
	}
	
	 @Override
	    public String getInsert() {
	        return String.format("INSERT INTO Motocicleta (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', '%s', '%s', '%s', %.2f, %d, %.2f);",
	                getModelo(), getAno_fabricacao(), getMontadora(), getCor(), getKilometragem(),
	                cilindrada, torque);
	  }
}
