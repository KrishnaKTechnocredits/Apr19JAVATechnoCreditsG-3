package kritiG;
//Find the largest of three numbers using Logical And operator

import java.util.Scanner;

public class JavaDecisionMaking1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Accepting 3 integers
		System.out.println("Enter 3 numbers ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		JavaDecisionMaking1 j = new JavaDecisionMaking1();
		//getting max value from max method
		System.out.println("The largest of the three numbers is " + j.max(x, y, z));
		sc.close();

	}
	
// defining max method to find max using logical and operator
	int max(int x, int y, int z) {
		int max = 0;
		if (x > y && x > z)
			max = x;
		else if (y > x && y > z)
			max = y;
		else
			max = z;
		return max;
	}

}
