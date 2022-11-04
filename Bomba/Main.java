package Bomba;

public class Main {

	public static void main(String[] args) {
		
		BombaDiesel diesel = new BombaDiesel();
		System.out.println("Valor a pagar: " + diesel.abastecerPorLitro(59)); 
		
		BombaGasolina gasolina = new BombaGasolina();
		System.out.println("Quantidade de litros: " + gasolina.abastecerPorValor(80));
		
		BombaEtanol etanol = new BombaEtanol();
		System.out.println("Quantidade de litros: " + etanol.abastecerPorValor(168)); 
		
		System.out.println(diesel.toString());
		System.out.println(gasolina.toString());
		System.out.println(etanol.toString());
	}
}
