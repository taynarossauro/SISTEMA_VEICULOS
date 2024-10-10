package models;

import java.time.LocalDate;

public class Caminhao extends Automotor {
	private int qtd_eixos;
	private double peso_bruto;
	
	public Caminhao(String modelo, LocalDate anoFabricacao, String montadora, String cor, double kilometragem, int qtd_eixos, double peso_bruto) {
		super(modelo, anoFabricacao, montadora, cor, kilometragem);
		this.qtd_eixos = qtd_eixos;
		this.peso_bruto = peso_bruto;
	}
	
    public int getQtdEixos() {
        return qtd_eixos;
    }

    public double getPesoBruto() {
        return peso_bruto;
    }
	
    @Override
    public String getInsert() {
        return String.format("INSERT INTO Caminhao (modelo, ano_fabricacao, montadora, cor, kilometragem, qtd_eixos, peso_bruto) VALUES ('%s', '%s', '%s', '%s', %.2f, %d, %.2f);",
                getModelo(), getAno_fabricacao(), getMontadora(), getCor(), getKilometragem(),
                qtd_eixos, peso_bruto);
    }
}
