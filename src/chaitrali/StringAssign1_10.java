package chaitrali;

import java.util.Scanner;

public class StringAssign1_10 {
	
	void chkCharOccur(String[] data, char input)
	{
		int count = 0;
		for (int i =0; i<(data.length);i++)
		{
			String newData = data[i];
			for(int j=0;j<(newData.length());j++)
			{
				if(newData.charAt(j) == input)
				{
					count = count +1;
				}else
				{continue;}
			}
			
		}
		System.out.println("char is: " + input + " and no. occurence is: " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String line = sc.nextLine();
		System.out.println("Please enter the character whose occurence needs to b found: ");
		char input = sc.next().charAt(0);
		String[] data = line.split(" ");
		
		StringAssign1_10  obj1 = new StringAssign1_10();
		obj1.chkCharOccur(data,input);
		sc.close();
	}

}
