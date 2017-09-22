package com.techelevator;

import java.math.BigDecimal;

public class Change {
	private int numQuarters;
	private int numDimes;
	private int numNickles;
	private LogWriter lw = new LogWriter();
	private VendingMachine vm;
	
	public void change(BigDecimal changeReturned) {
		
		numQuarters = changeReturned.divideToIntegralValue(new BigDecimal("0.25")).intValue();
		changeReturned = changeReturned.remainder(new BigDecimal("0.25"));
		
		numDimes = changeReturned.divideToIntegralValue(new BigDecimal("0.10")).intValue();
		changeReturned = changeReturned.remainder(new BigDecimal("0.10"));
		
		numNickles = changeReturned.divideToIntegralValue(new BigDecimal("0.05")).intValue();
		changeReturned = new BigDecimal("0");
		
		lw.writer("Get change", vm.getBalance(), new BigDecimal("0.00"));
	}
	
	public String toString() {
		return "Your change is " + numQuarters + " quarters " + numDimes + " dimes " + numNickles + " nickles! Congratulation!";
	}

	public int getNumQuarters() {
		return numQuarters;
	}

	public void setNumQuarters(int numQuarters) {
		this.numQuarters = numQuarters;
	}

	public int getNumDimes() {
		return numDimes;
	}

	public void setNumDimes(int numDimes) {
		this.numDimes = numDimes;
	}

	public int getNumNickles() {
		return numNickles;
	}

	public void setNumNickles(int numNickles) {
		this.numNickles = numNickles;
	}
	
}
