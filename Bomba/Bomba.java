package Bomba;

public class Bomba {
	
	private double totallitros;
	private double valorlitro;
	
	public Bomba() {
		setTotallitros(500);
		setValorlitro(0);
	}
	
	public double abastecerPorLitro(int litro) {
		double valorpagar = litro * getValorlitro();
		setTotallitros(getTotallitros() - litro);
		return valorpagar;
	}
	
	public double abastecerPorValor(double valor) {
		double quantidadelitro = valor/getValorlitro();
		setTotallitros(getTotallitros() - quantidadelitro);
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
