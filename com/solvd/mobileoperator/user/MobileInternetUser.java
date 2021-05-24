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
	
	@Override
	public void printInfoAgain(int number, String operator, boolean isActive) {
		System.out.println("Again MobileInternetUser number: " + number);
		System.out.println("Again MobileInternetUser operator: " + operator);
		System.out.println("Again MobileInternetUser isActive: " + isActive);
	}
	
}
