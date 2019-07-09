package kritiG;
//Create BankClient class to test functionalities of Bank class.

import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (count == 0) {
			System.out.println("Enter the operation you want to perform:(Always insert data first and only once: insertData / deposit / withdrawal / checkBalance /displayDetails/ exit");
			String operation = sc.next();
			bank.bankMethods(operation);
			if (operation.equals("exit"))
				count++;
			
		
			
		}
		

	}

}
