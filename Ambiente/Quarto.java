package Ambiente;

public class Quarto extends Ambiente{
	
	private int capacidade;
	
	public Quarto(float area, int capacidade) {
		super(area);
		this.capacidade = capacidade;
	}
	
	public int aumentarCapacidade() {
		setCapacidade(getCapacidade() + 1);
		return getCapacidade();
	}
	
	public int diminuirCapacidade() {
		if(getCapacidade() > 0) {
		setCapacidade(getCapacidade() - 1);
		}
		else {
			System.out.println("Não há indivíduos no quarto.");
		}
		return getCapacidade();
	}
	
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append("]");
		return builder.toString();
	}
}
