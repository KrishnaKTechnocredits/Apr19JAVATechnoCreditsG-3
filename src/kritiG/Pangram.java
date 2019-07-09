package kritiG;

//23) WAP to find given string is pangram or not

//Example:-
//Hint :- pangram defines as the all 26 character must come is given string
//input:- Farmer jack realized that big yellow quilts were expensive
//output:- given string is pangram

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String line = sc.nextLine();
		Pangram p = new Pangram();
		p.pangram(line);
		sc.close();

	}

	void pangram(String words) {
		int count = 1;

		for (int i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < words.length(); j++) {
				if (i == words.charAt(j)) {
					count++;
					break;
				}
			}

		}
		if (count == 26)
			System.out.println("Given string is pangram");
		else
			System.out.println("Not Pangram");
	}
}
