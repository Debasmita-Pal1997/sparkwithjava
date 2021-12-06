package assignment;

import java.util.Scanner;

public class StringToBoolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s1 = sc.nextLine();
		Boolean b1 = Boolean.parseBoolean(s1);
		System.out.println("String converted into boolean:"+b1);

	}

}