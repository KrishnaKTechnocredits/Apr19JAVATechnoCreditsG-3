package namrataS;

public class TimeCalculation
{
	//int seconds = 3700;
	void m1(int seconds)
	{
		System.out.print(" Hours is " + (seconds/3600));
		System.out.print(" Minutes is " + ((seconds%3600)/60));
		System.out.print(" Seconds is " + ((seconds%3600)%60));
	}
	public static void main(String[] args)
	{
		TimeCalculation tc = new TimeCalculation();
		tc.m1(3700);
		tc.m1(3725);
	}
}
