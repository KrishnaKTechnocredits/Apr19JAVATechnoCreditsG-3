package namrataS;

import java.util.Scanner;

public class StringArrayAssignment12 {

	static void m1(String[] array) {
		String digit = "";
		String alphabet = "";
		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i].charAt(0))) {
				digit += array[i];
			} else
				alphabet += array[i];

		}
		System.out.println("Numeric array is " + digit);
		System.out.println("String array is " + alphabet);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array");
		String arr = sc.nextLine();
		String[] str = arr.split(",");
		m1(str);
	}

}
