package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.excepitions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter account data");
			System.out.print("Number:");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder:");
			String holder = sc.nextLine();
			System.out.print("Initial balance:");
			double initialBalance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Withdraw limit:");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();

			Account c = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw:");
			double withdrawAmount = sc.nextDouble();

			c.withdraw(withdrawAmount);
			System.out.println("New balance:" + String.format("%.2f", c.getBalance()));
		} catch (DomainExceptions e) {
			System.out.println("Withdraw error:" + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
