package namrataS;

import java.util.Scanner;

public class ArrayAssignment5 {
	static int ex1(int[] number) {
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < number.length; i++) {
			if (max1 < number[i]) {
				max2 = max1;
				max1 = number[i];
			}
		}
		//System.out.println("Max value is " + max1);
	//	System.out.println(max2);
		return max2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all numbers");
		String str = sc.nextLine();
		String[] array = str.split(" ");
		int[] num = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			num[i] = Integer.parseInt(array[i]);
		}
		
		System.out.println(ex1(num));
	}

}
