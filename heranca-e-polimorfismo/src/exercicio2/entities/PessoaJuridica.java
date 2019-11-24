package exercicio2.entities;

public class PessoaJuridica extends Pessoa {
	private int numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendeAnual, int numeroFuncionarios) {
		super(nome, rendeAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double impostoDeRenda() {
		double imposto;
		if (getNumeroFuncionarios() > 10) {
			imposto = getAnualIncome() * 0.14;
		} else {
			imposto = getAnualIncome() * 0.16;
		}

		return imposto;
	}

}
