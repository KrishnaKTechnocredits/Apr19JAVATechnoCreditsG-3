package sujayP;

//WAP to print the sum,substraction,multiplication,division,remainder of two numbers given by user

public class Q1 
{
	void addition(int x, int y)
	{
		System.out.println("Addition is = " + (x+y));
	}
	
	void substraction(int x, int y)
	{
		System.out.println("Substraction is = "+ (x-y));
	}
	
	void multiplication(int x, int y)
	{
		System.out.println("multiplication is = " + (x*y));
	}

	void division(int x, int y)
	{
		System.out.println("division is = " + (x/y));
		System.out.println("remainder is = " + (x%y));
	}
	
	public static void main(String args[])
	{ Q1 q1= new Q1();
	 q1.addition(10, 20);
	 q1.substraction(20, 10);
	 q1.multiplication(10, 20);
	 q1.division(115, 3);
		
	}

}
