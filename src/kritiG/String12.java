package kritiG;

import java.util.Arrays;
import java.util.Scanner;

public class String12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array seperated by comma(some string and some numeric)");
		String array = sc.nextLine();
		String[] list = array.split(",");
		seperateDigits(list);

		sc.close();
	}

	static void seperateDigits(String[] list) {
		String alphabets = "";
		String numbers = "";
		for (int j = 0; j < list.length; j++) {
			{
				String word = list[j];

				// is alphabet
				// is digit
				if (Character.isDigit(word.charAt(0)))
					numbers+= word+",";
				else
					alphabets+= word + ",";

			}

		}
		System.out.println("Numeric : " + numbers);
		System.out.println("String: " + alphabets);

	}
}
