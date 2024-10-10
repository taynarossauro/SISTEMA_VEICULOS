package models;

import java.time.LocalDate;

public class Motocicleta extends Automotor {
	//Declarando variáveis
	private int cilindrada;
	private double torque;
	
	//Criando construtores da classe e chamando a super classe
	public Motocicleta(String modelo, LocalDate anoFabricacao, String montadora, String cor, double kilometragem, int cilindrada, double torque) {
		super(modelo, anoFabricacao, montadora, cor, kilometragem);
		this.cilindrada = cilindrada;
		this.torque = torque;
	}
	
	//@return getters dos construtores

	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public double getTorque() {
		return torque;
	}
	
 
	@Override
	public String getInsert() {
	    return getModelo() +  ", " + getAno_fabricacao() + ", " + getMontadora() + ", " + getCor() + ", " +  getCilindrada() + ", " + getTorque();
	}
}
