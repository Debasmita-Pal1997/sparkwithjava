package assignment;

import java.util.Scanner;

public class DoubleToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Double number");
		double d = sc.nextDouble();
		int i  = (int) d;
		System.out.println("double converted into int:"+i);

	}

}