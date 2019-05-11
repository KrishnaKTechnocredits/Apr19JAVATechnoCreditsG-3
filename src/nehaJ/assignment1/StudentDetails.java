package nehaJ.assignment1;

//Interactive program to print the details of Student As Roll No, Name and Marks
public class StudentDetails {
	public static void main(String[] args) {

		StudentDetails student = new StudentDetails();
		student.displayStudentDetails(123, "Neha Joshi", 87);

	}

	// Display student details Roll Number, Name and Marks
	void displayStudentDetails(int rNo, String name, int marks) {
		System.out.println(
				"\nDear Student, Your details are:\nName:" + name + "\nRoll Number:" + rNo + "\nMarks:" + marks);
	}

}
