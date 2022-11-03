package Banco;

public class Main {

	public static void main(String[] args) {
		
		ContaSimples cs1 = new ContaSimples("Siccob", 23, 756434328, 3000, 10000);
		ContaSimples ce1 = new ContaSimples("Siccob", 23, 756434328, 3000, 10000);
		
		cs1.depositoPoupanca(100);
		cs1.saquePoupanca(20);
		cs1.Deposito(1000);
		cs1.Saque(100);
		
		System.out.println("Poupança: " + cs1.getSaldopoupanca());
		System.out.println("Saldo: " + cs1.getSaldo());
	}

}
