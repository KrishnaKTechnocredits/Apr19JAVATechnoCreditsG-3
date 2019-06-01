package namrataS;

import java.util.Scanner;

public class LogicalAndOperator {
	static int m1() {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		if (x > y && x > z)
			System.out.println(x + " is largest number ");
		else if (y > x && y > z)
			System.out.println(y + " is largest number ");
		else if (z > x && z > y)
			System.out.println(z + " is largest number ");
		else
			System.out.println(" Indistinct number");

		return x;
	}

	public static void main(String[] args) {
		m1();
	}

}
