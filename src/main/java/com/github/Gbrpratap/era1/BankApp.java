package com.github.Gbrpratap.era1;

public class BankApp {

	public static void main(String[] args) {
		/*
		 * in the below three line of commented code the first line creates "gbr" object of account class, the constructor creates account object with 4 arguments
		 * the 2nd line creates "accDao" object of AccountDAO class
		 * before running the 3rd line I created user-1 manually in mySQL because user-id is foreign key in accounts table 
		 * (int accountId, int userId, String accountType, double balance)
		 * Note: the passing of 1 in accountId can be confusting as accountID is auto-generated, also I have pasted the SQL query of table creation in the readme file
		 */
	/*
		Account gbr = new Account(1, 1, "savings", 0.0);
		AccountDAO accDao = new AccountDAO();
		accDao.saveAccount(gbr);
	*/
		
		/* the below code creates "mySavings" object of class SavingsAccount with 4 arguments so I am adding 1000 balance and 5% interest
		 * but the question is that I don't have accountId 2 in mySQL account table and it is indirectly adding 1000 balance so is there any flaw?
		 * Yes as the 2 in the accountId will be ignored as it is auto-incrementing so it is a stale data, also you will notice it is indireclty adding
		 * 1000.0 balance to the account.
		 * 
		 * The below code might show successful message in console that 50.0 is added but in mySQL it won't be updated because it only added to the computers
		 * RAM
		 */
//		SavingsAccount mySavings = new SavingsAccount(2, 1, 1000.0, 5.0);
//		mySavings.addInterest();
		
		/*
		 * The below code created new savings account where accountId argument is ignored and after doing changes in the accountDAO
		 * like adding interest argument I am method overloading so we can choose between regular account addition and with interest account addition
		 */
		/*
		SavingsAccount mySavings = new SavingsAccount(2, 1, 1000.0, 5.0);
		mySavings.addInterest();
		
		AccountDAO accDao = new AccountDAO();
		accDao.saveAccount(mySavings);
		*/
		
		
		
	}

}
