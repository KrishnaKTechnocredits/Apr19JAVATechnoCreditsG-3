package chaitrali;

import java.util.Scanner;

// WAP to reverse the word in a string keeping string in same sequence.
public class StringAssign1_9 {
	void reverseString(String [] data)
	{
		for (int i =0; i<(data.length);i++)
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
		
		StringAssign1_9  obj1 = new StringAssign1_9();
		obj1.reverseString(data);
	}

}
