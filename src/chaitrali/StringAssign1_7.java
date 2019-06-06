package chaitrali;

import java.util.Scanner;

public class StringAssign1_7 {
	
	static void printSum(int num)
	{
		boolean flag = true;
		int sum = 0;
		while(true)
		{
			int num2 = num % 10;
			sum = sum + num2;
			int divnum = num/10;
			if (divnum == 0)
			{
				flag = false;
				break;
			}else
			{
				num = divnum;
			}
		 }
		System.out.print("Addition of digits in a no. is: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Please enter the no.: ");
		int num = sc.nextInt();
		
		printSum(num);
		sc.close();

	}

}
