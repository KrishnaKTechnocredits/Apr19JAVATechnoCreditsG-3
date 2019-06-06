package chaitrali;

import java.util.Scanner;

public class ArrayAssign1_9 {
	
	void chkDifferIndexAssign9(int[]a1, int[]a2)
	{
		int c = a1.length;
		int d = a2.length;
		boolean flag = false;
		if (c == d)
		{
			for(int i=0;i<c;i++)
			{			
				if(a1[i] != a2[i])
					{
						flag = true;
						System.out.println("Values are not matching at index --> " + i);
						continue;
					}
			}if(flag == false)
				{
					System.out.println("Arrays are identical.");
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
		ArrayAssign1_9 obj = new ArrayAssign1_9();
		obj.chkDifferIndexAssign9(arr1, arr2);
		sc.close();

	}

}
