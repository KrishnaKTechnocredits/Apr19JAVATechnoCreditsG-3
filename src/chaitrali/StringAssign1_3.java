package chaitrali;

import java.util.Scanner;
//Print Fibonacci series upto user required.
public class StringAssign1_3 {
	void printFibonacci(int limit)
	{
		int num1 =0;
		int num2 = 1;
		int sum =0;
		System.out.print("Fibonacci Series is:");
		for(int i=1; i<=limit;i++)
		{
			sum = num1 + num2;
			 System.out.print(num1 + " ");
			num1 = num2;
			num2 = sum;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the limit for fibonacci series: ");
		int input = sc.nextInt();
		
		StringAssign1_3 obj1 = new StringAssign1_3();
		obj1.printFibonacci(input);
	}

}
