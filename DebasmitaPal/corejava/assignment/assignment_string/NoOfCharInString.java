package assignmentstring;

public class NoOfCharInString {

	public static void main(String[] args) {
		String s1 = "The best of both worlds";
		
		int count = 0;
		
		for(int i =0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				count++;
		}
		
		System.out.println("The Length of words:"+count);

	}

}
