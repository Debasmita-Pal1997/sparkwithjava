package assignmentstring;

public class IsAlpha {

	public static void main(String[] args) {
		char ch1 = '1';  
	    char ch2 = 'A';  
	    char ch3  ='B';  
	    boolean b1 = Character.isAlphabetic(ch1);  
	    boolean b2 = Character.isAlphabetic(ch2);  
	    boolean b3 = Character.isAlphabetic(ch3);  
	    System.out.println("The returned value for the first character is given as:"+"   "+b1);  
	    System.out.println("The returned value for the second character is given as:"+"  "+b2);  
	    System.out.println("The returned value for the third character is given as:"+"   "+b3);   

	}

}
