package exercicio2.entities;

public abstract class Pessoa {
	private String name;
	private Double anualIncome;

	public Pessoa() {
	}

	public Pessoa(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract Double impostoDeRenda();

	@Override
	public String toString() {
		return String.format("%s: $ %.2f", getName(), impostoDeRenda());
	}

}
