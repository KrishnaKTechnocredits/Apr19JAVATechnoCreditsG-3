package chaitrali;

public class Addition {
	
	public void add(int a, int b)
	{
		int intSum = a+b;
		System.out.println("Sum of 2 integers is: " + intSum);
	}
	
	public void add(double a, double b)
	{
		double doubleSum = a+b;
		System.out.println("Sum of 2 decimals is: " + doubleSum);
	}
	
	public void add(String a, String b)
	{
		String stringSum = a+b;
		System.out.println("Sum of 2 Strings is: " + stringSum);
	}

	public static void main(String[] args) {
		
		Addition ad1 = new Addition();
		ad1.add(5,100);
		ad1.add(20.217,98.345);
		ad1.add("Chaitrali", "Veturkar");
	}

}
