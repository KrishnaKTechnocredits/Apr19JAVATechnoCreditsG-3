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
		String[] alphabets = new String[list.length];
		String[] numbers = new String[list.length];
		for (int j = 0; j < list.length; j++) {
			{
				String word = list[j];
				

					if (word.charAt(0) == '0' || word.charAt(0) == '1' || word.charAt(0) == '2' || word.charAt(0) == '3'
							|| word.charAt(0) == '4' || word.charAt(0) == '5' || word.charAt(0) == '6'
							|| word.charAt(0) == '7' || word.charAt(0) == '8' || word.charAt(0) == '9')
						numbers[j] = word;
					else
						alphabets[j]= word;

			}

		}
		System.out.println("Numeric : " + Arrays.toString(numbers));
		System.out.println("String: " + Arrays.toString(alphabets));

	}
}
