package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class Q1FindMissingNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers from 1 to 10 :");
		int[] numbers = new int[9];
		for(int i=0;i<9;i++)
		{
		numbers[i] = sc.nextInt();
		}
		
		Q1FindMissingNumber obj1 = new Q1FindMissingNumber();
		obj1.findMissingNumber(numbers);
	}
	
	void findMissingNumber(int[] numbers)
	{
		for(int i=1;i<=10;i++)
		{
			boolean temp = false;
			for(int j=0;j<numbers.length;j++){
				if(i == numbers[j])
				{
					temp = true;
					break;
				}
			}
				if(temp == false)
					System.out.println(i+ " is missing number");
		}
	}

}
