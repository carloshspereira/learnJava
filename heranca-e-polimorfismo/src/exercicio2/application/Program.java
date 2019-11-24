package exercicio2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio2.entities.Pessoa;
import exercicio2.entities.PessoaFisica;
import exercicio2.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberEmployees));

			}

		}
		double totalTaxes = 0.0;
		System.out.println("TAXES PAID:");
		for (Pessoa pessoa : list) {
			System.out.println(pessoa);
			totalTaxes += pessoa.impostoDeRenda();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		sc.close();

	}

}