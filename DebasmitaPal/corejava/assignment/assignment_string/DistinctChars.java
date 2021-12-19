package assignmentstring;

import java.util.Scanner;

public class DistinctChars {

	public static void main(String[] args) {
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		str1 = sc.nextLine();
		
		System.out.println("The distinct characters in string are "+str1.chars().distinct().count());



	}

}
