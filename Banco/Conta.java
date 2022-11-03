package Banco;

public class Conta {
	
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	
	public Conta(String banco, int agencia, int numeroconta, double saldo) {
		this.banco = banco;
		this.agencia = agencia;
		this.numeroconta = numeroconta;
		this.saldo = saldo;
	}
	
	public boolean Deposito(double valor) {
		setSaldo(getSaldo() + valor);
		return true;
	}
	
	public boolean Saque(double valor){
		if(valor <= getSaldo()) {
		setSaldo(getSaldo() - valor);
		}
		else {
			System.out.println("Não há saldo suficiente para efetuar o saque.");
		}
		return true;	
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
}
