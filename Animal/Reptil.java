package Animal;

public class Reptil extends Animal{
	
	private boolean nadar;

	public Reptil(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade, boolean nadar) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade);
		this.nadar = nadar;
	}

	public boolean getNadar() {
		return nadar;
	}

	public void setNadar(boolean nadar) {
		this.nadar = nadar;
	}
	
	public boolean nadar() {
		setNadar(true);
		return getNadar();
	}
	
	public boolean descansar() {
		setNadar(false);
		return getNadar();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [nadar=");
		builder.append(nadar);
		builder.append("]");
		return builder.toString();
	}
}

	