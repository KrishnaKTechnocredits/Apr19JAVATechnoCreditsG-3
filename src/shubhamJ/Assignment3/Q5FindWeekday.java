package shubhamJ.Assignment3;

import java.util.Scanner;

public class Q5FindWeekday {

	public static void main(String a[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1-7 :");
		int num1 = sc.nextInt();
		Q5FindWeekday c = new Q5FindWeekday();
		c.findWeekday(num1);
	
	}

	void findWeekday(int num1) {
		switch (num1)
		{
		case 1 :
		{
			System.out.println("Monday");
			break;
		}
		case 2 :
		{
			System.out.println("Tuesday");
			break;
		}
		case 3 :
		{
			System.out.println("Wednesday");
			break;
		}
		case 4 :
		{
			System.out.println("Thursday");
			break;
		}
		case 5 :
		{
			System.out.println("Friday");
			break;
		}
		case 6 :
		{
			System.out.println("Saturday");
			break;
		}
		case 7 :
		{
			System.out.println("Sunday");
			break;
		}
		default:
			System.out.println("Invalid Entry");
	}
	}
}
