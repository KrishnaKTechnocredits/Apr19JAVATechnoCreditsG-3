package sujayP;

//WAP to print the details of Student as Roll No, Name, Marks by taking input from user.

public class Q2 
{

	void college(int rollNo, String name, int marks )
	   {
		   System.out.println("Student RollNo is = " + rollNo);
		   System.out.println("Student Name is = " + name);
		   System.out.println("Student marks is = " + marks);
		   System.out.println("__________________________________________________________________________________________");
		   
	   }
	   
	   public static void main(String args[])
	   {
		   Q2 q2= new Q2();
		   q2.college(1, "Sujay", 60);
		   q2.college(2, "Mainy", 75);
		   q2.college(3, "Jyoti", 86);
	   }
}
