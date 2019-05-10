package kritiG;
//Assignment 1 Program3:
//Square and cube

public class Program3 {

	int square(int a) {
		return a * a;
	}

	int cube(int a) {
		return a * a * a;
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		System.out.println("The square of the given number is " + program3.square(9));
		System.out.println("The cube of the given number is " + program3.cube(9));
	}

}
