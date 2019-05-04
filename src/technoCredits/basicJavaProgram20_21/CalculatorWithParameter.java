package technoCredits.basicJavaProgram20_21;
//sum, substration, division and multiplication

class CalculatorWithParameter {
	int x = 20;
	int y = 10;

	public static void main(String a[]) {
		CalculatorWithParameter c = new CalculatorWithParameter();
		c.sum(10, 20);
		c.sum(100, 20); // l= 100, m = 20
		c.sum(270, 207);
		// c.substraction();
		// c.division();
		// c.substraction();
	}

	void sum(int x, int y) { // l= 10, m=20
		int sum = x + y;
		System.out.println("Sum is: " + sum);
	}

	void multiplication() {
		System.out.println("Multiplication is: " + (x * y));
	}

	void division() {
		System.out.println("Division is: " + (x / y));
	}

	void substraction() {
		System.out.println("Substraction is: " + (x - y));
	}

}