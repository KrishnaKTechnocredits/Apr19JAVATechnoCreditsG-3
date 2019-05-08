package sujayP;

/* WAP convert temperature  from fahrenheit to celsius degree
celsius= (fahrenheit - 32) *5 /9
*/

public class Q6 
{
	void fahrenheit(int fahrenheit)
	{
		float celsius= (fahrenheit - 32) *5 /9;
		System.out.println("Temperature in fahrenheit= "+ fahrenheit+ "  means temeprature in celsius degree= "+celsius);
	}
	
	public static void main(String args[])
	{
		Q6 q6=new Q6();
		q6.fahrenheit(400);
		q6.fahrenheit(50);
	}

}
