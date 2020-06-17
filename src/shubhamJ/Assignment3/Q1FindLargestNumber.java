package shubhamJ.Assignment3;

import java.util.Scanner;


public class Q1FindLargestNumber {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		Q1FindLargestNumber fb = new Q1FindLargestNumber();
		fb.findLargestNumber(num1,num2,num3);

	}

private void findLargestNumber(int num1, int num2, int num3) {
	
	if(num1>num2 && num1>num3)
		System.out.println("First Number is largest: "+num1);
	else if(num2>num1 && num2>num3)
		System.out.println("Second Number is largest: "+num2);
	else if(num3>num2 && num3>num1)
		System.out.println("Third Number is largest: "+num3);
	else
		System.out.println("Please enter distinct numbers");
}
}
