package assignmentday4;

import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
		char ch='l';
		 
		 if(Character.isLowerCase(ch))
			 System.out.println(ch+" ->"+ Character.toUpperCase(ch) );
		 
		 else
			 System.out.println(ch+" ->"+ Character.toLowerCase(ch));
		 
		 

	}

}
