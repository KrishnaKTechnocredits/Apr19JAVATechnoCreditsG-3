package kritiG;

import java.util.Scanner;

//22) WAP to find given string is anagram or not
//Example:- 
//#anagram defined as the number of character in two different string must be same
//	input:- String str1 = dusty
//		String str2 = study
//	output:- given string is anagram

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word");
		String word1 = sc.next();
		System.out.println("Enter second word ");
		String word2 = sc.next();
		Anagram a = new Anagram();
		a.anagram(word1, word2);
		sc.close();
	}

	void anagram(String one, String two) {
		if (one.length() == two.length()) {
			int count = 0;
			for (int i = 0; i < one.length(); i++) {

				for (int j = 0; j < two.length(); j++) {
					if (one.charAt(i) == two.charAt(j))
						count++;

				}
				if (count == 0) {
					System.out.println("Not anagram");
					break;
				}
			}
			if (count == one.length())
				System.out.println("Given strings are Anagram");
		} else
			System.out.println("not anagram");
	}
}
