package chaitrali;

import java.util.Scanner;
// Program to print reverse number (Inut as int)
public class StringAssign1_4 {

	void reverseNum(int num)
	{
		System.out.println("Reverse no. is: " );
		boolean flag = true;
		while(true)
		{
			int num2 = num % 10;
			System.out.print(num2);
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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. to be reversed: ");
		int num = sc.nextInt();
		
		StringAssign1_4 obj1 = new StringAssign1_4();
		obj1.reverseNum(num);
		sc.close();
	}

}
