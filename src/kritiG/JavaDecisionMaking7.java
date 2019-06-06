package kritiG;
//Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement. 

//Make it a menu driven program.. 
//Formulas:-Area Of rectangle=length*breadth Area of triangle=1/2*base*height 
//Area of Circle=3.14*radius*radius 

import java.util.Scanner;

public class JavaDecisionMaking7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select from the following options to find area : rectangle, triangle, circle ");
		String op = sc.next();
		JavaDecisionMaking7 j = new JavaDecisionMaking7();

		System.out.println(" The area of " + op + " is " + j.area(op));

		sc.close();
	}

	double area(String operation) {
		Scanner sc = new Scanner(System.in);
		double area = 0;
		// switch case for different geometry areas
		switch (operation) {
		case "rectangle":
			System.out.println(" Enter length and breadth of the rectangle ");
			double l = sc.nextInt();
			double b = sc.nextInt();
			area = l * b;
			break;

		case "triangle":
			System.out.println(" Enter base and height of the triangle ");
			double base = sc.nextInt();
			double h = sc.nextInt();
			area = 0.5 * base * h;
			break;

		case "circle":
			System.out.println(" Enter radius of a circle ");
			double r = sc.nextInt();
			area = Math.PI * r * r;
			break;

		}
		sc.close();
		return area;

	}

}
