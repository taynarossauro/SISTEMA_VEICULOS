package models;

import java.time.LocalDate;

//Declarando variáveis
public abstract class Automotor {
	private String modelo;
	private LocalDate ano_fabricacao;
	private String montadora;
	private String cor;
	private double kilometragem; //Representa o odômetro

	//Cirando construtores da classe e chamando a super classe
    public Automotor(String modelo, LocalDate ano_fabricacao, String montadora, String cor, double kilometragem) {
    	//Validação campos vazios
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo é obrigatório.");
        }
        if (ano_fabricacao == null) {
            throw new IllegalArgumentException("Ano de fabricação é obrigatório.");
        }
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }
    
	//@return getters dos construtores

	public String getModelo() {
		return modelo;
	}
	
	public LocalDate getAno_fabricacao() {
		return ano_fabricacao;
	}
	
	public String getMontadora() {
		return montadora;
	}
	
	public String getCor() {
		return cor;
	}
	
	public double getKilometragem() {
		return kilometragem;
	}
	
    public abstract String getInsert();

	
}
