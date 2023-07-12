package easy;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/*
 * Problem statement
 * 
 * Given an integer x, return true if x is a palindrome , and false otherwise.
 */

public class IntegerPallindrome {

	public static boolean isPalindrome(int x) {
		String numString = String.valueOf(x);
		StringBuilder sb = new StringBuilder();
		for (int i = numString.length() - 1; i >= 0; i--) {
			sb.append(numString.charAt(i));
		}
		return Objects.equals(numString, sb.toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int num = sc.nextInt();
			System.out.println(isPalindrome(num));
		} catch (InputMismatchException ie) {
			System.out.println("Invalid input");
		} catch (Exception e) {
			System.out.println("Some error occured");
		}
		sc.close();
	}

}
