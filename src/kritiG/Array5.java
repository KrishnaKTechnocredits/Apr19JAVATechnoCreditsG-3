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
		//finding the largest number
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > count) {
				count = list[i];
			}
		}
		//using same way to find second largest and checking it is not the same number
		int cnt =0;
		for(int j=0; j< list.length; j++)
		{
			if( list[j]> cnt && list[j] !=count)
				cnt = list[j];					

		}

		
		System.out.println("Second largest number in the array is " + cnt);
	}

}
