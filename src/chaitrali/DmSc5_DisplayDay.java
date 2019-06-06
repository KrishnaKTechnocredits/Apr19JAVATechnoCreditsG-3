package chaitrali;

import java.util.Scanner;

public class DmSc5_DisplayDay {
	
	public void DisplayDay(int day)
	{
		switch(day){
			case 1:
				System.out.println("Today is Monday.");
				break;
			case 2:
				System.out.println("Today is Tuesday.");
				break;
			case 3:
				System.out.println("Today is Wednesday.");
				break;
			case 4:
				System.out.println("Today is Thursday.");
				break;
			case 5:
				System.out.println("Today is Friday.");
				break;
			case 6:
				System.out.println("Today is Saturday.");
				break;
			case 7:
				System.out.println("Today is Sunday.");
				break;
			default:
				System.out.println("Invalid input.");
				break;
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 7:");
		int day = sc.nextInt();
		
		DmSc5_DisplayDay num = new DmSc5_DisplayDay();
		num.DisplayDay(day);
		sc.close();
	}

}
