import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;
		if (a >= b) {
			result = (b + 24) - a;
		} else {
			result = b - a;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)", result);
		sc.close();
	}

}
