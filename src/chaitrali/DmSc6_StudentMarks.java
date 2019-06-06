package chaitrali;

import java.util.Scanner;

public class DmSc6_StudentMarks {

	public void DisplayGrade(int marks)
	{
		if(marks > 0 & marks <50)
		{
			System.out.println("Failed");
		}else if(marks >= 50 & marks <75){
			System.out.println("1st Class");
		}else if(marks >= 75 & marks <=100){
			System.out.println("Distinction");
		}else
			System.out.println("Invalid input");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks between 0 to 100:");
		int marks = sc.nextInt();
		
		DmSc6_StudentMarks student = new DmSc6_StudentMarks();
		student.DisplayGrade(marks);
		sc.close();
	}

}
