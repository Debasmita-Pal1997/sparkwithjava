package assignmentday4;

import java.util.Scanner;

public class ColorName {

	public static void main(String[] args) {
		String colorCode;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Color code");
		colorCode = sc.nextLine();
		
		switch(colorCode)
		{
		case "R":
			System.out.println("R->Red");
			break;
			
		case "B":
			System.out.println("B->Blue");
			break;
			
		case "G":
			System.out.println("G->Green");
			break;
			
		case "O":
			System.out.println("O->Orange");
			break;
			
		case "Y":
			System.out.println("Y->Yellow");
			break;
			
		case "W":
			System.out.println("W->White");
			break;
			
		default:
			System.out.println("Invalid Code");
		}
		

	}

}
