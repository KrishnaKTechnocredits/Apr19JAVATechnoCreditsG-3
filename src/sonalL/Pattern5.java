package sonalL;

public class Pattern5 {
	
	static void forLoop7() {
		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		forLoop7();

	}

}
