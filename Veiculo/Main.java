package Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Moto moto = new Moto(false, 250);
		Carro carro = new Carro(true, 4);
		Caminhao caminhao = new Caminhao(true, 9);
		
		moto.quantidadeCilindradas(150);
		moto.ligar();
		carro.quantidadePortas(2);
		carro.desligar();
		caminhao.descerEixo();
		caminhao.subirEixo();
		caminhao.subirEixo();
		caminhao.desligar();
		
		System.out.println(moto.toString());
		System.out.println(carro.toString());
		System.out.println(caminhao.toString());
	}

}
