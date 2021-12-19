package assignmentday4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number,c=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for (int i =2;i<number/2;i++)
		{
			if(number%i == 0)
			{
				System.out.println(number+" is not prime number");
				c = 1;
				break;
			}
			
		}
		
		if(c==0)
			System.out.println(number+"  is prime number");
		
		

	}

}
