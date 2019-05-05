package kritiG;

public class Program6 {
	
	float temperature( float far)
	{
		return ((far -32)*5)/9;
	}
	
	public static void main(String[] args) {
		Program6 program6= new Program6();
		System.out.println(" The temperature in farenheits is 48 degrees");
		System.out.println("The temperature in degree celcius is " + program6.temperature(48));
		
	}

}
