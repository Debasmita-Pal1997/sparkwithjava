package assignment;

import java.util.Scanner;
/*Java Program to convert int type variables to String*/

public class IntToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		String s = String.valueOf(number);
		System.out.println(number+100);// because + is binary plus operator  
		System.out.println(s+100);
		System.out.println("int converted into String:"+s);
		

	}

}
