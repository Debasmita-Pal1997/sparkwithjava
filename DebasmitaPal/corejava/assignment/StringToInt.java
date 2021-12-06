package assignment;

import java.util.Scanner;

/*Java Program to convert string type variables into int*/

public class StringToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s1 = sc.nextLine();
		int number = Integer.parseInt(s1);
		System.out.println("String converted into int:"+number);
		

	}

}