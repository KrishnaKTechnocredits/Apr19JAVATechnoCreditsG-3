package chaitrali;

import java.util.Scanner;

public class BankClient extends Bank {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter account no, name and amount: ");
		String[] line = sc.nextLine().split(",");		
		
		int account_no = Integer.parseInt(line[0]);
		String account_name = line[1];
		double amount = Double.parseDouble(line[2]);
	
		Bank obj = new BankClient();
		
		System.out.println("Enter operation to be performed: insertData, deposit, withdrawl, checkBalance,displayDetails: ");
		String operation = sc.next();
		
		switch(operation){
		case "insertData":
			obj.insertData(account_no, account_name, amount);
			break;
		case "deposit":
			obj.deposit(obj.amount);
			break;
		case "withdrawl":
			obj.withdrawl();
			break;
		case "checkBalance":
			obj.checkBalance();
			break;
		case "displayDetails":
			obj.displayDetails();
			break;
		default:
			break;
		
		}
		sc.close();
				
	}
	

}
