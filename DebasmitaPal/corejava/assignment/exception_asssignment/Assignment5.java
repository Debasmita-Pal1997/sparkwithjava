package exceptionasssignment;

import java.util.Scanner;

/* Write a Program with a division method who receives two integer numbers and performs the division operation. The method should declare that it throws ArithmeticException. 
 * This exception should be handled in the main method.*/

public class Assignment5 {
	
	public static double division(int number1, int number2)throws ArithmeticException{
		return number1/number2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int number2 = sc.nextInt();
		
		try {
			double remainder = division(number1,number2);
			System.out.println(remainder);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
