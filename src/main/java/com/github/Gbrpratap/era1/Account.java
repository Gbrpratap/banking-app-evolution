package com.github.Gbrpratap.era1;


public class Account {
	
	private int accountId;
	private int userId;
	private String accountType;
	private double balance;
	
	public Account(int accountId, int userId, String accountType, double balance) {
		this.accountId = accountId;
		this.userId = userId;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("Deposited: " + amount);
		}else {
			System.out.println("Invalid deposite amount!");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			this.balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}else {
			System.out.println("Insufficient funds or invalid amount!");
		}
	}

}

