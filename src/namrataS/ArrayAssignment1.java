package namrataS;

import java.util.Scanner;

public class ArrayAssignment1 {
	static void findMissingNumber(int[] num) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < num.length; j++) {
				if (i == num[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Missing number is " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers ");
		String numbers = sc.nextLine();
		String[] data = numbers.split(" ");
		int[] num = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			num[i] = Integer.parseInt(data[i]);
		}
		findMissingNumber(num);

	}

}
