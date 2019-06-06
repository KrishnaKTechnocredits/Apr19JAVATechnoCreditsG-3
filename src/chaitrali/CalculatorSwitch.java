package chaitrali;

import java.util.Scanner;

public class CalculatorSwitch {

	public void calculate(int num1 , int num2, String operation)
	{
		switch (operation){
		case "Add":
			int sum = num1 + num2;
			System.out.println("Addition of no.s is: " + sum);
			break;
		case "Subtract":
			int subtraction = num1 - num2;
			System.out.println("Subtraction of no.s is: " + subtraction);
			break;
		case "Multiply":
			int multiplication = num1 * num2;
			System.out.println("multiplication of no.s is: " + multiplication);	
			break;
		case "Divide":
			int division = num1 - num2;
			System.out.println("division of no.s is: " + division);
			break;
		case "Remainder":
			int reminder = num1%num2;
			System.out.println("Remainder is: " + reminder);
			break;
		default:
			System.out.println("You have not entered any operation.");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation to be performed");
		String operation = sc.next();
		
		CalculatorSwitch cs = new CalculatorSwitch();
		cs.calculate(a,b,operation);
		sc.close();
		}

}
