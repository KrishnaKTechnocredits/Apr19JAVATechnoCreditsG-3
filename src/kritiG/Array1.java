package kritiG;

import java.util.Scanner;

//Find the missing number in integer array of 1 to 10

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting numbers from 1 to 10
		System.out.println("Enter numbers from 1 to 10");
		String num = sc.nextLine();
		String[] numbers = num.split(" ");
		int[] data = new int[numbers.length];

		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(numbers[i]);
		}

		missingNumber(data);
		sc.close();

	}

	// Method to find 1 missing number or the first missing number
	static void missingNumber(int[] numbersList) {
		int len = numbersList.length;
		
		for (int i = 1; i <= 10; i++) {
			boolean flag= false;
			for (int j = 0; j < len; j++) {
				if (i == numbersList[j]) {
					flag = true;
					break;
				} 

			}if(flag==false)
			{
				System.out.println("Missing number is " + i);
				break;
			}

		}

	}
}
