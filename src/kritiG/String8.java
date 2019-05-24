package kritiG;
//separate digits and characters from the user define string

import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with numbers and characters");
		String word = sc.next();
		System.out.println("Numbers and alphabets in the given string: " + seperateDigits(word));
		// seperateDigits(word);
		sc.close();
	}

	static String seperateDigits(String word) {
		String alphabets = "";
		String numbers = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == '0' || word.charAt(i) == '1' || word.charAt(i) == '2' || word.charAt(i) == '3'
					|| word.charAt(i) == '4' || word.charAt(i) == '5' || word.charAt(i) == '6' || word.charAt(i) == '7'
					|| word.charAt(i) == '8' || word.charAt(i) == '9') {
				numbers += word.charAt(i);
			} else {
				alphabets += word.charAt(i);
			}

		}
		return numbers + " and " + alphabets;

		// System.out.println("Numbers are: " + numbers);
		// System.out.println("Alphabets are: " + alphabets);
	}

}