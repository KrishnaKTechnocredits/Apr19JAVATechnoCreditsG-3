package kritiG;
//Assignment 1 Program8:
//Number swap using third variable

public class Program8 {
	
	void swap (int x, int y)
	{
		System.out.println("Two numbers are x =" + x + " and y = " + y);
		
		int t = x;
		x=y;
		y=t;
		System.out.println("The swapped numbers are x =" + x + " and y = " + y);
		
	}
	
	
	
	public static void main(String[] args) {
		Program8 program8 = new Program8();
		program8.swap(10, 20);
		
	}

}
