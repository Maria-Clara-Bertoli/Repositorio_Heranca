package Animal;

public class Tartaruga extends Reptil{
	
	private boolean casco;

	public Tartaruga(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade, boolean nadar, boolean casco) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade, nadar);
		this.casco = casco;
	}
	
	public boolean getCasco() {
		return casco;
	}

	public void setCasco(boolean casco) {
		this.casco = casco;
	}
	
	@Override
	public String som() {
		setSom("-");
		return getSom();
	}
	
	public boolean esconder() {
		setCasco(true);
		return getCasco();
	}
	
	public boolean aparecer() {
		setCasco(false);
		return getCasco();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Tartaruga [casco=");
		builder.append(casco);
		builder.append("]");
		return builder.toString();
	}
}
