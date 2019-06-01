package namrataS;

import java.util.Scanner;

public class TernaryOperator {
	
	static void m1() {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		x = sc.nextInt();
		y = sc.nextInt();
		int max;
		
		max=(x>y)? x:y;
		System.out.println(max + " is largest ");
		
	}

	public static void main(String[] args) {
		m1();
	}

}
