package assignmentstring;

import java.util.HashMap;
import java.util.Scanner;

public class FindFirstRepeatedAndNonRepeatedChar {
	
	static void firstRepeatedNonRepeatedChar(String str)
	{
		HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
		
		char[] strArray = str.toCharArray();
		for(char c :strArray )
		{
			if(charCountMap.containsKey(c))
				charCountMap.put(c, charCountMap.get(c) + 1 );
			
			else
				charCountMap.put(c, 1);
		}
		
		for(char c : strArray)
		{
			if(charCountMap.get(c) == 1) {
				System.out.println("the first non repeated character in "+str+" is"+c);
			}
		}
		
		for(char c : strArray)
		{
			if(charCountMap.get(c) > 1) {
				System.out.println("the first  repeated character in "+str+" is"+c);
				break;
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.next();
        firstRepeatedNonRepeatedChar(str);

	}

}
