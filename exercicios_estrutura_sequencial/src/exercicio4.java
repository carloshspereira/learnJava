import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int qtHoras = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = qtHoras * valorHora;

		System.out.printf("NUMBER = %d%nSALARY = US$ %.2f%n", numero, salario);

		sc.close();

	}

}
