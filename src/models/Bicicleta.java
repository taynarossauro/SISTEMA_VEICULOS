package models;

import java.time.LocalDate;

public class Bicicleta extends Automotor {
	private String marca;
	private String material;
	private int qtd_marchas;
	private boolean amortecedor;
	
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

    public boolean isAmortecedor() {
        return amortecedor;
    }	
	
	
    @Override
    public String getInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao, montadora, cor, kilometragem, marca, material, qtd_marchas, amortecedor) VALUES ('%s', '%s', '%s', '%s', %.2f, '%s', '%s', %d, %b);",
                getModelo(), getAno_fabricacao(), getMontadora(), getCor(), getKilometragem(),
                marca, material, qtd_marchas, amortecedor);
    }
}
