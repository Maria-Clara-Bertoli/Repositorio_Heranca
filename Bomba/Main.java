package Bomba;

public class Main {

	public static void main(String[] args) {
		
		BombaDiesel diesel = new BombaDiesel(0, 3);
		System.out.println("Valor a pagar: " + diesel.abastecerPorLitro(59)); 
		
		BombaGasolina gasolina = new BombaGasolina(0, 3);
		System.out.println("Quantidade de litros: " + gasolina.abastecerPorValor(80));
		
		BombaEtanol etanol = new BombaEtanol(0, 3);
		System.out.println("Quantidade de litros: " + etanol.abastecerPorValor(168)); 
	}
}
