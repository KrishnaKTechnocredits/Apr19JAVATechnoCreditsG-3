package kritiG;
//Create Employee class and parameterized constructor with attributes empId , empName and 
//salary. Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality. 


public class Employee {
	
	private int empID;
	private String empName;
	private int sal;
	
	
	Employee(int employeeID, String employeeName, int salary)
	{
		empID= employeeID;
		empName=employeeName;
		sal = salary;
			
	}
	
	void displayDetails()
	{
		System.out.println("Employee name : " + empName);
		System.out.println("Employee ID : " + empID);
		System.out.println("Salary : " + sal);
		
	}

	
}
