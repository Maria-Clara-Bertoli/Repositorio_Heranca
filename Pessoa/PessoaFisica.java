package Pessoa;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private String estadocivil;
	
	public PessoaFisica(String nome, String endereco, String cpf, String estadocivil) {
		super(nome, endereco);
		this.cpf = cpf;
		this.estadocivil = estadocivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadocivil=");
		builder.append(estadocivil);
		builder.append("]");
		return builder.toString();
	}
}
