package kritiG;
//14) WAP to find maximum occurring word from the user defined String

//Example:- 
//input:- hello nikhil hello nilesh hello anjani
//`	output:- hello 3 times

import java.util.Scanner;

public class MaxOccuringWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String[] s = sc.nextLine().split(" ");
		MaxOccuringWord max = new MaxOccuringWord();
		max.maxWord(s);
		sc.close();
	}

	void maxWord(String[] words) {
		int max = 0;
		String maxword = "";

		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}

			}
			if (count > max) {
				max = count;
				maxword = words[i];

			}

		}
		System.out.println("Maximum repeated word : " + maxword + "  is repeated " + max + "  number of times");

	}
}