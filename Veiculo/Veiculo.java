package Veiculo;

public class Veiculo {
	
	private boolean motor;

	public Veiculo(boolean motor) {
		this.motor = motor;
	}
	
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	public boolean getMotor() {
		return motor;
	}
	
	public boolean ligar() {
		setMotor(true);
		return getMotor();
	}
	
	public boolean desligar() {
		setMotor(false);
		return getMotor();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
}
