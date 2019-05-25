package chaitrali;

import java.util.Scanner;
// String Assignment 2- WAP to reverse a fullstring and particular word also.
public class StringAssign1_2 {
	
	void reverseString(String [] data)
	{
		for (int i = (data.length)-1;i>=0;i--)
		{
			String newData = data[i];
			String revWord = "";
			for(int j=(newData.length())-1;j>=0;j--)
				{
					revWord = revWord + newData.charAt(j);
				}
				System.out.print(revWord + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		
		StringAssign1_2  obj1 = new StringAssign1_2();
		obj1.reverseString(data);
		sc.close();
	}

}
