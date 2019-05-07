package shubhamJ.Assignment1;

public class Q6ConversionDegree {
	
	public void convert(int f)
	{
		double celsius = (f-32)*5/9;
		
		System.out.println(f+ " Fahrenheit = " + celsius + " Celsius");
	}

	public static void main (String [] args)
	{
		Q6ConversionDegree c = new Q6ConversionDegree();
		c.convert(200);
	}
}
