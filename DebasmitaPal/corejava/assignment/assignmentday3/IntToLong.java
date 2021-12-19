package assignment;

import java.util.Scanner;

/*Java Program to convert int type variables to long*/

public class IntToLong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		long l = (long)number;
		System.out.println("Int converted into Long:"+l);
		

	}

}