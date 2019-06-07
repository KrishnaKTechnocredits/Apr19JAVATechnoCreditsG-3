package kritiG;
//WAP to find common elements between two arrays.

//Example:- input:- int a[] = {5, 9, 2, 3, 6, 1}
//		     int b[] = {2, 5, 8, 4, 6}
//		
//	     output:- 2, 5, 6

import java.util.Scanner;

public class CommoninArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array of numbers ");
		String[] num1 = sc.nextLine().split(",");
		System.out.println("Enter another array of numbers ");
		String[] num2 = sc.nextLine().split(",");

		int[] list1 = new int[num1.length];
		for (int i = 0; i < num1.length; i++) {
			list1[i] = Integer.parseInt(num1[i]);
		}
		int[] list2 = new int[num2.length];
		for (int i = 0; i < num2.length; i++) {
			list2[i] = Integer.parseInt(num2[i]);
		}
		CommoninArray c= new CommoninArray();
		c.common(list1, list2);

	}
	
	void common(int[] array1, int[] array2){
		String common ="";
		for(int i=0; i<array1.length; i++)
		{
			for( int j=0; j<array2.length;j++)
			{
				if (array1[i]==array2[j])
					common += array1[i]+",";
			}
		}
		System.out.println("Common elements in the array are " + common);
		
		
		
		
		
		
	}
		
	

}
