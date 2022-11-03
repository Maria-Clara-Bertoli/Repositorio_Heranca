package Veiculo;

public class Moto extends Veiculo {
	
	private int cilindradas;

	public Moto(boolean motor, int cilindradas) {
		super(motor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public int quantidadeCilindradas(int quantidade) {
		setCilindradas(quantidade);
		return getCilindradas();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Moto [cilindradas=");
		builder.append(cilindradas);
		builder.append("]");
		return builder.toString();
	}
}
