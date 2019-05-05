package namrataS;

public class SquareAndCube
{
	int square(int a)
	{
		System.out.println("Square of a is " + (a*a));
		return a;
	}
	int cube(int b)
	{
		System.out.println("Cube of b is " + (b*b*b));
		return b;
	}
	public static void main(String[] args)
	{
		SquareAndCube sc = new SquareAndCube();
		sc.square(2);
		sc.cube(3);
		
	}
}
	
