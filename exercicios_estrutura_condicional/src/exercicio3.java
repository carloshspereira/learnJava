import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a > b && a % b == 0) || (b > a && b % a == 0)) {
			System.out.println("S�O MULTIPLOS");
		} else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		sc.close();
	}

}
