package chaitrali;

import java.util.Scanner;

public class DmSc1_3 {
	
	public void chkLeapYear(int year)
	{
		if(year % 4 == 0)
		{
			System.out.println(year + " is a leap year.");
		}else 
			System.out.println(year + " is not a leap year.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year: ");
		int year = sc.nextInt();
		
		DmSc1_3 leapyear = new DmSc1_3();
		leapyear.chkLeapYear(year);
	}

}
