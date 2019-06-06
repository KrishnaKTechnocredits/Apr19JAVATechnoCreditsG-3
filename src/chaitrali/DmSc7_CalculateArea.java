package chaitrali;

import java.util.Scanner;

public class DmSc7_CalculateArea {
	
	public void calculateArea(String shape){
		switch(shape){
		case "Rectangle":
			int l =7, b=10;
			double rArea = (l*b);
			System.out.println("Area of rectangle is: " + rArea);
			break;
		case "Triangle":
			double base =7, height=10;
			double tArea = (base * height)/2;
			System.out.println("Area of triangle is: " + tArea);
			break;
		case "Circle":
			double radius = 3.5;
			double cArea = 3.14*radius*radius;
			System.out.println("Area of circle is: " + cArea);
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape whose area needs to be calculated: Rectangle, Triangle, Circle");
		String shape = sc.next();
			
		DmSc7_CalculateArea obj = new DmSc7_CalculateArea();
		obj.calculateArea(shape);
		sc.close();
	}

}
