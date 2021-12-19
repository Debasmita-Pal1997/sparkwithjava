package assignmentday4;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		int number,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer number");
		number = sc.nextInt();
		
		if(number == 1)
			System.out.println("1 is neither prime nor composite");
		
		if(number == 0)
			System.out.println("0 is neither prime nor composite");
		
		for(int i =2;i<number/2;i++)
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
