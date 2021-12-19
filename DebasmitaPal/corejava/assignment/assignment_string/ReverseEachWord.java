package assignmentstring;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str , reversedWord ="" ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		str = sc.nextLine();
		
		String words[] = str.split(" ");
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversedWord+=sb.toString()+" ";
			
		}
		
		System.out.println("The Reverse strings are: "+reversedWord);

	}

}
