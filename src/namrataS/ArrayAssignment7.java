package namrataS;

import java.util.Scanner;

public class ArrayAssignment7 {
	static void ex1(int[] array, int num) {
		boolean flag=false;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
	
			for (int j = i+1; j < array.length; j++) {
				sum = array[i] + array[j];
				{
					if (sum == num) {
						flag=true;
						System.out.println("Sum is " + array[i] + ": " + array[j]);
					}
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Sum not available in count ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number ");
		int s = Integer.parseInt(sc.nextLine());
		System.out.println("Enter all numbers");
		String str = sc.nextLine();
		String[] data = str.split(" ");
		int[] num = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			num[i] = Integer.parseInt(data[i]);
		}
		ex1(num, s);

	}

}
