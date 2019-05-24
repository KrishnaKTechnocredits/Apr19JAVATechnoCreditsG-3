package shubhamJ.StringAssignment;

import java.util.Scanner;

public class Q8SeperateDigitAndNumberFromString {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String string = sc.next();
		
		Q8SeperateDigitAndNumberFromString fb = new Q8SeperateDigitAndNumberFromString();
		fb.seperateDigitAndNumberFromString(string);

	}




private void seperateDigitAndNumberFromString(String string) {
	
	String digit="";
	String number="";
	for(int i=0;i<string.length();i++)
	{
		if(string.charAt(i)=='0' || string.charAt(i)=='1' || string.charAt(i)=='2' || string.charAt(i)=='3' || string.charAt(i)=='4' || string.charAt(i)=='5' ||
				string.charAt(i)=='6' || string.charAt(i)=='7' || string.charAt(i)=='8' || string.charAt(i)=='9' )
			{
			number=number+string.charAt(i);
			}
		else
			digit=digit+string.charAt(i);
			
	}
	System.out.println("Digits = "+digit);
	System.out.println("Number = "+number);
	
}
}
