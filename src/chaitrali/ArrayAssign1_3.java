package chaitrali;

import java.util.Scanner;

public class ArrayAssign1_3 {
	
	void chkNum(int[] arr, int fnum)
	{
		boolean flag = false;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == fnum)
			{
				flag = true;
				System.out.println("Element " +fnum + " is presesnt in an array: ");
				break;
			}
		
		}if(flag = false){
			System.out.println( fnum + " :Element is not presesnt in an array: ");
		}
	}
	
	void chkMaxMin(int[] arr)
	{
		int max = arr[0];
		int smax = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				smax = max;
				max = arr[i];				
			}else 
				if(arr[i] > smax && arr[i] !=max)
				smax = arr[i];
		}
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j] < min)
			{
				min = arr[j];
			}
		}
		
		System.out.println("max no.is: " + max);
		System.out.println("second largest no.is: " + smax);
		System.out.println("min no.is: " + min);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element needs to b find in array: ");
		int fnum = Integer.parseInt(sc.nextLine());
		System.out.println("Enter elements in an array: ");
		String line = sc.nextLine();
		String [] data = line.split(",");
		int arr[] = new int[data.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(data[i]);//As data array is og string type
		}
		
		ArrayAssign1_3 obj = new ArrayAssign1_3();
		obj.chkNum(arr, fnum);
		obj.chkMaxMin(arr);
		sc.close();
	}

}
