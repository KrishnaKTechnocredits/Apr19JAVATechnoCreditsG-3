package chaitrali;

import java.util.Scanner;

public class ArrayAssign1_7 {
	
	void display(int[]arr, int sum)
	{
		for(int i =0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("sum needs to be "+ sum);
	}
	
	void chkSum(int arr[], int sum)
	{
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				if(arr[i] + arr[j] == sum)
				{
					flag = true;
					System.out.println(arr[i] + ","+ arr[j] + ":"+ " This pair sum is " + sum);
					continue;
				}
			}
		}if(flag == false){
			System.out.println("None of the pair makes sum as " + sum);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum value: ");
		int sum = Integer.parseInt(sc.nextLine());
		System.out.println("Enetr Array 1: ");
		String line1 = sc.nextLine();
		String[] data1 = line1.split(" ");
		int arr1[] = new int[data1.length];
		
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = Integer.parseInt(data1[i]);//As data array is og string type
			
		}
		ArrayAssign1_7 obj = new ArrayAssign1_7();
		//obj.display(arr1,sum);
		obj.chkSum(arr1,sum);
		
	}

}
