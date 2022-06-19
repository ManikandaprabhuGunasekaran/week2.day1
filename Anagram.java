package week2.day1.Assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		/*
		 * psuedocode 2 strings should have same characters ,different order ie stop
		 * post
		 */
		Anagram a = new Anagram();
		a.AnagramFinder("stop", "frrr");
	}

	public boolean AnagramFinder(String value1, String value2) {
		char[] charArray1 = value1.toCharArray();
		char[] charArray2 = value2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean flag = false;
		if (charArray1.length != charArray2.length) {
			System.out.println("Not a anagram");
		} else {

			flag = Arrays.equals(charArray1, charArray2);
			if (flag == true) {
				System.out.println("It is a anagram");
			} else
				System.out.println("It is not a anagram");
		}
		return flag;

	}

}
