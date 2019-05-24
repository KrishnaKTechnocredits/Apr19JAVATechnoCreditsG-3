package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class SmallestPositiveIntegerMissing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}

		SmallestPositiveIntegerMissing obj1 = new SmallestPositiveIntegerMissing();
		obj1.findSmallestPositiveIntegerMissing(numbers);
	}

	void findSmallestPositiveIntegerMissing(int[] numbers) {
		int swap = 0;
		for (int i = 1; i < 10; i++) {
			boolean flag=false;
			for (int j = 0; j < numbers.length; j++)
			{
				if (i == numbers[j]) 
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Result is "+i);
				break;
			}
		}
		
	}

}
