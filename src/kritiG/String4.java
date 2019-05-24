package kritiG;
//WAP to reverse number (Consider Input as Integer not as String). 

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int len = String.valueOf(num).length();
		reverse(num, len);
		sc.close();
	}

	static void reverse(int number, int length) {
		System.out.print("Reverse of the number is ");

		int t1 = 0;
		int t2 = 0;
		for (int i = 0; i < length; i++) {

			t1 = number % 10;
			t2 = number / 10;
			number = t2;
			System.out.print(t1);
		}

	}

}
