package Animal;

public class Main {

	public static void main(String[] args) {
		
	Cao cao = new Cao("Macho", 200, 150, "Golden Retriever", "-", 10, (float) 37.0);
	cao.definirTipo("Pinscher");
	cao.alimentodia();
	System.out.println(cao.som()); 
	
	Gato gato = new Gato("Macho", 150, 100, "Persa", "-", 15, (float) 37.0);
	gato.distaciaPercorrida(7);
	gato.definirSexo("Fêmea");
	System.out.println(gato.som());
	
	Tartaruga tartaruga = new Tartaruga("Fêmea", 1, 10, "Pintada", "-", 2, false, true);
	tartaruga.esconder();
	
	Lagarto lagarto = new Lagarto("Macho", 10, 50, "Dragão-de-Komodo", "-", 9, true, false);
	lagarto.descansar();
	lagarto.enjetarVeneno();
	lagarto.som();
	
	System.out.println(cao.toString());
	System.out.println(gato.toString());
	System.out.println(tartaruga.toString());
	System.out.println(lagarto.toString());
	}
}
