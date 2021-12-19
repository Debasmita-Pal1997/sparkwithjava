package assignmentstring;

import java.util.Scanner;

public class NoOfWords {
	
	static int wordCount(String str)
	{
		int count =0;
		char ch[] = new char[str.length()];
		for(int i =0;i<str.length();i++)
		{
			ch[i]= str.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            	count++;
				
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		str1 = sc.nextLine();
		System.out.println(wordCount(str1)+ "words");
		

	}

}
