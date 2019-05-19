package chaitrali;

import java.util.Scanner;

public class ArrayAssign1_8 {
	
	void chkDifferIndex(int[]a1, int[]a2)
	{
		boolean flag = false;
		for(int i=0;i<a1.length;i++)
		{
			
			if(a1[i] != a2[i])
			{
				flag = true;
				System.out.println("Values are not matching at index --> " + i);
				break;
			}
		}
			if(flag == false)
			{
				System.out.println("Arrays are identical.");
			}
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
			arr1[i] = Integer.parseInt(data1[i]);//As data array is og string type
			arr2[i] = Integer.parseInt(data2[i]);
		}
		ArrayAssign1_8 obj = new ArrayAssign1_8();
		obj.chkDifferIndex(arr1, arr2);
		sc.close();

	}

}
