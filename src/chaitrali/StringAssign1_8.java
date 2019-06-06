package chaitrali;

import java.util.Scanner;

public class StringAssign1_8 {
	
	static void separateDigChar(String line)
	{
		String str1 = "",str2 = "",str3 = "";
		for(int i=0; i< line.length();i++)
		{
			if(Character.isDigit(line.charAt(i)))
			{
				str1 = str1 + line.charAt(i);
			}
			else
				str2 = str2 + line.charAt(i);
		}
		str3 = str1+str2;
		System.out.println("output is: " + str3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Please enter the no.: ");
		String input = sc.nextLine();
		
		separateDigChar(input);
		sc.close();

	}

}
