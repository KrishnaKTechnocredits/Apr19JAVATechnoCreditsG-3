package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class Q4FindLargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}
		
		Q4FindLargestNumber obj1 = new Q4FindLargestNumber();
		obj1.findLargestNumber(numbers);
		obj1.findSmallestNumber(numbers);
	}

	
	
	
	
	void findLargestNumber(int[] numbers)
	{
		int max = 0;
		for(int i=0;i<numbers.length;i++)
		{
			
				if(numbers[i]>max)
				{
					max = numbers[i];
				}
		}
		System.out.println("Largest Number is : "+max);
	}
	
	void findSmallestNumber(int[] numbers)
	{
		int min = numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			
				if(numbers[i]<min)
				{
					min = numbers[i];
				}
		}
		System.out.println("Smallest Number is : "+min);
	}
}
