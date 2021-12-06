package assignment;

import java.util.Scanner;

public class DoubleToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Double");
		double d = sc.nextDouble();
		String s = String.valueOf(d);
		System.out.println("Double converted into String:"+s);

	}

}