
package student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDataManagement {
	public static void main(String args[]) {
		DataManager manager = new DataManager();
		boolean option = true;
		int choice;
		while (option) {
			System.out.println("-----------------------------------------");
			System.out.println("Select from the following \n");
			System.out.println("1. Add Student");
			System.out.println("2. View Student data");
			System.out.println("3. Calculate average grade");
			System.out.println("4. Exit");
			System.out.println();
			try {
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					manager.verifyAndAddStudent();
					break;

				case 2:
					manager.viewStudent();
					break;

				case 3:
					manager.calculateAvgGrade();
					break;

				case 4:
					System.out.println("Exiting ....");
					option = false;
					break;

				default:
					System.out.println("Invalid option");
					break;
				}
			} catch (InputMismatchException ie) {
				System.out.println("Input data types mismatch!!");
			} catch (Exception e) {
				System.out.println("An error occured");
			}

		}

	}
}
