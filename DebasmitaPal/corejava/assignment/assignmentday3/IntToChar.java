package assignment;

import java.util.Scanner;
/*Java Program to convert int type variables to char*/

public class IntToChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		char ch = (char)number;
		System.out.println("Int converted into character:"+ch);

	}

}