package nehaJ.patternAssignment;

public class Pattern4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i % 2 == 0) {
					if (j == 2)
						System.out.print("2");
					else if (j == 4)
						System.out.print("4");
					else
						System.out.print("*");
				} else {
					if (j == 1)
						System.out.print("1");
					else if (j == 3)
						System.out.print("3");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
