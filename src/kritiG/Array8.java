package kritiG;
// Find first differ index from given arrays 

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input first array
		System.out.println("Enter an array of numbers seperated by comma");
		String num = sc.nextLine();
		String[] numbers = num.split(",");
		int[] first = new int[numbers.length];

		for (int i = 0; i < first.length; i++) {
			first[i] = Integer.parseInt(numbers[i]);

		}
		// input second array

		System.out.println("Enter another array of numbers seperated by comma ");
		String num1 = sc.nextLine();
		String[] numbers1 = num1.split(",");
		int[] second = new int[numbers1.length];

		for (int i = 0; i < second.length; i++) {
			second[i] = Integer.parseInt(numbers1[i]);
		}

		firstDiffer(first, second);
		sc.close();
	}

	static void firstDiffer(int[] one, int[] two) {
		if (one.length == two.length) {
			int count = 0;

			for (int i = 0; i < one.length; i++) {
				if (one[i] == two[i]) {
					count++;
					continue;
				} else {
					System.out.println("Values differ at index " + i);
					break;
				}

			}
			if (count == one.length) {
				System.out.println("arrays dont differ");
			}

		} else
			System.out.println("Enter arrays of same length");

	}

}
