package shubhamJ.StringAssignment;

import java.util.Scanner;

public class Q10CharacterOccurringAt {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String string = sc.nextLine();
		System.out.println("Enter Character:");
		String character = sc.next();
		Q10CharacterOccurringAt fb = new Q10CharacterOccurringAt();
		fb.findCharacterOccurringAt(string,character);

	}



private void findCharacterOccurringAt(String string,String ch) {
int cnt=0;
for(int i=0;i<string.length();i++)
{
	if(string.charAt(i)==ch.charAt(0))
	cnt++;
}
	System.out.println("Char is: "+ch+" Number of occurrance= "+cnt);
}
}
