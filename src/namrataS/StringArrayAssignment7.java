package namrataS;

import java.util.Scanner;

public class StringArrayAssignment7 {

	static int[] m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print numbers");
		String num = sc.nextLine();
		String[] array = num.split(" ");
		int[] n = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			n[i] = Integer.parseInt(array[i]);
		}
		return n;
	}

	static void m2(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of array is " + sum);
	}

	public static void main(String[] args) {
		int[] numbers = m1();
		m2(numbers);
	}

}
