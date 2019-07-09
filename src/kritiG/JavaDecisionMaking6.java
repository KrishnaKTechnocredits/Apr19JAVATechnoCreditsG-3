package kritiG;
//WAP to input student marks by condition : 
//Marks is greater than 0 and less than 50--FAIILED 
//Marks is greater than 50 and less than 75--1st Class 
//Marks greater than 75 –and less than 100 Distinction 

import java.util.Scanner;

public class JavaDecisionMaking6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting marks
		System.out.println("Enter Student marks ");
		String[] x = sc.nextLine().split(" ");
		int[] marks =  new int[x.length];
		
		for( int i= 0; i< marks.length; i++)
		{
			marks[i]= Integer.parseInt(x[i]);
		}		

		JavaDecisionMaking6 j = new JavaDecisionMaking6();
		j.marks(marks);
		
		sc.close();
	}
	
	void marks(int[] marks)
	{
		for ( int i =0; i< marks.length; i++)
		{
			if(marks[i]>0 && marks[i]<=50)
					System.out.println("Marks are " +  marks[i] + " : FAILED");
			if(marks[i]>50 && marks[i]<=75)
					System.out.println("Marks are " +  marks[i] + " : FIRST CLASS");
			if(marks[i]>75 && marks[i]<=100)
					System.out.println("Marks are " +  marks[i] + " : DISTINCTION");
		}
		
	}

}
