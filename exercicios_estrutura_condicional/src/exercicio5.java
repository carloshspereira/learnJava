import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		double result;
		if (a == 1) {
			result = b * 4.0;
		} else {
			if (a == 2) {
				result = b * 4.5;
			} else {
				if (a == 3) {
					result = b * 5.0;
				} else {
					if (a == 4) {
						result = b * 2.0;
					} else {
						if (a == 5) {
							result = b * 1.5;
						} else {
							result = 0;
						}
					}
				}
			}
		}
		System.out.printf("Total: R$ %.2f", result);
		sc.close();
	}

}
