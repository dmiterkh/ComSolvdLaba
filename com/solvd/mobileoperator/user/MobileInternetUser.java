package com.solvd.mobileoperator.user;

public class MobileInternetUser extends MobilePhoneUser {

	private int bytes;
	
	public MobileInternetUser() {

	}

	public MobileInternetUser(int number, String operator, boolean isActive, int minutes, int bytes) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		this.minutes = minutes;
		this.bytes = bytes;	
	}
	
	public int getBytes() {
		return this.bytes;
	}

	@Override
	public void printInfo() {
		System.out.println("MobileInternetUser number: " + getNumber());
		System.out.println("MobileInternetUser operator: " + getOperator());
		System.out.println("MobileInternetUser isActive: " + getStatus());
		System.out.println("MobileInternetUser minutes: " + getMinutes());
		System.out.println("MobileInternetUser bytes: " + getBytes());
	}
	
	// OverLoading	
	@Override
	public void printInfo(int number, String operator, boolean isActive) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		System.out.println("Again MobileUser number: " + this.number);
		System.out.println("Again MobileUser operator: " + this.operator);
		System.out.println("Again MobileUser isActive: " + this.isActive);
	}
	
	// OverLoading
	@Override
	public int showNumber(int number) {
		this.number = number;
		return number;
	}
	
	// OverLoading	
	@Override
	public String showOperator(String operator) {
		this.operator = operator;
		return operator;
	}
	
	// OverLoading	
	@Override
	public boolean showStatus(boolean isActive) {
		this.isActive = isActive;
		return isActive;
	}

}
