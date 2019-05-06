package namrataS;

public class Student
{
	
	void display(String name,int rollNum,int marks)
	{
		System.out.println("Student name is : "+ name + " Roll number is : " +rollNum+ " Marks is : " +marks);
	}
	public static void main(String[] args)
	{
		Student s = new Student();
		s.display("Namrata",7,90);
		

	}
}
