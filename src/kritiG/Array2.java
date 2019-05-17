package kritiG;
// Find duplicate number on Integer array in Java? 

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting any integers
		System.out.println("Enter some numbers");
		String num = sc.nextLine();
		String[] numbers = num.split(" ");
		int[] data = new int[numbers.length];

		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(numbers[i]);
		}
		duplicate(data);
		sc.close();

	}
//Method for finding duplicate number
	static void duplicate(int[] list) {
		for (int i = 0; i < list.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] == list[j]) {
					System.out.println("Repeated number is " + list[i]);
					flag = false;
					break;
				}
			}
			if (flag == false)
				break;
		}
	}

}
