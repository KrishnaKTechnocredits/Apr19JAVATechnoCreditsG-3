package kritiG;
//Assignment 2, Pattern Printing 1

// to get output
// [*
//  # #
//  * * *
//  # # # #]

public class PatternPrint1 {
	public static void main(String[] args) {
		new PatternPrint1().pattern1();

	}

	void pattern1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("# ");
				else
					System.out.print("* ");

			}
			System.out.println();
		}

	}

}
