package kritiG;
//Assignment 1 Program1:
//Simple calculator
public class Program1 {
	
	void sum(int a, int b)
	{
		System.out.println("The sum of the two numbers "+ a +" and "+ b +" is " + (a+b));		
	}
	
	void diff(int a, int b)
	{
		System.out.println("The difference of the two numbers "+ a +" and "+ b +" is " + (a-b));		
	}
	
	void multiply(int a, int b)
	{
		System.out.println("The multiplication of the two numbers "+ a +" and "+ b +" is " + (a*b));		
	}
	
	void division(int a, int b)
	{
		System.out.println("The quotient of the two numbers "+ a +" and "+ b +"  is " + (a/b));		
	}
	
	void remainder(int a, int b)
	{
		System.out.println("The remainder on division of the two numbers "+ a +" and "+ b +"  is " + (a%b));		
	}
	
	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.sum(10, 3);
		program1.diff(10, 3);
		program1.multiply(10, 3);
		program1.division(10, 3);
		program1.remainder(10, 3);
		
		
	}
}
