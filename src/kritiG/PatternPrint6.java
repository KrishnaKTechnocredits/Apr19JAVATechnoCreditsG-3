package kritiG;
//Assignment 2, Pattern Printing 6

//to get output
//[3 6 9
// 12 15 18
// 21 24 27]

public class PatternPrint6 {
	public static void main(String[] args) {
		new PatternPrint6().pattern6();

	}

	void pattern6() {
		for (int i = 1; i <= 9;i= i+3) {
			for (int j = i; j < i+3 ; j++) {
				System.out.print(3 * j + " ");

			}
			System.out.println();
		}

	}

}
