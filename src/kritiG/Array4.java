package kritiG;
//Largest and smallest number in an unsorted array

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting any integers
		System.out.println("Enter some numbers ");
		String num = sc.nextLine();
		String[] numbers = num.split(" ");
		int[] data = new int[numbers.length];

		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(numbers[i]);
		}
		largest(data);

		sc.close();
	}

	static void largest(int[] list) {
		int count = list[0];
		int min = list[0];

		for (int i = 0; i < list.length; i++) {
			if (list[i] > count) {
				count = list[i];

			}

			if (list[i] < min) {
				min = list[i];
			}
		}

		System.out.println("Largest number in the array is " + count);
		System.out.println("Smallest number in the array is " + min);

	}

}
