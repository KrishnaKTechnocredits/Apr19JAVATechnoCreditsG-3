package kritiG;

import java.util.Scanner;

//WAP to print factorial number 

public class String6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial: ");
		int num = sc.nextInt();
		System.out.println("Factorial of the number is " + factorial(num));
		sc.close();
	}

	static int factorial(int number) {
		int fact = 1;
		for (int i = number; i > 0; i--) {
			fact *= i;
		}
		return fact;

	}

}
