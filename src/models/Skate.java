package models;

import java.time.LocalDate;

public class Skate extends Automotor {
	//Declarando atributos
	private String marca;
	private String tipo_rodas;

	//Criando construtores da classe e chamando a super classe
	public Skate(String modelo, LocalDate anoFabricacao, String montadora, String cor, double kilometragem, String marca, String tipo_rodas) {
		super(modelo, anoFabricacao, montadora, cor, kilometragem);
		this.marca = marca;
		this.tipo_rodas = tipo_rodas;
	}
	
	//@return getters dos construtores

	public String getMarca() {
		return marca;
	}
	
	public String getTipoRodas() {
		return tipo_rodas;
	}

	@Override
	public String getInsert() {
	    return getModelo() +  ", " + getAno_fabricacao() + ", " + getMontadora() + ", " + getCor() + ", " + getKilometragem() + ", " +  getMarca() + ", " + getTipoRodas();
	}
}
