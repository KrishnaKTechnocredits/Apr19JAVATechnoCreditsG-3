package namrataS;

public class SimpleInterest
{
	int p = 100;
	int t = 2;
	int r = 3;
	int m1()
	{
		int s = p*t*r/100;
		System.out.println("Simple interest is " + s);
		return s;
	}
	public static void main(String[] args)
	{
		SimpleInterest si = new SimpleInterest();
		si.m1();
	}
}
