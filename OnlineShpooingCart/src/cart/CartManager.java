package cart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CartManager {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		boolean option = true;
		int id;
		String name;
		Double price;
		int choice;
		while (option) {
			System.out.println("_________________________________________");
			System.out.println("Select from the following \n");
			System.out.println("1. Add item");
			System.out.println("2. Remove item");
			System.out.println("3. View items");
			System.out.println("4. Calculate total price");
			System.out.println("5. Exit");
			try {
				choice = sc.nextInt();

				switch (choice) {
				case 1:

					System.out.println("Enter ID:");
					id = sc.nextInt();
					System.out.println("Enter name:");
					name = sc.next();
					System.out.println("Enter price:");
					price = sc.nextDouble();
					cart.addItem(new Product(id, name, price));

					break;

				case 2:

					System.out.println("Enter ID:");
					id = sc.nextInt();
					
					cart.checkAndRemoveItem(id);

					break;

				case 3:

					cart.viewCart();
					break;

				case 4:

					cart.calculatePrice();
					break;

				case 5:

					option = false;
					break;

				default:
					System.out.println("Invalid option");
					break;
				}
			} catch (InputMismatchException ie) {
				System.out.println("Input data types mismatch!!");
			}
			

		}
		sc.close();
	}
	

}
