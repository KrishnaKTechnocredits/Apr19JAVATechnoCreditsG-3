package chaitrali;

import java.util.Scanner;

public class ClObj1_Circle {
	
	float radius;
	
	public void initRadius()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius: ");
		radius = sc.nextFloat();
		sc.close();
	}
	
	public void calculateArea()
	{
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle is: " + area);
	}
	
	public void calculateCircum()
	{
		double circum = 2 * 3.14 * radius;
		System.out.println("Circumference of circle is: " + circum);
		
	}
	
	
}
