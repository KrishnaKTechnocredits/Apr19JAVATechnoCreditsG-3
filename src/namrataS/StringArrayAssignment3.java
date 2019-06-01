package namrataS;

import java.util.Scanner;

public class StringArrayAssignment3 {
	
	static void febonacciSeries(int t1,int t2,int length)
	{
		System.out.print("Series is :" + t1 + " " + t2 + " ");
		for(int i=0;i<length-2;i++)
		{
			int t3=0;  // 0 1 1 2 3 5 8
			t3=t2;
			t2=t1+t2;
			t1=t3;
			System.out.print(t2+ " ");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		System.out.println("Enter last number");
		int length=sc.nextInt();
		febonacciSeries(num1,num2,length);
	}

}