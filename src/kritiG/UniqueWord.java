package kritiG;

import java.util.Scanner;

public class UniqueWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String[] line1 = sc.nextLine().split(" ");
		System.out.println("Enter another sentence ");
		String[] line2 = sc.nextLine().split(" ");
		UniqueWord u = new UniqueWord();
		u.uniqueWord(line1, line2);
		sc.close();
	}
	
	void uniqueWord( String[] one, String[] two)
	{
		String unique = "";
		
		for(int i=0; i<one.length; i++)
		{
			boolean flag = true;
			for(int j=0; j<two.length; j++)
			{
				if(one[i].equals(two[j]))
					flag= false;
					
			}
			if( flag== true)
			{
				unique+= one[i]+ " ";
			}
			
		}
		System.out.println("Unique words are : " + unique);
		
		
		
	}

}
