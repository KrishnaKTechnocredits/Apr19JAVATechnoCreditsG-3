package kritiG;

public class Program5 {
	
	float simpleinterest(int p, int t, int r)
	{
		System.out.println(" The simple interest for Principal amount " + p +" with rate of interest " 
				+r + " for " + t + "years is" );
		return (p*t*r)/100;
			
	}
	
	public static void main(String[] args) {
		
		Program5 program5 = new Program5();
		//float y= program5.simpleinterest(10000,5,8);
		System.out.println(program5.simpleinterest(10000,5,8));
		
	}
}
