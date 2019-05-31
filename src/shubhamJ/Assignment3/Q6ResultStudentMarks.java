package shubhamJ.Assignment3;

import java.util.Scanner;

public class Q6ResultStudentMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student marks:");
		int marks = sc.nextInt();
		Q6ResultStudentMarks fb = new Q6ResultStudentMarks();
		fb.findResult(marks);

	}

	private void findResult(int marks) {

		if(marks < 50) 
			System.out.println("Failed");
		else if(marks>=50 && marks<75)
			System.out.println("1 Class");
		else if(marks>=75 && marks<=100)
			System.out.println("Distinction");

	}
}
