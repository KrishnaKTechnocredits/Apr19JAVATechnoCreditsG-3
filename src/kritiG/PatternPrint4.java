package kritiG;
//Assignment 2, Pattern Printing 4

//to get output
//[1 * 3 *
// * 2 * 4
// 1 * 3 *
// * 2 * 4]

public class PatternPrint4 {
	public static void main(String[] args) {
		new PatternPrint4().pattern4();

	}

	void pattern4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0)
						System.out.print(j + " ");
					else
						System.out.print("* ");
				} else {
					if (j % 2 == 0)
						System.out.print("* ");
					else
						System.out.print(j + " ");
				}

			}
			System.out.println();
		}

	}

}
