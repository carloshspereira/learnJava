package exercicio2.entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendeAnual, Double gastosSaude) {
		super(nome, rendeAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double impostoDeRenda() {
		double imposto;
		double deducaoSaude = getGastosSaude() * 0.5;

		if (getAnualIncome() < 20000.0) {
			imposto = getAnualIncome() * 0.15;
		} else {
			imposto = getAnualIncome() * 0.25;
		}

		return imposto - deducaoSaude;

	}

}
