package shubhamJ.Assignment1;

public class Q7Conversion {

	public void convert(int seconds)
	{
		int hours = seconds/3600;
		int minutes = (seconds%3600)/60;
		int sec = (seconds%3600)%60;
		System.out.println(seconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + sec + " seconds");
	}

	public static void main (String [] args)
	{
		Q7Conversion c = new Q7Conversion();
		c.convert(3700);
	}
}
