package kritiG;

import java.util.Scanner;

//Check if array contains a number in Java

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number to check if present in a list of numbers: ");
		String number = sc.nextLine();
		int numb = Integer.parseInt(number);

		System.out.println("Enter the list of numbers seperated by comma");
		String num = sc.nextLine();
		String[] numbers = num.split(",");
		int[] data = new int[numbers.length];

		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(numbers[i]);
		}
		numCheck(numb, data);
		sc.close();
	}

	static void numCheck(int num, int[] list) {
		boolean flag = false;
		for (int i = 0; i < list.length; i++) {

			if (num == list[i]) {
				flag = true;
				System.out.println(num + " is present in the given list");
				break;

			}

		}
		if (flag == false)
			System.out.println(num + " is missing in the list");

	}

}