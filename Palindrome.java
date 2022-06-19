package week2.day1.Assignment;

public class Palindrome {
	public static void main(String[] args) {
		// palindrome
		palindrome("madam");
	}

	public static void palindrome(String value) {

		String revValue = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			revValue = revValue + value.charAt(i);
		}
		
		if (value.equalsIgnoreCase(revValue))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}

}
