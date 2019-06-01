package nehaJ.assignment1;

//program to convert temperature from Fahrenheit to Celsius degree
public class TempConversion {
	public static void main(String[] args) {
		float tempF = 101.0f;
		// Convert temperature from Fahrenheit to Celsius degree
		float tempC = (tempF - 32) * 5 / 9;// Calculation from left to right for
											// arithmetic operation
		System.out.println("temperature " + tempF + " F after conversion is " + tempC + " degree Celsius");

	}

}
