package Banco;

public class ContaSimples extends Conta{
	
	private double saldopoupanca;
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldopoupanca) {
		super(banco, agencia, numeroconta, saldo);
		this.saldopoupanca = saldopoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		setSaldopoupanca(getSaldopoupanca() + valor);
		return true;
	}
	
	public boolean saquePoupanca(double valor) {
		if(valor <= getSaldopoupanca()) {
		setSaldopoupanca(getSaldopoupanca() - valor);
		}
		else {
			System.out.println("Não há saldo suficiente para efetuar o saque.");
		}
		return true;
	}

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		this.saldopoupanca = saldopoupanca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("ContaSimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append("]");
		return builder.toString();
	}
}
