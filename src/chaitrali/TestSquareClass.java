package chaitrali;

import java.util.Scanner;

public class TestSquareClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for side of a square: ");
		double side = sc.nextDouble();
		
		Square obj = new Square(side);
		obj.SquareArea();
		sc.close();
	}

}
