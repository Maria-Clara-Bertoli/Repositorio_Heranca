package Nave_Espacial;

public class MillenniumFalcon extends Apollo11{
	
	private float classehiperpropulsor;

	public MillenniumFalcon(double velocidademaxima, String tipocombustivel, float classehiperpropulsor) {
		super(velocidademaxima, tipocombustivel);
		this.classehiperpropulsor = classehiperpropulsor;
	}
	
	public float alterarClasse(float classe) {
		setClassehiperpropulsor(classe);
		return getClassehiperpropulsor();
	}

	public float getClassehiperpropulsor() {
		return classehiperpropulsor;
	}

	public void setClassehiperpropulsor(float classehiperpropulsor) {
		this.classehiperpropulsor = classehiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("MillenniumFalcon [classehiperpropulsor=");
		builder.append(classehiperpropulsor);
		builder.append("]");
		return builder.toString();
	}
}
