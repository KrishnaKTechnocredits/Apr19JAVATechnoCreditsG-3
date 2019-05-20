package shubhamJ.ArrayAssignment;

import java.util.Scanner;

public class Q2FindDuplicateNumber {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}
		
		Q2FindDuplicateNumber obj1 = new Q2FindDuplicateNumber();
		obj1.findDuplicateNumber(numbers);
	}

	
	
	
	
	void findDuplicateNumber(int[] numbers)
	{
		for(int i=0;i<numbers.length-1;i++)
		{
			int count = 0;
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i] == numbers[j])
				{
					count = 1;
					break;
				}
			}
				if(count == 1)
				{
					System.out.println(numbers[i]+ " is duplicate number");
					break;
				}
		}
	}
}
