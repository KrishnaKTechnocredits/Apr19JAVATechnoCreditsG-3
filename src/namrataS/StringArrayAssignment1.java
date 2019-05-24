package namrataS;

import java.util.Scanner;

public class StringArrayAssignment1 {

	static void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full string ");
		String str = sc.nextLine();
		String reverse= "";
		for (int i = str.length() - 1; i >= 0; i--) {
			 reverse = reverse+str.charAt(i);
			
		}
			System.out.println(reverse);
	}

	public static void main(String[] args) {

		ex1();
	}

}
