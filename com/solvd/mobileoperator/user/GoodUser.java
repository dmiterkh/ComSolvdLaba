package com.solvd.mobileoperator.user;

public abstract class GoodUser {

	protected int number;
	protected String operator;
	protected boolean isActive = true;

	public GoodUser() {

	}

	public GoodUser(int number, String operator, boolean isActive) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
	}
	
	public abstract void printInfo();
	
	public abstract int showNumber();
	
	public abstract String showOperator();
	
	public abstract boolean showStatus();
	
	public abstract void printInfoAgain(int number, String operator, boolean isActive);
	
	public abstract int showNumberAgain(int number);
	
	public abstract String showOperatorAgain(String operator);
	
	public abstract boolean showStatusAgain(boolean isActive);
	
	public int getNumber() {
		return this.number;
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public boolean getStatus() {
		return this.isActive;
	}

}

