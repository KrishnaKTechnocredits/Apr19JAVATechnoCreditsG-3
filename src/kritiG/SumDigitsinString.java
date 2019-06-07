package kritiG;
////sum all the single digit from the user define String.

//Example:- 
//input:- India won the World cup in 1983 and 2011.
//output:- 25

import java.util.Scanner;

public class SumDigitsinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence with alphabets and digits");
		String s = sc.nextLine();
		SumDigitsinString sumDigitsinString = new SumDigitsinString();

		System.out.println("The sum of the digits in this sentence is " + sumDigitsinString.digitSum(s));

	}

	int digitSum(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				int temp = Integer.parseInt(s.charAt(i) + "");
				sum += temp;

			}
			

		}
		return sum;

	}

}
