package calci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorManager {

	public CalculatorManager() {
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Operations operations = new Operations();
		try {
			while (true) {

				System.out.println();
				System.out.println("Select your choice");
				System.out.println("1. Divide 2 numbers");
				System.out.println("2. Power of a number");
				System.out.println("3. Sum of array");
				System.out.println("4. Exit");
				System.out.println();
				int options = sc.nextInt();
				switch (options) {
				case 1:
					operations.divide();
					break;
				case 2:
					operations.calculatePower();
					break;
				case 3:
					operations.sumOfArray();
					break;
				case 4:
					System.out.println("Exiting....");
					System.exit(0);
					break;
				default:
					break;
				}
			}
		} catch (InputMismatchException ie) {
			System.out.println("Input data types mismatch!!");
		} catch (Exception e) {
			System.out.println("Error occured");
		}

	}

}
