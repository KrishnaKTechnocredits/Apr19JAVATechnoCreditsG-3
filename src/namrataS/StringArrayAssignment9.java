package namrataS;

import java.util.Scanner;

public class StringArrayAssignment9 {

	static void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full string ");
		String str = sc.nextLine();
		String[] array = str.split(" ");

		String reverse = "";
		
		for (int i = 0; i < array.length; i++) {
			String userName = array[i];
			for (int j = userName.length() - 1; j >= 0; j--) {
				reverse = reverse + userName.charAt(j);
			}
			reverse += " ";
		}
		System.out.println( reverse + "\t ");
	}

	public static void main(String[] args) {

		ex1();
	}
}
