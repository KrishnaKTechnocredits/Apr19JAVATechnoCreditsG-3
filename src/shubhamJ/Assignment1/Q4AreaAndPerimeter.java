package shubhamJ.Assignment1;

public class Q4AreaAndPerimeter {

	public int areaOfRectangle(int length, int breadth)
	{
		return (length*breadth);
	}

	public double areaOfCircle(int radius)
	{
		return (3.14*radius*radius);
	}

	public int perimeterOfRectangle(int length, int breadth)
	{
		return 2*(length+breadth);
	}

	public double perimeterOfCircle(int radius)
	{
		return (2*3.14*radius);
	}
	
	public static void main(String[] args) {
		Q4AreaAndPerimeter ap = new Q4AreaAndPerimeter();
		System.out.println("Area Of Rectangle = " + ap.areaOfRectangle(10,20)); 
		System.out.println("Area Of Circle = " + ap.areaOfCircle(10)); 
		System.out.println("Perimeter Of Rectangle = " + ap.perimeterOfRectangle(10,20)); 
		System.out.println("Perimeter Of Circle = " + ap.perimeterOfCircle(10)); 

	}

}
