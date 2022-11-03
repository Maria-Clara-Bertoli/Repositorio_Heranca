package Pessoa;

public class Main {

	public static void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica("Maria", "Rio do Sul", "765.098.256-65", "Solteira");
		PessoaJuridica pj1 = new PessoaJuridica("Tecnologia Implementações", "Rio do Sul", "645746476535532532", "Tecnologia");
		
		System.out.println(pf1.toString());
		System.out.println(pj1.toString());
	}

}
