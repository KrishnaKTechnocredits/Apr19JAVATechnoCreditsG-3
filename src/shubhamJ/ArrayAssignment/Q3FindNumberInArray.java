package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class Q3FindNumberInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}
		System.out.println("Enter Number to find in array :");
		int num = sc.nextInt();
		Q3FindNumberInArray obj1 = new Q3FindNumberInArray();
		obj1.findNumberInArray(numbers, num);
	}

	
	
	
	
	void findNumberInArray(int[] numbers, int num)
	{
		boolean temp=false;
		for(int i=0;i<numbers.length;i++)
		{
				if(num == numbers[i])
				{
					temp = true;
					break;
				}
		}
				if(temp == false)
				{
					System.out.println(num+ " is not found in array");
				}
				else
					System.out.println(num+ " is found in array");
		
	}
}
