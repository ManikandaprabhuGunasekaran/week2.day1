package week2.day1.Assignment;

public class ReverseEvenWords {

	// Build a logic to reverse the even position words (output: I ma a erawtfos
	// tester)

	/*
	 * Pseudo Code:
	 * 
	 * Declare the input as Follow String test = "I am a software tester"; a) split
	 * the words and have it in an array b) Traverse through each word (using loop)
	 * c) find the odd index within the loop (use mod operator)
	 * 
	 * d)split the words and have it in an array
	 * 
	 * e)print the even position words in reverse order using another loop (nested
	 * loop) f) Convert words to character array if the position is even else print
	 * the word as it is(concatenate space at the end).
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String test = "I am a software tester";
		ReverseEvenWords rr = new ReverseEvenWords();
		rr.ReverseFunction("I am a software tester");

	}

	public void ReverseFunction(String test) {
		String[] split = test.split(" ");
		String rev = "";
		String string = "";
		String finalvalue = "";
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);

			if (i % 2 != 0) {
				char[] charArray = split[i].toCharArray();
				char[] revArray = new char[charArray.length];
				for (int j = charArray.length - 1; j >= 0; j--) {
					rev += charArray[j];
				}
				split[i] = rev;
				rev = "";

			} else {
				continue;
			}

		}
		for (int k = 0; k <= split.length - 1; k++) {
			finalvalue += split[k] + " ";

		}
		System.out.println("post the reverse order");
		System.out.println(finalvalue);

	}

}
