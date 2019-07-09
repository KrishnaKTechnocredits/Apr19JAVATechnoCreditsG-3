package kritiG;
//16) WAP to find maximum character occurring in user defined String

import java.util.Scanner;

public class MaxOccurChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String s = sc.nextLine();
		MaxOccurChar max= new MaxOccurChar();
		max.maxChar(s);
		
	}

	void maxChar(String words) {
		int max = 0;
		char maxchar = '*';

		for (int i = 0; i < words.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < words.length(); j++) {
				if (words.charAt(i)== words.charAt(j))
					count++;
			}
			if (count > max) {
				max = count;
				maxchar = words.charAt(i);

			}

		}
		System.out.println("Maximum repeated character : " + maxchar + "  is repeated " + max + "  number of times");

	}
}
