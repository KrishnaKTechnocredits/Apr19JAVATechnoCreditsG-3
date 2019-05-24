package kritiG;

import java.util.Scanner;

//2) WAP to reverse a full String and particular word also

public class String2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence to reverse ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		System.out.println("The reverse of this sentence is :" + reverse(words));

		sc.close();

	}

	static String reverse(String[] words) {
		String newword = "";
		for (int i = words.length - 1; i >= 0; i--) {

			int len = words[i].length();
			newword += " ";
			for (int j = len - 1; j >= 0; j--) {
				newword += (words[i].charAt(j));

			}
		}
		return newword;

	}

}
