package chaitrali;

public class Employee{
	

	 int id;
	 String name;
	 double sal;

	Employee(int empid,String empName, double salary)
	{
		this.id = empid;
		this.name = empName;
		this.sal = salary;		
	}
	
	void display()
	{
		 System.out.println("Employee Id     : "+id);
         System.out.println("Employee Name   : "+name);
         System.out.println("Employee Salary : "+sal);
	}
}
