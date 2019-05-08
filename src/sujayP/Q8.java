package sujayP;

//WAP to swap two numbers using third variable

public class Q8 
{
	void swap(int x, int y)
	{
		System.out.println("x is = " + x + " and y is = " + y); //x=10 y=20
		
		int z= y; //20
		y=x; // 10
		x=z; // 20
		
		System.out.println("after swapping: " + "x is = " + x + " and y is = " + y); // x=20 y=10
	}

	public static void main(String args[])
	{
		Q8 q8= new Q8();
		q8.swap(10, 20);
	}

}
