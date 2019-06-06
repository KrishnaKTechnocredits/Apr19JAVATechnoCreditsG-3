package kritiG;
//2. Create Bank class with fields account_no, name and amount .Create the following methods: Make 

//it menu Driven Program using switch. 
//Use Scanner class for taking inputs from User 
//a) insertData()... [To save account_no, name and amount given by user]. 
//b) deposit() 
//c) withdraw() 
//d) checkBalance() 
//e) displayDetails() 
//Create BankClient class to test functionalities of Bank class.

import java.util.Scanner;

public class Bank {

	private static float bal = 0;
	private int debitCount = 0;
	private int crediCount = 0;
	private float debitbal = 0;
	private float creditbal = 0;
	private int accNum;
	private String name;
	private float initialBal;

	void bankMethods(String operation) {
		Scanner sc = new Scanner(System.in);

		switch (operation) {
		case "insertData":
			System.out.println("Enter account number : ");
			accNum = sc.nextInt();
			System.out.println(" Enter name :");
			name = sc.next();
			System.out.println("Enter initial amount in the bank : ");
			initialBal = sc.nextFloat();
			bal = initialBal;
			break;

		case "deposit":
			System.out.println("Enter the amount to be credited: ");
			creditbal = sc.nextFloat();
			bal += creditbal;
			crediCount++;
			break;

		case "withdrawal":
			System.out.println("Enter the amount to be debited: ");
			debitbal = sc.nextFloat();
			if (bal > debitbal){
				bal -= debitbal;
				debitCount++;
			}
			else
				System.out.println("Insufficient funds");
			
			break;

		case "checkBalance":
			System.out.println(" The current balance is : " + bal);
			break;

		case "displayDetails":
			System.out.println("Name : " + name);
			System.out.println("Account number : " + accNum);
			System.out.println("Initial balance in the bank : Rs." + initialBal);
			System.out.println("Number of debits : " + debitCount);
			System.out.println("Total amount debited : Rs." + debitbal);
			System.out.println("Number of credits : " + crediCount);
			System.out.println("Total amount credited : Rs." + creditbal);
			System.out.println("Current balance is :  Rs." + bal);
			break;

		case "exit":
			System.out.println("Thank you");
			break;
			
		default:
				System.out.println("Invalid operation");
			
		}
		
	}

}
