package chaitrali;

import java.util.Scanner;

public class StringAssign1_6 {
	
	static void calcFactorial(int num)
	{
		int fact = 1;
		for (int i =1; i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of " + num +" is: " + fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide input for factorial: ");
		int num = sc.nextInt();
		
		calcFactorial(num);
		sc.close();
	}
}
