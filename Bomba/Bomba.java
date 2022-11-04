package Bomba;

public class Bomba {
	
	private double totallitros;
	private double valorlitro;
	
	public Bomba(double totallitros, double valorlitro) {
		this.totallitros = totallitros;
		this.valorlitro = valorlitro;
	}
	
	public double abastecerPorLitro(int litro) {
		double valorpagar = litro * getValorlitro();
		return valorpagar;
	}
	
	public double abastecerPorValor(double valor) {
		double quantidadelitro = valor/getValorlitro();
		return quantidadelitro;
	}

	public double getTotallitros() {
		return totallitros;
	}

	public void setTotallitros(double totallitros) {
		this.totallitros = totallitros;
	}

	public double getValorlitro() {
		return valorlitro;
	}

	public void setValorlitro(double valorlitro) {
		this.valorlitro = valorlitro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totallitros=");
		builder.append(totallitros);
		builder.append(", valorlitro=");
		builder.append(valorlitro);
		builder.append("]");
		return builder.toString();
	}
}
