package Animal;

public class Gato extends Mamifero{
	
	public Gato(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade, float temperatura) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade, temperatura);
	}
	
	@Override
	public String som() {
		setSom("Miau");
		return getSom();
	}

}
