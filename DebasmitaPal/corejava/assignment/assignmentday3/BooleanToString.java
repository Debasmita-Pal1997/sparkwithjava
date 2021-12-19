package assignment;

import java.util.Scanner;
/*Java Program to convert boolean variables into string*/

public class BooleanToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Boolean value");
		boolean b = sc.nextBoolean();
		String s = String.valueOf(b);
		System.out.println("Boolean converted into string:"+s);

	}

}