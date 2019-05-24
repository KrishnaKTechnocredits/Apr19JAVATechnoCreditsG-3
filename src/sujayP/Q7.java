package sujayP;

//WAP to convert seconds to hour, minute and seconds

public class Q7 
{
	void convertion(int x)
	{
		int p= x/3600; // here we get hours
		  int q= (x%3600)/60; // here we get minute
		  int r= (x%3600)%60; // here we get seconds
		  System.out.println(x + " seconds = " + p + " Hours : " + q + " Minutes : " + r + " seconds ");
	}
	
	public static void main(String args[])
	{
		Q7 q7= new Q7();
		q7.convertion(3666);
		q7.convertion(366);
		q7.convertion(36);
	}


}
