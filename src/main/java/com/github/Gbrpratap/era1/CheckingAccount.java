package com.github.Gbrpratap.era1;

public class CheckingAccount extends Account{
	
	private double withdrawalFee = 10.0; //withdrawa fee 10 rupees is fixed for now later we will add % rate

	public CheckingAccount(int accountId, int userId, double balance, double interestRate) {
		super(accountId, userId, "Checking", balance);
	}
	
	/* complete override of methods and the code is large
	@Override
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount > getBalance()) {
			double needs = (amount + withdrawalFee) - getBalance();
			throw new InsufficientFundsException(needs);
		}
		double currentBalance = getBalance();
		double feeIncludedAmount = amount + withdrawalFee;
		currentBalance -=  feeIncludedAmount;
		System.out.println(amount + " Withdrawal successful. New balance: " + currentBalance + 
				" Withdrawal fee charged: " + withdrawalFee);
	}
	*/
	
	//same function code but borrowing method from parent class and adding my extra logic
	@Override
	public void withdraw(double amount) throws InsufficientFundsException{
		double total = amount + withdrawalFee;
		super.withdraw(total);
		System.out.println("Fee of 10 was applied");
	}
	
	
	
	
	
	
}
