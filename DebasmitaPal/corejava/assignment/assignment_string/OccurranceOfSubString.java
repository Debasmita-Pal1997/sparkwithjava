package assignmentstring;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class OccurranceOfSubString {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		str1 = sc.nextLine();
		System.out.println("enter the Substring");
		str2 = sc.nextLine();
		
		int count =0,index =0;
		ArrayList<Integer> indices = new ArrayList<>();
		while ((index = str1.indexOf(str2, index)) != -1 ){
            count++;
            indices.add(index);
            index++;
        }
        System.out.println("Total occurrences of a substring in the given string: " + count);
        System.out.println("Indices of substring are: "+indices);
    }
		

	}


