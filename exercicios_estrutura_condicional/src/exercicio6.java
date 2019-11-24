import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();

		String result;
		if (a >= 0 && a <= 25) {
			result = "Intervalo [0, 25]";
		} else {
			if (a > 25 && a <= 50) {
				result = "Intervalo (25,50]";
			} else {
				if (a > 50 && a <= 75) {
					result = "Intervalo (50, 75]";
				} else {
					if (a > 75 && a <= 100) {
						result = "Intervalo (75,100]";
					} else {
						result = "FORA DO INTERVALO";
					}
				}
			}
		}
		System.out.println(result);
		sc.close();
	}

}
