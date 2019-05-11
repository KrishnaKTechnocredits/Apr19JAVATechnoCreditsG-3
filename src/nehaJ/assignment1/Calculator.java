package nehaJ.assignment1;

//Interactive calculator program
public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Addition of numbers is\n" + calc.add(67, 34));
		System.out.println("Subtraction of numbers is\n" + calc.sub(45, 34));
		System.out.println("Multiplication of numbers is\n" + calc.mul(98, 12));
		System.out.println("Division of numbers is\n" + calc.div(34, 23));
		System.out.println("And remainder after division is\n" + calc.mod(89, 23));
	}

	// Add two numbers
	int add(int a, int b) {
		return (a + b);

	}

	// Subtraction of two numbers
	int sub(int a, int b) {
		return (a - b);

	}

	// Multiply two numbers
	int mul(int a, int b) {
		return (a * b);

	}

	// Division of two numbers
	int div(int a, int b) {
		return (a / b);

	}

	// Modulus of two numbers
	int mod(int a, int b) {
		return (a % b);

	}
}
