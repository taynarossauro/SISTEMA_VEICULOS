package models;

import java.time.LocalDate;

public class AutomovelDomestico extends Automotor {
	//Declarando variáveis
	private int qtd_max_passageiros;
	private String tipo_freio;
	private boolean airbag;
	
	//Cirando construtores da classe e chamando a super classe
	public AutomovelDomestico (String modelo, LocalDate ano_fabricacao, String montadora, String cor, double kilometragem, 
			int qtd_max_passageiros, String tipo_freio, boolean airbag) {
		super(modelo, ano_fabricacao, montadora, cor, kilometragem);
		this.qtd_max_passageiros = qtd_max_passageiros;
		this.tipo_freio = tipo_freio;
		this.airbag = airbag;
	}
	
	//@return getters dos construtores

	public int getQtdPassageiros() {
		return qtd_max_passageiros;
	}
	
	public String getTipoFreio() {
		return tipo_freio;
	}
	
	public boolean getAirbag() {
		return airbag;
	}
	
	
	@Override
	    public String getInsert() {
	        return 
	        	getModelo() +  ", " + getAno_fabricacao() + ", " + getMontadora() + ", " + getCor() + ", " +  getKilometragem() + ", " + getQtdPassageiros() + ", " + getTipoFreio()+ ", " + getAirbag();
	}
}
