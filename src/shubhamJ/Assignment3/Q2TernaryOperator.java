package shubhamJ.Assignment3;

import java.util.Scanner;

public class Q2TernaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		Q2TernaryOperator fb = new Q2TernaryOperator();
		fb.findLargestNumber(num1, num2);

	}

	private void findLargestNumber(int num1, int num2) {

		int result = (num1 > num2) ? num1 : num2;
		System.out.println("Greatest number is " + result);

	}
}
