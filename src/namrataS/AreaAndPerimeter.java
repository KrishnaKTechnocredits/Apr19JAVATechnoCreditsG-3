package namrataS;

public class AreaAndPerimeter
{
	int rectangle(int x,int y)
	{
		int area = x*y;
		System.out.println("Area is " + area);
		
		System.out.println("Perimeter is " + 2*(x+y));
		return y;
	}
	int circle(int r)
	{
		
		System.out.println("Area is " + (3.14*r*r));
		
		System.out.println("Perimeter is " + (2*3.14*r));
		return r;
	}

	
	public static void main(String[] args)
	{
		AreaAndPerimeter ap = new AreaAndPerimeter();
		ap.rectangle(10,20);
		ap.circle(2);

	}
}
	