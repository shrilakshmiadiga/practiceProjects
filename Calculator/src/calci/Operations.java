package calci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations {

	Scanner sc = new Scanner(System.in);
	public void divide()
	{ 
		Double numerator;
		Double denominator;
		System.out.println("Enter numerator");
		try {
		numerator = sc.nextDouble();
		System.out.println("Enter denominator");
		denominator = sc.nextDouble();
		
		String result = (0.0 == denominator)?
				"Invalid denominator":
				"Result is : "+ (numerator/denominator);
			
		System.out.println(result);
		}catch (InputMismatchException ie) {
			System.out.println("Input data types mismatch!!");
		}catch(Exception e) {
			System.out.println("Error occured");
		}
	}
	
	public void calculatePower() {
		Double base;
		Double exponent;
		System.out.println("Enter base value");
		try {
		base = sc.nextDouble();
		System.out.println("Enter exponent value");
		exponent = sc.nextDouble();
		
		String result = (base < 0 && exponent < 1)?
				"Invalid input":
				"Result is : "+ Math.pow(base, exponent);
		
		System.out.println(result);	
		}catch (InputMismatchException ie) {
			System.out.println("Input data types mismatch!!");
		}catch(Exception e) {
			System.out.println("Error occured");
		}
	}
	
	public void sumOfArray() {
		Integer numOfElements;
		System.out.println("Enter number of elements");
		try {
		numOfElements = sc.nextInt();
		
		Double[] arrayElements = new Double[numOfElements];
		Double sum = 0.0;
		System.out.println("Enter "+numOfElements+" elements");
		for(int i =0; i < numOfElements; i++) {
			arrayElements[i] = sc.nextDouble();
			sum += arrayElements[i];
		} 
		System.out.println("Sum is : "+sum);
		}catch (InputMismatchException ie) {
			System.out.println("Input data types mismatch!!");
		}catch(Exception e) {
			System.out.println("Error occured");
		}
	}

}
