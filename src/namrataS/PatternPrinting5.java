package namrataS;

public class PatternPrinting5 {

	void ex1() 
	{
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 2; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrinting5 l = new PatternPrinting5();
		l.ex1();

	}

}
