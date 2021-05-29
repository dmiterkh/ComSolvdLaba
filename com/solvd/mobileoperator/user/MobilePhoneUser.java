package com.solvd.mobileoperator.user;

public class MobilePhoneUser extends GoodUser {

	protected int minutes;
	
	public MobilePhoneUser() {

	}

	public MobilePhoneUser(int number, String operator, boolean isActive, int minutes) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		this.minutes = minutes;
	}

	public int getMinutes() {
		return this.minutes;
	}
	
	@Override
	public void printInfo() {
		System.out.println("MobileUser number: " + this.number);
		System.out.println("MobileUser operator: " + this.operator);
		System.out.println("MobileUser isActive: " + this.isActive);
		System.out.println("MobileUser minutes: " + this.minutes);
	}
	
	@Override
	public int showNumber() {
		return this.number;
	}
	
	@Override
	public String showOperator() {
		return this.operator;
	}
	
	@Override
	public boolean showStatus() {
		return this.isActive;
	}
	
	// OverLoading ???
	@Override
	public void printInfoAgain(int number, String operator, boolean isActive /*, int minutes*/) {
		System.out.println("Again MobileUser number: " + number);
		System.out.println("Again MobileUser operator: " + operator);
		System.out.println("Again MobileUser isActive: " + isActive);
//		System.out.println("Again MobileUser minutes: " + minutes);		
	}
	
	@Override
	public int showNumberAgain(int number) {
		this.number = number;
		return this.number;
	}
	
	@Override
	public String showOperatorAgain(String operator) {
		this.operator = operator;
		return this.operator;
	}
	
	@Override
	public boolean showStatusAgain(boolean isActive) {
		this.isActive = isActive;
		return this.isActive;
	}
	
}