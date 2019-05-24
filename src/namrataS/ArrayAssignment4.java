package namrataS;

import java.util.Scanner;

public class ArrayAssignment4 {

	static int ex1(int[] number) {
		int max = 0;
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		System.out.println("Max value is " + max);
		return max;
	}

	static int ex2(int[] number) {
		int min = number[0];
		for (int i = 1; i < number.length; i++) {

			if (min > number[i]) {
				min = number[i];
			}
		}
		System.out.println("Min value is " + min);
		return min;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array list ");
		String numbers = sc.nextLine();
		String[] array = numbers.split(" ");
		int[] num = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			num[i] = Integer.parseInt(array[i]);
		}
		ex1(num);

	}
}
