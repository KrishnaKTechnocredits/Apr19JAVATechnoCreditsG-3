package shubhamJ.StringAssignment;

import java.util.Scanner;

public class Q7SumOfDigits {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		
		Q7SumOfDigits fb = new Q7SumOfDigits();
		fb.findSumOfDigits(number);

	}

private void findSumOfDigits(int number) {

int sum=0;
while(number>0)
{
sum=sum+(number%10);
number=number/10;
}
System.out.println("Sum = "+sum);
}
}
