package kritiG;
//1. Create a Circle class with fields radius as float 

//Initialize the radius through method .
//Also create separate method to calculate Area and Circumference of a Circle. 
//Create another class as ClientCircle and call the respective methods.

import java.util.Scanner;

public class Circle {
	private float radius = 0;

	float radius() {
		Scanner sc = new Scanner(System.in);
		// Accepting radius input in string and converting to floating type
		System.out.println("Enter the radius of the circle ");
		String x = sc.next();
		radius = Float.parseFloat(x);
		sc.close();
		return radius;

	}

	double area(float radius) {
		double area = Math.PI * radius * radius;
		return area;
	}

	double circumference(float radius) {
		double cir = 2 * Math.PI * radius;
		return cir;
	}

}
