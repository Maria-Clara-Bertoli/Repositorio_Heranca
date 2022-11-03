package Nave_Espacial;

public class Apollo11 extends NaveEspacial{
	
	private String tipocombustivel;
	
	public Apollo11(double velocidademaxima, String tipocombustivel) {
		super(velocidademaxima);
		this.tipocombustivel = tipocombustivel;
	}

	public String getTipocombustivel() {
		return tipocombustivel;
	}

	public void setTipocombustivel(String tipocombustivel) {
		this.tipocombustivel = tipocombustivel;
	}
	
	public String alterarCombustivel(String combustivel) {
		setTipocombustivel(combustivel);
		return getTipocombustivel();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Apollo11 [tipocombustivel=");
		builder.append(tipocombustivel);
		builder.append("]");
		return builder.toString();
	}
}
