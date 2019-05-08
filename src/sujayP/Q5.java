package sujayP;

/* WAP to compute simple interest
simple intereset: (p*t*r)/100
P: principle amount
T: time(year)
R: rate
*/

public class Q5 
{
	void interest(double P, float T, float R)
	{
		double interest= (P*T*R)/100;
		System.out.println("Interest is = " + interest);
	}
	
	public static void main(String args[])
	{
	 Q5 q5=new Q5();
	 q5.interest(250000, 2, 12);
	 q5.interest(250000.55, 2.5f, 12.5f);
	}

}
