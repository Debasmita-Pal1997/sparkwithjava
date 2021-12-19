package assignmentday4;

import java.util.Scanner;

public class PositiveNegativeOrZero {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		
		if(number>0)
			System.out.println("positive number");
		
		else if(number<0)
			System.out.println("Negative number");
		
		else
			System.out.println("Zero number");

	}

}
