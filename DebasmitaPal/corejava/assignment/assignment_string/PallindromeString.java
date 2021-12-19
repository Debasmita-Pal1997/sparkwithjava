package assignmentstring;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		String str ,temp, reverseWord="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		str = sc.nextLine();
		temp = str;
		StringBuilder sb = new StringBuilder(str);
		reverseWord = sb.reverse().toString();
		
		System.out.println("reverse word:"+ reverseWord);
		
		if(temp.equals(reverseWord))
			System.out.println("pallindrome");
		
		else
			System.out.println("not pallindrome");
		
		
		

	}

}
