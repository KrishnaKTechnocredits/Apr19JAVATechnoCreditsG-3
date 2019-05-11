package namrataS;

public class SwapTwoVariables1
{

	int a=10;
	int b=20;
	void display()
	{
		//System.out.println(c=a);
		int temp = a;
		System.out.println("Value of a is " + (a = b));
		System.out.println("Value of b is " + (b = temp));
	}
	
	public static void main(String[] args)
	{
		SwapTwoVariables1 s = new SwapTwoVariables1();
		s.display();
	}
}