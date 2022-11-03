package Animal;

public class Gato extends Mamifero{
	
	public Gato(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade);
	}

	@Override
	public String definirTipo(String tipo) {
		setTipo(tipo);
		return getTipo();
	}
	
	@Override
	public String som() {
		setSom("Miau");
		return getSom();
	}

}
