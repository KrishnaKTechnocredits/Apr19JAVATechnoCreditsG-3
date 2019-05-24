package namrataS;

import java.util.Scanner;

public class StringArrayAssignment11 {
	
	static void m1(String str)
	{
		String reverse= "";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
			System.out.println(str + " : String is pallindrome");
		else
			System.out.println(str + " : String is not pallindrome");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		m1(s);
	}
}