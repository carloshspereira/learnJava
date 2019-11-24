import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca1 = sc.nextInt();
		int qtPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		double totalPeca1 = qtPeca1 * valorPeca1;
		sc.nextLine();
		int peca2 = sc.nextInt();
		int qtPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		double totalPeca2 = qtPeca2 * valorPeca2;
		double total = totalPeca1 + totalPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();

	}

}
