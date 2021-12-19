package exceptionasssignment;

import java.util.InputMismatchException;

/*
Write a class MathOperation which accepts integers from command line. 
Create an array using these parameters. Loop through the array and obtain the sum and 
average of all the elements. 
Display the result. 
Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
For example: The class would be invoked as follows: 
C:>java MathOperation 1900, 4560, 0, 32500
 * */

public class Assignment4 {

	public static void main(String[] args) {
		int number = args.length;

		for (int i = 0; i < number; i++)
			if (args[i].charAt((args[i]).length() - 1) == ',')
				args[i] = args[i].replace(",", ",");

		int arr[] = new int[number];
		int sumofArray = 0;
		double avgOfArray = 0;

		try {
			for (int i = 0; i < number; i++)
				arr[i] = Integer.parseInt(args[i]);

			for (int i = 0; i < number; i++)
				sumofArray += arr[i];

			avgOfArray = sumofArray / number;

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		System.out.println("sumofArray: " + sumofArray);
		System.out.println("avgOfArray: " + avgOfArray);

	}

}
