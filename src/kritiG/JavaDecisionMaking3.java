package kritiG;
//Write a Java program that takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class JavaDecisionMaking3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting a year
		System.out.println("Enter any year ");
		int x = sc.nextInt();

		JavaDecisionMaking3 j = new JavaDecisionMaking3();
		j.leapYear(x);

		sc.close();
	}

	void leapYear(int year) {
		if (year % 4 == 0)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}

}
