package namrataS;

public class SwapTwoVariables2
{
	int x=10;
	int y=20;
	void display()
	{
		x=x+y;
		System.out.println("Value of y is " + (y=x-y));
		System.out.println("Value of x is " + (x=x-y));
	}
	public static void main(String[] args)
	{
		SwapTwoVariables2 s2 = new SwapTwoVariables2();
		s2.display();
	}
}
	
