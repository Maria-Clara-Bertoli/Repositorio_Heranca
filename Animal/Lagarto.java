package Animal;

public class Lagarto extends Reptil{
	
	private boolean veneno;
	
	public Lagarto(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade, boolean nadar, boolean veneno) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade, nadar);
		this.veneno = veneno;
	}
	
	public boolean getVeneno() {
		return veneno;
	}

	public void setVeneno(boolean veneno) {
		this.veneno = veneno;
	}
	
	public boolean enjetarVeneno() {
		setVeneno(true);
		return getVeneno();
	}
	
	public boolean naoEnjetarVeneno() {
		setVeneno(false);
		return getVeneno();
	}

	@Override
	public String som() {
		setSom("Tssssssssss");
		return getSom();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Lagarto [veneno=");
		builder.append(veneno);
		builder.append("]");
		return builder.toString();
	}
}
