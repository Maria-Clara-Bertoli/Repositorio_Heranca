package Nave_Espacial;

public class NaveEspacial {
	
	private double velocidadeMaxima;

	public NaveEspacial(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public double aumentarVelocidade() {
		setVelocidadeMaxima(getVelocidadeMaxima() + 1);
		return getVelocidadeMaxima();
	}
	
	public double diminuirVelocidade() {
		if(getVelocidadeMaxima() > 0) {
		setVelocidadeMaxima(getVelocidadeMaxima() - 1);
		}
		return getVelocidadeMaxima();
	}
	
	public double turbo() {
		setVelocidadeMaxima(getVelocidadeMaxima() + 10000);
		return getVelocidadeMaxima();
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveEspacial [velocidadeMaxima=");
		builder.append(velocidadeMaxima);
		builder.append("]");
		return builder.toString();
	}
}
