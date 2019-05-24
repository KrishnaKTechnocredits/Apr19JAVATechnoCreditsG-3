package kritiG;
// WAP to print sum of digit(Consider Input as Integer not as String)

import java.util.Scanner;

public class String7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Sum of the digits of " + num + " is " + digitSum(num));
		sc.close();
	}

	static int digitSum(int number) {
		int t1, t2, sum = 0;

		while (number != 0) {
			t1 = number % 10;
			sum += t1;
			t2 = number / 10;
			number = t2;

		}
		return sum;

	}

}
