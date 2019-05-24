package namrataS;

import java.util.Scanner;

public class StringArrayAssignment6 {
	
	static void m1(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{		
			fact=fact*i;			
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int num = sc.nextInt();
		m1(num);	
	}
}
