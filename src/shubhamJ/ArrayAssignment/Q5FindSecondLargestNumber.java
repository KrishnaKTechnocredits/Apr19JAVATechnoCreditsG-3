package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class Q5FindSecondLargestNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}

		Q5FindSecondLargestNumber obj1 = new Q5FindSecondLargestNumber();
		obj1.findSecondLargestNumber(numbers);
	}





	void findSecondLargestNumber(int[] numbers) {
		int swap = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++)
				if (numbers[i] < numbers[j]) {
					swap = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = swap;
				}
		}
		System.out.println("Second Largest Number is : "+ numbers[1]);
}
}
