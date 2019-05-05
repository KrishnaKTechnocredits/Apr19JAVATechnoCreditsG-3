package namrataS;



class Calculator2{
	int x=20;
	int y=10;

	void addition()
	{	
		System.out.println("The sum of x & y is :"+ (x+y));
 	}
	void subtraction()
	{
		System.out.println("The subtraction of x & y is :"+ (x-y));
	}	
	void multiplication()
	{
		System.out.println("The multiplication of x & y is :" +(x*y));
	}
	void division()
	{
		System.out.println("The division of x & y is :" +(x/y));
	}

	public static void main(String[] args)
	{
		Calculator2 c= new Calculator2();
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
	}



}
