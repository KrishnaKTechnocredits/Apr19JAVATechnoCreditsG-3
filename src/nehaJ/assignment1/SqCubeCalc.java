package nehaJ.assignment1;

//Program to find the square and cube of a number
public class SqCubeCalc {

	public static void main(String[] args) {
		int num = 55;
		SqCubeCalc calc = new SqCubeCalc();
		System.out.println("Square of number " + num + " is: " + calc.square(num) + "\nAnd cube is: " + calc.cube(num));
	}

	// Calculate square of number
	int square(int a) {
		return (a * a);

	}

	// Calculate cube of number
	int cube(int b) {
		return (b * b * b);
	}
}
