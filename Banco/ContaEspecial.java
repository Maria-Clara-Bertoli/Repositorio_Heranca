package Banco;

public class ContaEspecial extends Conta{
	
	private int diassemjuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diassemjuros, double limite) {
		super(banco, agencia, numeroconta, saldo);
		this.diassemjuros = diassemjuros;
		this.limite = limite;
	}

	public int getDiassemjuros() {
		return diassemjuros;
	}

	public void setDiassemjuros(int diassemjuros) {
		this.diassemjuros = diassemjuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("ContaEspecial [diassemjuros=");
		builder.append(diassemjuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
}
