package shubhamJ;

import java.util.Scanner;

public class BankingSystem {

	static int creditCount = 0;
	static int debitCount = 0;
	static int checkBalanceCount = 0;
	int balance;
	BankingSystem(int balance)
	{
		this.balance=balance;
	}
	
	void bankingSystem()
	{
		boolean continu = true;
		System.out.println("**Welcome to Banking System**");
		System.out.println("Your balance is " + balance);
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("What you want to do: \n 1. Debit - Enter 1 \n 2. Credit - Enter 2 \n 3. Check Balance - Enter 3");
			int userInput = sc.nextInt();
			if(userInput == 1)
			{
				System.out.print("Enter Amount you want to debit : ");
				int debitAmount = sc.nextInt();
				debit(debitAmount);
			}
			else if(userInput == 2 )
			{
				System.out.print("Enter Amount you want to credit : ");
				int creditAmount = sc.nextInt();
				credit(creditAmount);
			}
			else if(userInput == 3)
			{
				checkBalance();
			}
			else
				System.out.println("You entered invalid option.");
			System.out.println("Do you want to continue (Y/N) ");
			String str = sc.next();
			if(str.charAt(0) == 'N' || str.charAt(0) == 'n')
			{
				continu=false;
			}
		}while(continu);
	}
	
	private static void displayTotalCheckBalanceCount() {

		System.out.println("Total Number of Check Balance = "+checkBalanceCount);
	}
	
	private static void displayTotalCreditCount() {

	System.out.println("Total Credit Count is "+creditCount);
		
	}
	
	private static void displayTotalDebitCount() {

		System.out.println("Total Debit Count is "+debitCount);
		
	}
	
	private void checkBalance() {

		System.out.println("Your Balance Amount is "+balance);
		checkBalanceCount+=1;
	}

	private void credit(int creditAmount) {
		
		balance=balance+creditAmount;
		System.out.println("Your Amount is credited successfully");
		creditCount+=1;
	}

	private void debit(int debitAmount) {

		if(balance>=debitAmount && debitAmount!=03
				)
		{
			balance=balance-debitAmount;
			System.out.println("Your Amount is debited successfully");
			debitCount+=1;
		}
		else
		System.out.println("Your balance is not sufficient");
	}

	public static void main(String[] args) {
		
		BankingSystem bs = new BankingSystem(10000);
		bs.bankingSystem();
		displayTotalDebitCount();
		displayTotalCreditCount();
		displayTotalCheckBalanceCount();
	}

}
