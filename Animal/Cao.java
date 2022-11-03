package Animal;

public class Cao extends Mamifero{

	public Cao(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade) {
		super(sexo, distancia, alimentodia, tipo, som, velocidade);
	}
	
	@Override
	public String definirTipo(String tipo) {
		setTipo(tipo);
		return getTipo();
	}
	
	@Override
	public String som() {
		setSom("Au, Au");
		return getSom();
	}
}
