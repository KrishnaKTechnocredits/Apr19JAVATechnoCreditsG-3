package kritiG;
//Write a Java Program and create Calculator using switch statement 

import java.util.Scanner;

public class JavaDecisionMaking4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting 2 integers
		System.out.println("Enter 2 numbers ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		// selecting operation
		System.out.println("Enter an arithmetic operation(add/sub/mul/div) ");
		String op = sc.next();

		JavaDecisionMaking4 j = new JavaDecisionMaking4();
		//calling calculator method
		j.calculator(x, y, op);
		sc.close();
	}

	void calculator(int a, int b, String operation) {
		switch (operation) {

		case "add":
			System.out.println(a + b);
			break;

		case "sub":
			System.out.println(a - b);
			break;

		case "mul":
			System.out.println(a * b);
			break;

		case "div":
			System.out.println(a / b);
			break;

		default:
			System.out.println("invalid operation");
			break;

		}

	}

}
