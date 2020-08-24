package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

// sobre dar o valor de produtos, estoque

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price); // aqui o contrutor foi criado na classe

		// utilizando por chamadasd e getter e setteer - privados

		product.setName("Computer");
		System.out.println("Upadted name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price" + product.getPrice());

		// ~~~~~~~~~~~~

		System.out.println();
		System.out.println("Product data" + product);

		System.out.println();
		System.out.println("Enter the number of products to be add in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated dat: " + product);

		sc.close();

	}

}
