package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Order;
import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Order order = new Order();

		System.out.print("Entre com o caminho de um arquivo CVS:");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String itens[] = linha.split(",");
				order.addProduct(new Product(itens[0], Double.parseDouble(itens[1]), Integer.parseInt(itens[2])));
				linha = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Product product : order.getProducts()) {
			System.out.println(product);
		}
		sc.close();

	}

}
