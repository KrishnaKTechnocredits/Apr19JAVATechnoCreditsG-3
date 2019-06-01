package namrataS;

import java.util.Scanner;

public class LeapYearAss3 {
	static void m1(int year)
	{
		if(year%4==0)
		{
			System.out.println("Year is leap year");
		}
		else
			System.out.println("Year is not leap year");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int i = sc.nextInt();
		m1(i);
	}

}
