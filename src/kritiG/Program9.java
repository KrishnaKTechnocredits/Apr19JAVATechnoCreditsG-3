package kritiG;

public class Program9 {
	
	void swap (int x, int y)
	{
		System.out.println("Two numbers are x =" + x + " and y = " + y);
		
		x= x+y;
		y= x-y;
		x=x-y;
		
	
		System.out.println("The swapped numbers are x =" + x + " and y = " + y);
		
	}
	
	
	public static void main(String[] args) {
		Program9 program9 = new Program9();
		program9.swap(10, 20);
	}


}