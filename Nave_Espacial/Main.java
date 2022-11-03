package Nave_Espacial;

public class Main {

	public static void main(String[] args) {
	
		MillenniumFalcon millenium = new MillenniumFalcon(800000000, "Cristal Rapecino", 8);
		
		millenium.aumentarVelocidade();
		millenium.aumentarVelocidade();
		millenium.alterarClasse(17);
		millenium.alterarCombustivel("Cristal Tonano");
		
		System.out.println(millenium.toString()); 

	}

}
