package sonalL;

public class Pattern4 {
	
	void forLoop8(int num) {
		for (int i = 1; i <= num * 2 - 1; i++) {
			if (i <= num) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			} else if (i > num) {
				for (int j = 1; j <= num * 2 - i; j++) {
					System.out.print(j);

				}
				System.out.println();

			}
		}
	}


	public static void main(String[] args) {
		
		Pattern4 p1 = new Pattern4();
		p1.forLoop8(4);
		
	}

}
