package nehaJ.patternAssignment;

public class Pattern6 {
	// int temp = 0; Avoid using instance variable
	public static void main(String[] args) {
		int temp = 0;
		// Pattern6 obj = new Pattern6();
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				temp = temp + 3;
				System.out.print(temp + " ");

			}
			System.out.println();

		}
	}
}
