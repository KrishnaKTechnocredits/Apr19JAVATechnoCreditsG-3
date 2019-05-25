package chaitrali;

import java.util.Scanner;

//To check if given no. Armstrong or not.
public class StringAssign1_5 {
	
	void chkArmstrong(int num)
	{
		boolean flag = true;
		int numcube = 0;
		int num1 = num;
		while(true)
		{
			int num2 = num1 % 10;
			//System.out.print(num2);
			numcube = numcube + (num2*num2*num2);
			int divnum = num1/10;
			if (divnum == 0)
			{
				if(num == numcube)
				{
					System.out.println(num + " Number is Armstrong");
					flag = false;
					break;
				}	else
				{
					System.out.println(num + " Number is not Armstrong");
					break;
				}
				
			}else
			{
				num1 = divnum;
			}
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no.: ");
		int num = sc.nextInt();
		
		StringAssign1_5 obj = new StringAssign1_5();
		obj.chkArmstrong(num);
		sc.close();
	}

}
