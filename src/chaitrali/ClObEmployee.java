package chaitrali;

import java.util.Scanner;

public class ClObEmployee {
	
	String empName;
	int deptID;
	double salary;
	
	ClObEmployee(String empName,int deptID,double salary)
	{
		this.empName = empName;
		this.deptID = deptID;
		this.salary = salary;		
	}
	
	public void compareEmpSalary( ClObEmployee emp1, ClObEmployee emp2)
	{
		if (emp1.salary > emp2.salary)
		{
			System.out.println("emp1 salary is greater than emp2: ");
			System.out.println("Employee1 deatils are: " + "\n"+ emp1.empName + "\n" + emp1.deptID +"\n" + emp1.salary);
		}else
		{
			System.out.println("emp2 salary is greater than emp1: ");
			System.out.println("Employee2 deatils are: " + "\n"+ emp2.empName + "\n" + emp2.deptID +"\n" + emp2.salary);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee1 details: ");
		String emp1[] = sc.nextLine().split(" ");
		String empName = emp1[0];
		int deptID = Integer.parseInt(emp1[1]);
		double salary = Double.parseDouble(emp1[2]);
		
		ClObEmployee e1 = new ClObEmployee(empName,deptID,salary);
		
		System.out.println("Enter Employee2 details: ");
		String emp2[] = sc.nextLine().split(" ");
		String empName2 = emp2[0];
		int deptID2 = Integer.parseInt(emp2[1]);
		double salary2 = Double.parseDouble(emp2[2]);
		
		ClObEmployee e2 = new ClObEmployee(empName2,deptID2,salary2);
		
		e2.compareEmpSalary(e1, e2);
		sc.close();
		
	}

}
