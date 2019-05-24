package namrataS;

import java.util.Scanner;

public class StringArrayAssignment4 {

	static int[] m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print numbers");
		String num = sc.nextLine();
		String[] array = num.split(" ");
		int[] n = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			n[i] = Integer.parseInt(array[i]);
		}
		return n;
	}

	static void m2(int[] number) {
		for (int i = number.length - 1; i >= 0; i--) {
			System.out.print(number[i]);
		}
	}

	public static void main(String[] args) {
		int[] n = m1();
		m2(n);

	}

}
