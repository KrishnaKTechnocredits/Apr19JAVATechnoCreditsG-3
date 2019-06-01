package nehaJ.assignment1;

//Program to compute simple interest
public class SimpleInterest {
	public static void main(String[] args) {
		int principal = 100000;
		int time = 3;
		float rate = 9.8f;
		SimpleInterest calc = new SimpleInterest();
		System.out.println("Simple Interest of the number is: " + calc.simpleInt(principal, time, rate));
	}

	// Calculate Simple Interest
	float simpleInt(int p, int t, float r) {
		return ((p * t * r) / 100);
	}
}
