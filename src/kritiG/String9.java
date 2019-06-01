package kritiG;
//WAP to reverse all words.

import java.util.Scanner;

public class String9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence to reverse the words ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		System.out.println("The reverse of the words: " + reverse(words));

		sc.close();

	}

	static String reverse(String[] words) {
		String newword = "";
		for (int i = 0; i <= words.length - 1; i++) {

			int len = words[i].length();
			newword += " ";
			for (int j = len - 1; j >= 0; j--) {
				newword += (words[i].charAt(j));
			}
		}
		return newword;

	}

}
