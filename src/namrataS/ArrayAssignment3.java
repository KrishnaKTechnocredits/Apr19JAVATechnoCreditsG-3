package namrataS;

import java.util.Scanner;

public class ArrayAssignment3 {

	static void compareNumbers(int number, int[] numbers) {

		boolean flag = false;
		for (int j = 0; j < numbers.length; j++) {
			if (number == numbers[j]) {
				flag = true;
				System.out.println(number + " available in array ");
				break;
			}
		}
		if (flag == false) {
			System.out.println(number + " not available in array  ");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print number to compare ");
		int onlyNum = Integer.parseInt(sc.nextLine());
		System.out.println("Print all numbers ");
		String allNumbers = sc.nextLine();
		String[] data = allNumbers.split(" ");
		int[] num = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			num[i] = Integer.parseInt(data[i]);
		}
		compareNumbers(onlyNum, num);
	}

}
