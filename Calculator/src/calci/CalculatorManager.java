package calci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorManager {

	public CalculatorManager() {
	}

	public static void main(String args[]) {
		
		Operations operations = new Operations();
		
		int options = 0;
		while (true) {
				System.out.println();
				System.out.println("Select your choice");
				System.out.println("1. Divide 2 numbers");
				System.out.println("2. Power of a number");
				System.out.println("3. Sum of array");
				System.out.println("4. Exit");
				System.out.println();
				Scanner sc = new Scanner(System.in);
				try {
				options = sc.nextInt();
				}catch (InputMismatchException ie) {
					System.out.println("Input data types mismatch!!");
				}catch(Exception e) {
					System.out.println("Error occured");
				}
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
		
	}
	
	 
}
