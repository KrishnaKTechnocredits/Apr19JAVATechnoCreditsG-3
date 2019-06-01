package namrataS;

import java.util.Scanner;

public class ClientOfCircleClass {
	public static void main(String[] args) {
		CircleClass c= new CircleClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Print radius");
		int r= sc.nextInt();
		
		c.m1(r);
		double x =c.areaOfCircle(r);
		System.out.println("Area is " + x);
		
		double y =c.perimeterOfCircle(r);
		System.out.println("Perimeter is " +y);
		
	}

}
