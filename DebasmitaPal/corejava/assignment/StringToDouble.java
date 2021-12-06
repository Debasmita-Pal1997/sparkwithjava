package assignment;

import java.util.Scanner;

public class StringToDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String s = sc.nextLine();
		double d = Double.parseDouble(s);
		System.out.println("String converted into double:"+d);

	}

}