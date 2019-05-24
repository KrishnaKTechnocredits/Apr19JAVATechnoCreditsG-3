package shubhamJ.StringAssignment;

import java.util.Scanner;

public class Q6PrintFactorialNumber {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		
		Q6PrintFactorialNumber fb = new Q6PrintFactorialNumber();
		fb.factorialNumber(number);

	}

private void factorialNumber(int number) {
	int fact=1;
	for(int i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial = "+fact);
}
}
