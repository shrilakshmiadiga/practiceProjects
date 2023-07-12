package easy;

/* Problem Statement :
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

	Given a string s, return true if it is a palindrome, or false otherwise.
 */

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class PallindromePhrase {

public static boolean isPalindrome(String phrase) {
		
		phrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = phrase.length() - 1; i >= 0; i--) {
			sb.append(phrase.charAt(i));
		}
		return Objects.equals(phrase, sb.toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phrase");
		try {
			String phrase = sc.nextLine();
			System.out.println(isPalindrome(phrase));
		} catch (InputMismatchException ie) {
			System.out.println("Invalid input");
		} catch (Exception e) {
			System.out.println("Some error occured");
		}
		sc.close();
	}

}
