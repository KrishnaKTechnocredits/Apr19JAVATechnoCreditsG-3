package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class Q8FindDifferIndex {
	
	public static void main(String[] agrs)
	{
		int[] data1 = {10,3,5,2,8,4,9};
		System.out.print("Array 1 : ");
		for(int i=0;i<data1.length;i++)
		{
			System.out.print(data1[i]+" ");
		}
		System.out.println();
		int[] data2 = {10,3,5,2,7,4,9};
		System.out.print("Array 2 : ");
		for(int i=0;i<data2.length;i++)
		{
			System.out.print(data2[i]+" ");
		}
		System.out.println();
		Q8FindDifferIndex obj=new Q8FindDifferIndex();
		obj.findDifferIndex(data1,data2);
	}
	
	void findDifferIndex(int[] data1,int[] data2)
	{
		for(int i=0;i<data1.length;i++)
		{
				if(data1[i]!=data2[i])
				{
					System.out.println("Values are not matching at index ->"+i);
					break;
				}
		}
	}
}
