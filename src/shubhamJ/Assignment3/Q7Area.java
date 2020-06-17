package shubhamJ.Assignment3;

import java.util.Scanner;

import shubhamJ.BankingSystem;

public class Q7Area {

public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Q7Area a = new Q7Area();
	System.out.println("What you want to do: \n 1. Area of Rectangle - Enter 1 \n 2. Area of Triangle - Enter 2 \n 3. Area of Circle - Enter 3");
	int userInput = sc.nextInt();
		switch(userInput)
		{
		case 1 :
		{
			a.areaOfRectangle(10,20);
			break;
		}
		case 2 :
		{
			a.areaOfTriangle(10,20);
			break;
		}
		case 3 :
		{
			a.areaOfCircle(10);
			break;
		}
		}
	}

private void areaOfRectangle(int length,int breadth) {
	System.out.println("Area of rectangle = "+(length*breadth));
}
private void areaOfTriangle(int base,int height) {
	
	System.out.println("Area of triangle = "+(0.5*base*height));
}
private void areaOfCircle(int radius) {
	
	System.out.println("Area of circle = "+(3.14*radius*radius));
}
}
