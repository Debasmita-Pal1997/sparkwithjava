package assignmentstring;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesStringsFromArray {

	public static void main(String[] args) {
		String[] strColors = {"red","blue","green","red","yellow","green"};
		System.out.println("Original array:"+Arrays.toString(strColors));
		LinkedHashSet<String> lhSetColors = new LinkedHashSet<String>(Arrays.asList(strColors));
		String[] newArray = lhSetColors.toArray(new String[lhSetColors.size()]);
		
		System.out.println("Array after removing duplicates:"+Arrays.toString(newArray));

	}

}
