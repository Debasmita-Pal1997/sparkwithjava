package assignmentstring;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {
		String sentence, result = " ";
		String allWords[];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sentence");
		sentence = sc.nextLine().toLowerCase();

		allWords = sentence.split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(allWords));

		for (String word : set) {
			result = result + word + " ";
		}

	}

}
