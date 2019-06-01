package namrataS;

import java.util.Scanner;

public class StringArrayAssignment8 {
	static void m1(String input) {
		// String input = "Abcd345yud7890";
		String digit = "";
		String alpha = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				digit += input.charAt(i); //digits
				sum += Integer.parseInt(input.charAt(i) + "");
			} else
				alpha += input.charAt(i);
		}
		System.out.println(sum + alpha + digit);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print inputs");
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			m1(str1[i]);
		}
	}

}
