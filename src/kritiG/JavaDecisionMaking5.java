package kritiG;
//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and 

//displays the name of the weekday. (use switch case) 

import java.util.Scanner;

public class JavaDecisionMaking5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting an integer
		System.out.println("Enter any number ");
		int x = sc.nextInt();
		// to generate 7 numbers from 1 to 7 , find modular of that number with
		// 7 ( add 1 so that we can go from 1 to 7 instead of 0 to 6)
		int y = (x % 7) + 1;

		JavaDecisionMaking5 j = new JavaDecisionMaking5();
		j.weekday(y);
		sc.close();
	}

	void weekday(int a) {
		switch (a) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("No day for this number");
			break;

		}
	}

}
