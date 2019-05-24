package namrataS;

import java.util.Scanner;

public class StringArrayAssignment5 {

	static void m1(int number, int length) {
		int temp, t1, result = 0;
		temp = number;
		while (temp != 0) {
			t1 = temp % 10;
			result += Math.pow(t1, length);
			temp /= 10;
		}
		if (result == number)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int num1 = String.valueOf(num).length();
		m1(num, num1);

	}

}
