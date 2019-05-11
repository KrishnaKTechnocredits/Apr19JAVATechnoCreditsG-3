package kritiG;
//Assignment 2, Pattern Printing 5

//to get output
//[1
// 1 2
// 1 2 3
// 1 2 
// 1]

public class PatternPrint5 {

	public static void main(String[] args) {
		new PatternPrint5().pattern5();

	}

	void pattern5() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 2; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
