class Calculator
{
int sum(int a,int b)
	{
	 System.out.println("Sum of a and b is"+(a+b));
	 return a+b;
	}
int sub(int a,int b)
	{
	 System.out.println("Sub of a and b is"+(a-b));
	 return a-b;
	}
int div (int a,int b)
	{
	 System.out.println("Div of a and b is"+(a/b));
	 return a/b;
	}
int mult(int a,int b)
	{
	 System.out.println("Mult of a and b is"+(a*b));
	 return a*b;
	}
int remainder(int a,int b)
	{
	 System.out.println("Remainder of a and b is"+(a%b));
	 return a%b;
	}
public static void main(String arg[])
{
 	Calculator calculator = new Calculator();
	calculator.sum(10,20);
	calculator.sub(40,20);
 	calculator.div(100,5);
	calculator.mult(5,3);
	calculator.remainder(3,2);
}
}


