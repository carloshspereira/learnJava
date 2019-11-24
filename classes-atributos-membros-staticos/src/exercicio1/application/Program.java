package exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio1.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		double area = r.area();
		double perimeter = r.perimeter();
		double diagonal = r.diagonal();
		System.out.println(r);
		sc.close();

	}

}
