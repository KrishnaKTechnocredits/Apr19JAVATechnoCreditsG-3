package namrataS;

import java.util.Scanner;

public class StudentMarksAss6 {
	
	static void m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Print marks of student");
		int marks=sc.nextInt();
		if(marks>0 && marks<50)
			System.out.println("Failed");
		if(marks>50 && marks<75)
			System.out.println("First Class");
		if(marks>75 && marks<100)
			System.out.println("Distinction");
		else
			System.out.println("Great");
		
	}
	public static void main(String[] args) {
		m1();
	}

}
