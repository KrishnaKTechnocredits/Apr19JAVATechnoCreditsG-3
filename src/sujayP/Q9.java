package sujayP;

// WAP to swap two numbers without using the third variable

public class Q9 
{
	void swap(int x, int y)
	{
		System.out.println("x is = " + x + " and y is = " + y);
		
		
		x=x+y; //x=150
		y=x-y; // Y=50
		x=x-y; // x=100
		
		/*  OR you can write directly also
		y=(x+y)-(x=y);  */
		
		
		System.out.println("after swapping: " + "x is = " + x + " and y is = " + y);
		
		
	}
	
	public static void main(String args[])
	{
		Q9 q9= new Q9();
		q9.swap(50,100);
		
	}

}
