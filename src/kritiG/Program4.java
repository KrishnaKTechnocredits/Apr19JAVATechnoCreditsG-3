package kritiG;

public class Program4 {
	
	int rectangleArea(int l, int b)
	{
		return(l*b);
	}

	int rectanglePerimeter(int l, int b)
	{
		return(2*(l+b));
	}
	
	double circleArea(int r)
	{
		return(r*r* Math.PI);
	}

	double circlePerimeter(int r)
	{
		return(2* Math.PI * r);
	}	
	
	public static void main (String [] args){
		
		Program4 program4= new Program4();
		System.out.println("The area of the rectangle is "+ program4.rectangleArea(20,40));
		System.out.println("The Perimeter of the rectangle is "+ program4.rectanglePerimeter(20,40));
		System.out.println("The area of the circle is "+ program4.circleArea(30));
		System.out.println("The Perimeter of the circle is "+ program4.circlePerimeter(30));
		
		
		
	}

}
