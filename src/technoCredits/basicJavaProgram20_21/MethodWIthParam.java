package technoCredits.basicJavaProgram20_21;

class MethodWIthParam {

	public static void main(String[] a) {
		MethodWIthParam m = new MethodWIthParam();
		m.sum(10, 20);
		m.display("Krishna", 10);
		m.multiplicationWithAction(12, 20, 30, 40, 50, 60, "Multiplication");
	}

	void sum(int x, int y) {
		System.out.println("X is: " + x + " Y is: " + y);
	}

	void display(String name, int rollNumber) {
		System.out.println("Student name is: " + name + " RollNumaber is: " + rollNumber);
	}

	void multiplicationWithAction(int x, int y, int z, int a, int b, int c, String value) {
		System.out.println("Multiplication is: " + (x * y * z * a * b * c) + " Action Name is: " + value);
	}

}