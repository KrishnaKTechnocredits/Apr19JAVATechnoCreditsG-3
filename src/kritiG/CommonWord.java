package kritiG;
//
//20) find common word from the different strings
//Example:-
//	input:- String str1 = hi someone this is unknown here
//		String str2 = hi unknown
//	output:- repeated word :- hi unknown  

import java.util.Scanner;

public class CommonWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String[] line1 = sc.nextLine().split(" ");
		System.out.println("Enter another sentence ");
		String[] line2 = sc.nextLine().split(" ");
		CommonWord c= new CommonWord();
		c.commonWord(line1, line2);
		sc.close();
	}
	
	void commonWord( String[] one, String[] two)
	{
		String repeat = "";
		for(int i=0; i<one.length; i++)
		{
			for(int j=0; j<two.length; j++)
			{
				if(one[i].equals(two[j]))
						repeat+= one[i] +" ";
				
			}
		}
		System.out.println("Repeated words are : " + repeat);
		
		
		
	}

}
