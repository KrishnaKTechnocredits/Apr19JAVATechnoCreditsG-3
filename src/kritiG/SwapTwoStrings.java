package kritiG;
//7) WAP to swap two string(Without )

//Example:- 
//	input:- String str1 = “Harsh”
//		 String str2 = “Maulik”
//
//	output:- String str1 = “Maulik”
//		   String str2 = “Harsh”

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words or names");
		String s1 = sc.next();
		String s2 = sc.next();
		SwapTwoStrings s = new SwapTwoStrings();

		s.swap(s1, s2);
	}

	void swap(String s1, String s2) {

		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("The swapped words are " + s1 + " " + s2);

	}

}
