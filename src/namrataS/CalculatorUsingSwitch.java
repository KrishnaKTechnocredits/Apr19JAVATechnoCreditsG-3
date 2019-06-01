package namrataS;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		int num1, num2;
		int output=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 = sc.nextInt();
		System.out.println("Enter any opeartor");
		char operator = sc.next().charAt(0);
		switch (operator) {
		case '+':
			output = num1 + num2;
			break;
		case '-':
			output = num1 - num2;
			break;
		case '*':
			output = num1 * num2;
			break;
		case '/':
			output = num1 / num2;
			break;
		default:
			System.out.println("You have entered wrong opeartor");
			
		}
		System.out.println(num1 + " " + operator + " " + num2 + " : " + output);

	}

}
