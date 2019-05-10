package sonalL;

public class Swapnums {
	
	static void swapNumbers()
	{
		int a = 10;
		int b = 20;
		int c = 0;
		
		c=a;
		a =b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	static void swapNoThirdVariable()
	{
		int a = 25;
		int b = 49;
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	
	}

	public static void main(String[] args) {
		//swapNumbers();
		swapNoThirdVariable();
		
	}

}
