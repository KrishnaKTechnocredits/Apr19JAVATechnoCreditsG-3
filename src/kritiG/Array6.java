package kritiG;
//java program to check the equality of two arrays

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input first array
		System.out.println("Enter an array of numbers ");
		String num = sc.nextLine();
		String[] numbers = num.split(" ");
		int[] first = new int[numbers.length];

		for (int i = 0; i < first.length; i++) {
			first[i] = Integer.parseInt(numbers[i]);
			
		sc.close();
		}
		// input second array
		
		System.out.println("Enter another array of numbers ");
		String num1 = sc.nextLine();
		String[] numbers1 = num1.split(" ");
		int[] second = new int[numbers1.length];

		for (int i = 0; i < second.length; i++) {
			second[i] = Integer.parseInt(numbers1[i]);
		}

		equality(first, second);

	}

	static void equality(int[] one, int[] two) {
		if (one.length == two.length) {
			int count = 0;
			for (int i = 0; i < one.length; i++) {

				if (one[i] == two[i]) {
					count++;
				} else {
					System.out.println("The two arrays are not equal");
					break;
				}
			}
			if (count == one.length) {
				System.out.println("The two arrays are equal");

			}

		} else {
			System.out.println("The two arrays are not equal");

		}

	}

}
