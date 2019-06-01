package sujayP;

//WAP to find the area and perimeter of Rectangle and circle

public class Q4 
{
	void rectangle(int l, int w)
	{
		int area= l*w;
		int perimeter= 2*(l+w);
		
		System.out.println("area of Rectangle = " + area);
		System.out.println("Perimeter of Rectangle = " + perimeter);
	}
	
	void circle(int r)
	{
		float pi= 3.14f;
		float area= pi*r*r;
		float perimeter= 2*pi*r;
		
		System.out.println("area of circle is = " + area);
		System.out.println("perimeter of cicrcle is = " + perimeter);
		
	}
	
	public static void main(String args[])
	{
		Q4 q4= new Q4();
		q4.rectangle(5, 7);
		System.out.println("________________________________________________________");
		q4.circle(8);
	}

}
