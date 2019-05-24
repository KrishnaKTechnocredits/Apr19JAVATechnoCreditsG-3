package namrataS;

import java.util.Scanner;

public class ArrayAssignment10 {
	static void ex1(int[] arr1, int[] arr2) {

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
			}
			else {
				System.out.println("Differ index is " + arr1[i]+ " : " + arr2[i]);
				if(arr1[i]>arr2[i])
					System.out.println("Maximum number is " + arr1[i]);
				else
					System.out.println("Maximum number is " + arr2[i]);	
				 }		
		}
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
