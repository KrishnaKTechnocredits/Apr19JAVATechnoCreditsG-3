package kritiG;
// WAP to find given string is palindrome or not 

import java.util.Scanner;

public class String11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.next();
		palindrome(word);

		sc.close();
	}

	static void palindrome(String word) {
		String reverse = "";
		for (int i = word.length()-1; i >= 0; i--) {
			reverse += word.charAt(i);
		}

		if (word.equals(reverse))
			System.out.println(word + " is palindrome");
		else
			System.out.println(word + " is not palindrome");

	}

}
