package assignmentstring;

public class IsAlphaNumeric {
	
	public static Boolean isAlphaNumeric(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') &&
                    !(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9')) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

	public static void main(String[] args) {
		String s = "ABC12";
        System.out.println("IsAlphaNumeric: " + isAlphaNumeric(s));

	}

}
