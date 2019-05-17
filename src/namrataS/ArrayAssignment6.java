package namrataS;

import java.util.Scanner;

public class ArrayAssignment6 {
	static void ex1(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			int count = 0;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					count++;
				}
			}
			if (count == arr1.length) {
				System.out.println("Array is equal ");
			}

			else
				System.out.println("Array is not equal");
		} else
			System.out.println("Array is not equal");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write 1st unsorted array ");
		String num1 = sc.nextLine();
		String[] unsortedArray1 = num1.split(" ");
		int[] y1 = new int[unsortedArray1.length];
		for (int i = 0; i < unsortedArray1.length; i++) {
			y1[i] = Integer.parseInt(unsortedArray1[i]);
		}
		System.out.println("Write 2nd unsorted array ");
		String num2 = sc.nextLine();
		String[] unsortedArray2 = num2.split(" ");
		int[] y2 = new int[unsortedArray2.length];
		for (int i = 0; i < unsortedArray2.length; i++) {
			y2[i] = Integer.parseInt(unsortedArray2[i]);
		}

		ex1(y1, y2);
	}

}
