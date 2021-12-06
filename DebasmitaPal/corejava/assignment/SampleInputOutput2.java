package assignment;

import java.util.Scanner;

class Account1 {
	int Deposit(int balance, int amountdeposited) {
		amountdeposited = balance + amountdeposited;
		return amountdeposited;

	}

	int WithDraw(int deposited, int amountwithdrawn) {
		amountwithdrawn = deposited - amountwithdrawn;
		return amountwithdrawn;
	}
}

class SampleInputOutput2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		long accno = sc.nextLong();
		System.out.println("Enter the initial balance");
		int balance = sc.nextInt();
		System.out.println("Enter the amount to be deposited");
		int amountdeposited = sc.nextInt();
		Account1 account = new Account1();
		int deposited = account.Deposit(balance, amountdeposited);
		System.out.println("Available balance is:" + deposited);
		System.out.println("Enter the amount to be withdrawn");
		int amountwithdrawn = sc.nextInt();
		if (amountwithdrawn > deposited) {
			System.out.println("Insufficient balance");
		} else {
			int withdrwan = account.WithDraw(deposited, amountwithdrawn);
			System.out.println("Available balance is:" + withdrwan);
		}

	}

}