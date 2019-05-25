package chaitrali;

import java.util.Scanner;

//To verify if string is palidrome or not
public class StringAssign1_11 {

	static void  chkPalidrome(String line)
	{
		String revName = "";
		for (int i=(line.length()-1);i>=0;i--)
		{
			revName = revName + line.charAt(i);
			
		}
		if(revName.equals(line) )
		{
			System.out.println("Given word is Palidrome: " + line);
			System.out.println(" reverse is: " + revName);
		}else{
			System.out.println("Given word is not Palidrome.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String line = sc.nextLine();
		
		chkPalidrome(line);
		sc.close();

	}

}
