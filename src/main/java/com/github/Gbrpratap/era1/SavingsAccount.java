package com.github.Gbrpratap.era1;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(int accountId, int userId, double balance, double interestRate) {
		super(accountId, userId, "SAVINGS", balance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interest = getBalance() * (interestRate/100);
		deposit(interest);
		System.out.println("Interest added: " + interest);
	}
}
