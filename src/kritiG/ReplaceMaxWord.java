package kritiG;
//17) WAP to find maximum repeating word and replace that word’s last index with “technocredits”.

import java.util.Scanner;

public class ReplaceMaxWord {

	static String maxword = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String sentence = sc.nextLine();
		String[] s = sentence.split(" ");
		ReplaceMaxWord max = new ReplaceMaxWord();
		max.maxWord(s);
		int x = sentence.lastIndexOf(maxword);
		String string1 = sentence.substring(0, x);
		String string2 = sentence.substring(x).replace(maxword, "Technocredits");
		String newString = string1.concat(string2);
		System.out.println(newString);
		sc.close();
	}

	String maxWord(String[] words) {
		int max = 0;

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
		return maxword;

	}

}
