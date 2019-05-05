package namrataS;

public class FahrenheitToCelsius
{
	static void display(int f)
	{
		int x =  (f - 32) * 5 / 9 ;
		System.out.println("Final temp is " + x);
	}
	public static void main(String[] args)
	{
		display(30);	
	}
}
