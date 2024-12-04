package models;

import java.time.LocalDate;

public class Bicicleta extends Automotor {
	//Declarando variáveis
	private String marca;
	private String material;
	private int qtd_marchas;
	private boolean amortecedor;
	
	//Criando construtores da classe e chamando a super classe
	public Bicicleta(String modelo, LocalDate anoFabricacao, String montadora, String cor, String marca, String material, int qtd_marchas, boolean amortecedor, double kilometragem) {
		super(modelo, anoFabricacao, montadora, cor, kilometragem);
		this.marca = marca;
		this.material = material;
		this.qtd_marchas = qtd_marchas;
		this.amortecedor = amortecedor;
}
	
	//@return getters dos construtores
	
    public String getMarca() {
        return marca;
    }

    public String getMaterial() {
        return material;
    }

    public int getQtd_marchas() {
        return qtd_marchas;
    }

    public boolean getAmortecedor() {
        return amortecedor;
    }	
	
    
	@Override
	public String getInsert() {
	    return getModelo() +  ", " + getAno_fabricacao() + ", " + getMontadora() + ", " + getCor() + ", " + getKilometragem() + ", " +  getMarca() + ", " + getMaterial() + getQtd_marchas() + ", " + getAmortecedor();
	}
}
