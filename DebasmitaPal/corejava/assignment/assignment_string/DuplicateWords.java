package assignmentstring;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		String str1;
		int count =0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		
		String words[] = str1.split(" ");
		for(int i=0;i<words.length;i++) {
			count =1;
		
		
		for(int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j])) {
				count++;
				words[j]="0";
			}
		}
		
		if(count>1 && words[i]!="0")
			System.out.println(words[i]);
		
		}
		
		

	}

}
