package assignmentday4;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		number = sc.nextInt();
			if(number%2 ==0)
				System.out.println("Even");
			
			else
				System.out.println("Odd");
		

	}

}
