package chaitrali;

import java.util.Scanner;

public class Bank {
	
	int account_no;
	String account_name;
	double amount;
	double balance = 0;
	
	
		
	public void insertData(int account_no, String account_name, double amount) {
		 account_no = account_no;
		 account_name = account_name;
		 amount = amount;
		 System.out.println("Details of user are: name: " + account_name + " Acc no.: " + account_no + " Balance: "+ amount);
	}
	
	public void deposit(double amount) {
		
		 balance = balance + amount;
		System.out.println("After deposit balance is: " + balance);
	}
	
	public void withdrawl() {
		if(balance > amount)
		balance = balance - amount;
		System.out.println("After withdrawl balance is: " + balance);
	}
	
	public void checkBalance() {
		
		balance = this.balance;
		System.out.println("Total balance is: " + balance);
	}
	
	public void displayDetails() {
		System.out.println("Account No is: " + account_no);
		System.out.println("Account Name is: " + account_name);
		System.out.println("balance is: " + this.balance);
	}
	
}
