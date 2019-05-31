package shubhamJ.Assignment3;

import java.util.Scanner;

public class Q4CalculatorProgram {

	public static void main(String a[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter action Add/Sub/Div/Multiply : ");
		String action= sc.next();
		Q4CalculatorProgram c = new Q4CalculatorProgram();
		c.calculator(num1,num2,action);
	
	}

	void calculator(int num1,int num2,String action) {
		switch (action)
		{
		case "Add" :
		{
			System.out.println("Sum is: " + (num1+num2));
			break;
		}
		case "Sub" :
		{
			System.out.println("Difference is: " + (num1-num2));
			break;
		}
		case "Div" :
		{
			System.out.println("Div is: " + (num1/num2));
			break;
		}
		case "Multiply" :
		{
			System.out.println("Multiplication is: " + (num1*num2));
			break;
		}
		default:
			System.out.println("Invalid Entry");
	}
	}
}


