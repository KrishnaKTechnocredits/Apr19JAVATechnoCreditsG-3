package kritiG;

import java.util.Scanner;

public class Array5 {
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
		secondLargest(data);

		sc.close();
	}

	static void secondLargest(int[] list) {
		
		int max = 0;
		int second = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > max) {
				second = max;
				max = list[i];
			}
		}

		System.out.println("Second largest number in the array is " + second);
	}

}
