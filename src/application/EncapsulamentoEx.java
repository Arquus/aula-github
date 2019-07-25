package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class EncapsulamentoEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		Account account;
		
		try {
			System.out.print("Enter account number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter acount holer: ");
			String holder = sc.nextLine();
			System.out.print("Is there an initial depositi (y/n)? ");
			char response = sc.next().charAt(0);
			if (response == 'y') {
				System.out.print("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, holder, initialDeposit);
			} else {
				account = new Account(number, holder);
			}
			
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(account);
			
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();
			account.deposit(depositValue);
			System.out.println("Updated account data: ");
			System.out.println(account);
			
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double withdrawValue = sc.nextDouble();
			account.withdraw(withdrawValue);
			System.out.println("Updated account data: ");
			System.out.println(account);
			
		} finally {
			sc.close();
		}

	}

}
