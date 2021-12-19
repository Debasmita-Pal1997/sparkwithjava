package assignmentday4;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		int number,digit, reverse =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		number = sc.nextInt();
		
		int temp = number;
		
		while(number>0)
		{
			digit = number%10;
			reverse = reverse*10+digit;
			number = number/10;
			
		}
		
		if(temp == reverse)
			System.out.println("Pallindrome");
		
		else
			System.out.println("Not Pallindrome");

	}

}
