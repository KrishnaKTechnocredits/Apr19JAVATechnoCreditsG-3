package kritiG;
//Assignment 2, Pattern Printing 2

//to get output
//[# * # *
// * # * #
// # * # *
// * # * #]

public class PatternPrint2 {
	public static void main(String[] args) {
		new PatternPrint2().pattern2();

	}

	void pattern2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0)
						System.out.print("# ");
					else
						System.out.print("* ");
				} else {
					if (j % 2 == 0)
						System.out.print("* ");
					else
						System.out.print("# ");
				}

			}
			System.out.println();
		}
		
	}	

}
