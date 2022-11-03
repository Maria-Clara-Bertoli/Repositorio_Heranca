package Ambiente;

public class Sala extends Ambiente{
	
	private boolean tv;
	
	public Sala(float area, boolean tv) {
		super(area);
		this.tv = tv;
	}

	public boolean getTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}
	
	public boolean ligar() {
		setTv(true);
		return getTv();
	}
	
	public boolean desligar() {
		setTv(false);
		return getTv();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Sala [tv=");
		builder.append(tv);
		builder.append("]");
		return builder.toString();
	}
}
