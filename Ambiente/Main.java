package Ambiente;

public class Main {

	public static void main(String[] args) {
		
		Quarto quarto = new Quarto(5, 5);
		Sala sala = new Sala(7, true);
		Banheiro banheiro = new Banheiro(4, false);
		Cozinha cozinha = new Cozinha(9, false);
		
		quarto.quebrarParede(2);
		quarto.aumentarCapacidade();
		sala.desligar();
		banheiro.encher();
		cozinha.ligar();
		
		System.out.println(quarto.toString());
		System.out.println(sala.toString());
		System.out.println(banheiro.toString());
		System.out.println(cozinha.toString());

	}

}
