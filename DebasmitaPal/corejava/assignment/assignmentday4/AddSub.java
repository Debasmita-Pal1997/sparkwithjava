package assignmentday4;

import java.util.Scanner;

public class AddSub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Add\n2. Sub");
		int choice = sc.nextInt();
		
		int number1;
		int number2;
		int result;
		
		if (choice == 1) {
			System.out.println("Enter first number");
			number1 = sc.nextInt();
			System.out.println("Enter second number");
			number2 = sc.nextInt();
			result = number1 + number2;
		} else {
			System.out.println("Enter first number");
			number1 = sc.nextInt();
			System.out.println("Enter second number");
			number2 = sc.nextInt();
			result = number1 - number2;
		}
		
		System.out.println("Result: " + result);
		System.out.println("Do you want to continue? Y or N");
		
		sc.nextLine();		
		choice = sc.nextLine().charAt(0);
		
		if (choice == 'Y' || choice == 'y') main(args);
		

	}

}
