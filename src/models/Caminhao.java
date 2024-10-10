package models;

import java.time.LocalDate;


public class Caminhao extends Automotor {
	//Declarando variáveis
	private int qtd_eixos;
	private double peso_bruto;
	
	//Cirando construtores da classe e chamando a super classe
	public Caminhao(String modelo, LocalDate anoFabricacao, String montadora, String cor, double kilometragem, int qtd_eixos, double peso_bruto) {
		super(modelo, anoFabricacao, montadora, cor, kilometragem);
		this.qtd_eixos = qtd_eixos;
		this.peso_bruto = peso_bruto;
	}
	
	//@return getters dos construtores

    public int getQtdEixos() {
        return qtd_eixos;
    }

    public double getPesoBruto() {
        return peso_bruto;
    }
	
    
    @Override
	public String getInsert() {
	    return getModelo() +  ", " + getAno_fabricacao() + ", " + getMontadora() + ", " + getCor() + ", " +  getQtdEixos() + ", " + getPesoBruto();
	}
}
