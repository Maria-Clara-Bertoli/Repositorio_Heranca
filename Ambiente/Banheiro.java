package Ambiente;

public class Banheiro extends Ambiente{
	
	private boolean banheira;
	
	public Banheiro(float area, boolean banheira) {
		super(area);
		this.banheira = banheira;
	}

	public boolean getBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}
	
	public boolean encher() {
		setBanheira(true);
		return getBanheira();
	}
	
	public boolean esvaziar() {
		setBanheira(false);
		return getBanheira();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Banheira [banheira=");
		builder.append(banheira);
		builder.append("]");
		return builder.toString();
	}
}
