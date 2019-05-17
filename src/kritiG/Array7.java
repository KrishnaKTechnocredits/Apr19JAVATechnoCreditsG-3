package kritiG;
// Find all pairs on integer array whose sum is equal to given number

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the sum to find pairs in an array to give this sum ");
		String number = sc.nextLine();
		int numb = Integer.parseInt(number);

		System.out.println("Enter the list of numbers ");
		String num = sc.nextLine();
		String[] numbers = num.split(" ");
		int[] data = new int[numbers.length];

		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(numbers[i]);
		}
		pairsofSum(numb, data);
		sc.close();
	}

	static void pairsofSum(int sum, int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] + list[j] == sum)
					System.out.println("{ " + list[i] + "," + list[j] + " }");
			}
		}

	}

}
