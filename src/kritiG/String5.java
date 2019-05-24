package kritiG;
//WAP to check if a number is Armstrong or not

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int len = String.valueOf(num).length();
		armstrong(num, len);
		sc.close();
	}

	static void armstrong(int number, int length) {
		int t1, t2, check = 0;
		int temp = number;
		while (temp != 0) {

			t1 = temp % 10;
			check += Math.pow(t1, length);
			t2 = temp / 10;
			temp = t2;

		}
		if (check == number)
			System.out.println(number + " is an armstrong number.");
		else
			System.out.println(number + " is not an armstrong number.");
	}

}
