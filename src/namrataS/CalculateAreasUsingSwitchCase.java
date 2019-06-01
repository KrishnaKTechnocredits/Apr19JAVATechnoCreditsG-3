package namrataS;

import java.util.Scanner;

public class CalculateAreasUsingSwitchCase {

	static void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("To calculate are of rectangle");
			System.out.println("Enter length");
			int length = sc.nextInt();
			System.out.println("Enter breadth");
			int breadth = sc.nextInt();
			int area = length * breadth;
			System.out.println("Area of rectangle is " + area);
			break;
		case 2:
			System.out.println("To calculate area of Triangle");
			System.out.println("Enter base");
			int base = sc.nextInt();
			System.out.println("Enter height");
			int height = sc.nextInt();
			double area1 = 1 / 2 * base * height;
			System.out.println("Area of Triangle is " + area1);
			break;
		case 3:
			System.out.println("To calculate area of circle");
			System.out.println("Enter radius");
			int radius = sc.nextInt();
			area1 = 3.14 * radius * radius;
			System.out.println("Area of Circle is " + area1);
			break;
		}

	}

	public static void main(String[] args) {
		m1();
	}

}
