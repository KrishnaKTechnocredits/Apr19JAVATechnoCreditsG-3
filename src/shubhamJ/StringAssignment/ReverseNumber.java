package shubhamJ.StringAssignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		System.out.println("Number = "+number);
		ReverseNumber fb = new ReverseNumber();
		fb.reverseNumber(number);

	}

	private void reverseNumber(int number) {
		
		String rev = "";
		while (number > 0) {
			
			rev = rev + (number % 10);
			number = number / 10;
		}
		System.out.println("Reverse = "+rev);
	}
}
