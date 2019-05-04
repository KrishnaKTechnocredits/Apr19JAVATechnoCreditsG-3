package technoCredits.basicJavaProgram20_21;
//sum, substration, division and multiplication

class Calculator {
	int x = 20;
	int y = 10;

	public static void main(String a[]) {
		Calculator c = new Calculator();
		c.sum();
		c.substraction();
		c.division();
		c.substraction();
	}

	void sum() {
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