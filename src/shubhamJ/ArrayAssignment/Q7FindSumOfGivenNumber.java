package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class Q7FindSumOfGivenNumber {

	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int num[]=new int[data.length];
		for(int i=0;i<data.length;i++)
		{
			num[i]=Integer.parseInt(data[i]);
		}
		
		System.out.println("Enter number :");
		int number=sc.nextInt();
		Q7FindSumOfGivenNumber obj=new Q7FindSumOfGivenNumber();
		obj.findSumOfGivenNumber(num,number);
	}
	
	void findSumOfGivenNumber(int[] num,int number)
	{
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(number==(num[i]+num[j]))
				{
					System.out.println("{"+num[i]+","+num[j]+"}");
					break;
				}
			}
		}
	}
}
