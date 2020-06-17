package shubhamJ.Assignment3;

import java.util.Scanner;

public class Q3FindLeapYear {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();
		Q3FindLeapYear fb = new Q3FindLeapYear();
		fb.findLeapYear(year);

	}

private void findLeapYear(int year) {

	if(year%4==0 && year%100 != 0 || year%400==0)
		System.out.println(year+" year is leap year");
	else
		System.out.println(year+" year is not leap year");
}
}
