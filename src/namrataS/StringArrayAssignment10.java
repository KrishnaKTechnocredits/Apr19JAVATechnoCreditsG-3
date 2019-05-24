package namrataS;

import java.util.Scanner;

public class StringArrayAssignment10 {
	
	static void m1(String array, char letter)
	{
		int count=0;
		for(int i=0;i<array.length();i++)
		{
			char ch = array.charAt(i);
				if(ch==letter)
				count++;
				
		}
		System.out.println("Character is " + letter);
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print 1 letter to count");
		String str = sc.nextLine();
	
		System.out.println("Print sentence");
		String s =sc.nextLine();
		char c= str.charAt(0);
		m1(s,c);
	}

}
