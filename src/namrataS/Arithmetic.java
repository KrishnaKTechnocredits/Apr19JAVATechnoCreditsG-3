package namrataS;

public class Arithmetic
{
	int x = 40;
	int y = 10;

	void sum()
	{
		System.out.println("Sum of x&y is : " +(x+y));
	}
	void multiply()
	{
		System.out.println("Multiplication of x&y is : " +(x*y));
	}
	void subtract()
	{
		System.out.println("Subtraction of x&y is : " +(x-y));
	}
	void divide()
	{
		System.out.println("Division of x&y is : " +(x/y));
	}
	void mod()
	{
		System.out.println("Remainder of x&y is : " +(x%y));
	}
		
	public static void main(String[] args)
	{
		Arithmetic a = new Arithmetic();
		a.sum();
		a.multiply();
		a.subtract();
		a.divide();
		a.mod();
	}
}
