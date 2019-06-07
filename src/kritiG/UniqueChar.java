package kritiG;
//18) WAP to find unique character from two different string0
//Example:- 
//	input:- String str1 = “hi buddy, how are you ?”
//		String str2 = “hello sir, good morning”
//	output:- b u w a ? s m

import java.util.Scanner;

public class UniqueChar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String line1 = sc.nextLine();
		System.out.println("Enter another sentence ");
		String line2 = sc.nextLine();
		UniqueChar u = new UniqueChar();
		u.uniquechar(line1, line2);

	}

	void uniquechar(String ones, String two){
		String unique1 = "";
		String unique2 ="";
		String unique ="";
		String one = ones;
		
		for(int i=0;i<one.length();i++)
		{
			if(one.charAt(i)=='*')
					continue;
			int count =0;
			for(int j=0; j< two.length(); j++)
			{
				if(one.charAt(i)==two.charAt(j)){
					count++;
					
				}				
			}
			if(count ==0){
			unique1 += one.charAt(i) +" ";
			one =one.replaceAll((one.charAt(i) +" ").trim(), "*");
			}
		}
		for(int i=0;i<two.length();i++)
		{
			if(two.charAt(i)=='*')
				continue;
			int count =0;
			for(int j=0; j< ones.length(); j++)
			{
				if(two.charAt(i)==ones.charAt(j))
					count++;
			}
			if(count ==0){
			unique2 += two.charAt(i)+ " ";
			two =two.replaceAll((two.charAt(i) +" ").trim(), "*");
			}
		}
		unique = unique1.concat(unique2);
		
		System.out.println("Unique characters in the two strings are: "+ unique);
		
		
	}
}
