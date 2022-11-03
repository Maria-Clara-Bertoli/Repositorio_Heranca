package Ambiente;

public class Ambiente {
	
	private float area;
	
	public Ambiente(float area) {
		this.area = area;
	}
	
	public void setArea(float area) {
		this.area = area;
	}
	
	public float getArea() {
		return this.area;
	}
	
	public float quebrarParede(float valor) {
		return area + valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ambiente [area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}
}
