package kritiG;

import java.util.Scanner;

//WAP to print Fibonacci series up to user required.

public class String3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number of the Fibonacci series: ");
		int first = sc.nextInt();
		System.out.println("Enter second number of the Fibonacci series: ");
		int second = sc.nextInt();
		System.out.println("Enter length of the Fibonacci series: ");
		int len = sc.nextInt();

		fibonacci(first, second, len);
		sc.close();

	}

	static void fibonacci(int one, int two, int length) {
		System.out.print("Series is : " + one + " " + two + " ");
		int three = 0;
		for (int i = 0; i < length - 2; i++) {

			three = two;
			two = one + two;
			one = three;
			System.out.print(two + " ");

		}

	}
}
