package easy;

/*
 * Problem statement
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class SumOfTwoArrayIntegers {

	public static int[] twoSum(int[] nums, int target) {
		int[] resultArray = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					resultArray[0] = i;
					resultArray[1] = j;
					return resultArray;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int arraySize;
		int target;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		try {
			arraySize = sc.nextInt();
			int[] nums = new int[arraySize];
			System.out.println("Enter array elements");
			for (int i = 0; i < arraySize; i++) {
				nums[i] = sc.nextInt();
			}
			System.out.println("Enter target");
			target = sc.nextInt();

			int[] resultArray = twoSum(nums, target);
			if (Objects.isNull(resultArray))
				System.out.println("No combination available");
			else
				System.out.println("Indexes that make the target are [" + resultArray[0] + "," + resultArray[1] +"]");
			
		} catch (InputMismatchException ie) {
			System.out.println("Invalid input");
		}
		sc.close();
	}
}