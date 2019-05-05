class Cal_With_Parameter_Overloading{
	int x=20;
	int y =10;
	
	void sum(){
		int addition= x+y;
		System.out.println("Sum is: "+addition);
	}
	
	void sum(int first, int second){
		int addition= first+second;
		System.out.println("Sum is: "+addition);
	}
	
	void sum(double first, double second){
		double addition= first+second;
		System.out.println("Sum is: "+addition);
	}
	
	void sum(float first, float second){
		float addition= first+second;
		System.out.println("Sum is: "+addition);
	}
	
	void sum(String first, String second){
		String addition= first+" "+second;
		System.out.println("Sum is: "+addition);
	}
	void sub(){
		int subtract= x-y;
		System.out.println("Subtraction is : "+subtract);
	}
	
	void mult(){
			int multiplication= x*y;
			System.out.println("Multiplication is: "+ multiplication);
	}
	
	void div(){
			int division= x/y;
			System.out.println("Division is: "+ division);
	}
	
	void test(String name, int rollNumber)
	{
		if (rollNumber >10)
		{
			System.out.println("name of student:" + name);
		}
		else
		{
			System.out.println("name of student:" + "TechnoCredit");
		}
		
	}
	
	void getGrad(int marks)
	{
		if (marks <= 100 && marks>=90)
		{
			System.out.println("Grade= A+ ");
		}
		else if(marks < 90 && marks>=80)
		{
			System.out.println("Grade= A");
		}
		else if(marks < 80 || marks>=60)
		{
			System.out.println("Grade= B");
		}
	}
	public static void main(String [] args){
		Cal_With_Parameter_Overloading cal= new Cal_With_Parameter_Overloading();
		/*cal.sum();
		cal.sum(50,60);
		cal.sum(40.5f,60.5f);
		cal.sum(54.54,60.646);
		cal.sum("Umesh","Koli");
		cal.sub();
		cal.mult();
		cal.div();
		cal.test("umesh",1);
		cal.test("Koli",12);*/
		//cal.getGrad(87);
		
		cal.getGrad(args[2]);
	}	
}
