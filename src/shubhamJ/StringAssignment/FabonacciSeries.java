package shubhamJ.StringAssignment;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int range = sc.nextInt();
		
		FabonacciSeries fb = new FabonacciSeries();
		fb.fabonacciSeries(range);

	}

	private void fabonacciSeries(int range) {
	
		int num1=0;
		int num2=1;
		System.out.print(num1+ " "+num2 + " ");
		for(int i=1;i<=range-2;i++)
		{
			int temp=num1+num2;
			System.out.print(temp+" ");
			num1=num2;
			num2=temp;
		}
	}

}
