package chaitrali;

public class Square {
	double side;
	double area;
	
	Square(double side)
	{ this.side = side;}
	
	void SquareArea()
	{
		area = side*side;
		System.out.println("Area of the square is: " + area);
	}
}
