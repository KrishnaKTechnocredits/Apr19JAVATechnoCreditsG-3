package chaitrali;

import java.util.Scanner;

public class ArrayAssign1_6 {
	
	void chkEquality(int[] arr1, int[]arr2)
	{
		int i=arr1.length;
		int j=arr2.length;
		boolean flag = false;
		if(i == j)
		{
			for(int k=0;k<i;k++)
			{				
				if(arr1[k] == arr2[k])
				{
					flag = true;
					continue;
				}else{
					flag = false;
					System.out.println("Elements in an array are not identical.");
					break;
					 }
				
				
			}
			if(flag == true)
			{
				System.out.println("Elements in an array are identical.");
			}
			
						
		}else
			System.out.println("Array are not identical. ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Array 1: ");
		String line1 = sc.nextLine();
		String[] data1 = line1.split(" ");
		System.out.println("Enetr Array 2: ");
		String line2 = sc.nextLine();
		int arr1[] = new int[data1.length];
		String [] data2 = line2.split(" ");
		int arr2[] = new int[data2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = Integer.parseInt(data1[i]);//As data array is of string type
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = Integer.parseInt(data2[i]);
		}
		ArrayAssign1_6 obj = new ArrayAssign1_6();
		obj.chkEquality(arr1, arr2);
		sc.close();

	}

}
