package Animal;

public class Animal {
	
	private String sexo;
	private int distancia;
	private float alimentodia;
	private String tipo;
	private String som;
	private float velocidade;
	
	public Animal(String sexo, int distancia, float alimentodia, String tipo, String som, float velocidade) {
		this.sexo = sexo;
		this.distancia = distancia;
		this.alimentodia = alimentodia;
		this.tipo = tipo;
		this.som = som;
		this.velocidade = velocidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public float getAlimentodia() {
		return alimentodia;
	}

	public void setAlimentodia(float alimentodia) {
		this.alimentodia = alimentodia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public String definirSexo(String sexo) {
		setSexo(sexo);
		return getSexo();
	}
	
	public int distaciaPercorrida(int distancia) {
		setDistancia(distancia);
		return getDistancia();
	}
	
	public float alimentodia() {
		setAlimentodia(getAlimentodia() + 1);
		return getAlimentodia();
	}
	
	public String definirTipo(String tipo) {
		setTipo(tipo);
		return getTipo();
	}
	
	public String som() {
		setSom("-");
		return getSom();
	}
	
	public float Velocidade(float velocidade) {
		setVelocidade(velocidade);
		return getVelocidade();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [sexo=");
		builder.append(sexo);
		builder.append(", distancia=");
		builder.append(distancia);
		builder.append(", alimentodia=");
		builder.append(alimentodia);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", som=");
		builder.append(som);
		builder.append(", velocidade=");
		builder.append(velocidade);
		builder.append("]");
		return builder.toString();
	}
}
