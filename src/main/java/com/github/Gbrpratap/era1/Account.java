package com.github.Gbrpratap.era1;


public class Account {
	
	private int accountId;
	private int userId;
	private String accountType;
	private double balance;
	
	/*This constructor with arguments assigns data to the private variables and using get methods we can access the
	 * data present in the database though I can update balance indirectly using deposit and withdrawal but all other cannot
	 * data cannot be updated here, usually accountID and userID in a bank doesn't change but in some banks there might be
	 * option to covert the accountType.
	 */
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
	

	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount > balance) {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
		this.balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}
	
	

}

