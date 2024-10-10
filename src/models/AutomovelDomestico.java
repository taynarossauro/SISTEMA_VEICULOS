package models;

import java.time.LocalDate;

public class AutomovelDomestico extends Automotor {
	private int qtd_max_passageiros;
	private String tipo_freio;
	private boolean airbag;
	
	public AutomovelDomestico (String modelo, LocalDate ano_fabricacao, String montadora, String cor, double kilometragem, 
			int qtd_max_passageiros, String tipo_freio, boolean airbag) {
		super(modelo, ano_fabricacao, montadora, cor, kilometragem);
		this.qtd_max_passageiros = qtd_max_passageiros;
		this.tipo_freio = tipo_freio;
		this.airbag = airbag;
	}
	
	 @Override
	    public String getInsert() {
	        return String.format("INSERT INTO AutomovelDomestico (modelo, ano_fabricacao, montadora, cor, kilometragem, qtd_max_passageiros, tipo_freio, airbag) VALUES ('%s', '%s', '%s', '%s', %.2f, %d, '%s', %b);",
	                getModelo(), getAno_fabricacao(), getMontadora(), getCor(), getKilometragem(),
	                qtd_max_passageiros, tipo_freio, airbag);
	    }
}
