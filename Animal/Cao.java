package Animal;

public class Cao extends Mamifero{

	public Cao(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade, float temperatura) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade, temperatura);
	}
	
	@Override
	public String som() {
		setSom("Au, Au");
		return getSom();
	}
}
