package kritiG;
//WAP to character occurring in user defined String and Character 
import java.util.Scanner;

public class String10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence in small case: ");
		String name1 = sc.nextLine();
		System.out.println("Enter the char to check its frequency: ");
		String charac = sc.nextLine();
		char ch = charac.charAt(0);
		
		// char character = char()

		freq(name1, ch);
		sc.close();

	}

	static void freq(String name, char ch) {

		int len = name.length();
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (name.charAt(i) == ch) {
				count++;
			}

		}

		System.out.println("The frequency of character is " + count);

	}
}
