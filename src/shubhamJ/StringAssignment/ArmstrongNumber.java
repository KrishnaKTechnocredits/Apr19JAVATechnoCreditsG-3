package shubhamJ.StringAssignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		System.out.println("Number = "+number);
		ArmstrongNumber fb = new ArmstrongNumber();
		fb.checkArmstrongNumber(number);

	}

	private void checkArmstrongNumber(int number) {
		int temp=number;
		int armstrong =0;
		while(temp>0)
		{
			armstrong=armstrong+(temp%10)*(temp%10)*(temp%10);
			temp=temp/10;
		}
		if(number==armstrong)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
	}

}
