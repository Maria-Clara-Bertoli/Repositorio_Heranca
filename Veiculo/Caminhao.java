package Veiculo;

public class Caminhao extends Veiculo{
	
	private int eixo;
	
	public Caminhao(boolean motor, int eixo) {
		super(motor);
		this.eixo = eixo;
	}

	public int getEixo() {
		return eixo;
	}

	public void setEixo(int eixo) {
		this.eixo = eixo;
	}
	
	public int subirEixo() {
		if(getEixo() > 3) {
		setEixo(getEixo() - 1);
		}
		else {
			System.out.println("Não é possível subir mais eixos.");
		}
		return getEixo();
	}
	
	public int descerEixo() {
		if(getEixo() < 10) {
		setEixo(getEixo() + 1);
		}
		else {
			System.out.println("Não é possível descer mais eixos.");
		}
		return getEixo();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Caminhao [eixo=");
		builder.append(eixo);
		builder.append("]");
		return builder.toString();
	}
}
