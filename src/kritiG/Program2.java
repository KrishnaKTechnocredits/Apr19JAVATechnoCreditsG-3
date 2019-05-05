package kritiG;

public class Program2 {
	
	void student(String name, int roll, int marks)
	{
		System.out.println("The details of the student are " + "\n"+ "Name: " + name + "\n" + "Roll number : " + roll +"\n"+
	     "Marks: " +marks);
	}
	
	public static void main(String[] args) {
		Program2 program2 = new Program2();
		program2.student("Kirti", 22, 100);
	}

}
