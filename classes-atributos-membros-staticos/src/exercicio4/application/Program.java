package exercicio4.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio4.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarQuantity = sc.nextDouble();
		
		double realValue = CurrencyConverter.dollarToReal (dollarPrice, dollarQuantity);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", realValue);
		sc.close();
		

	}

}