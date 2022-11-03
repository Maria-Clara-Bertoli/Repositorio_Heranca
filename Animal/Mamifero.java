package Animal;

public class Mamifero extends Animal{
	
	private float temperatura;

	public Mamifero(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade);
		this.temperatura = temperatura;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [temperatura=");
		builder.append(temperatura);
		builder.append("]");
		return builder.toString();
	} 
}