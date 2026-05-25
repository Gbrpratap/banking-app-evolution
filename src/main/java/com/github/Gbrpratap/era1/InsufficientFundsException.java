package com.github.Gbrpratap.era1;

public class InsufficientFundsException extends Exception {
	private double shortfall;
	
	public InsufficientFundsException(double shortfall) {
		super("Sorry, you are short by: RS. " + shortfall);
		this.shortfall = shortfall;
	}

}
