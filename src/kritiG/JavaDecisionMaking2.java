package kritiG;
//Find greater of two numbers using ternary operator

import java.util.Scanner;

public class JavaDecisionMaking2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting 3 integers
		System.out.println("Enter 2 numbers ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		JavaDecisionMaking2 j = new JavaDecisionMaking2();
		System.out.println("The greater of the two numbers is " + j.max(x, y));
		sc.close();
	}

	int max(int a, int b) {
		// one way of using ternary operator
//		int max = 0;
//		if (Integer.compare(a, b) > 0)
//			max = a;
//		else
//			max = b;
		
		// Another way of using ternary operator
		int max =Integer.max(a, b);

		return max;

	}

}
