package com.solvd.mobileoperator.user;

public abstract class HomePhoneUser extends GoodUser {

	public HomePhoneUser() {

	}

	public HomePhoneUser(int number, String operator, boolean isActive) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
	}
	
	public abstract void showHomeBonus();
	
	@Override
	public void printInfo() {
		System.out.println("HomeInternetUser number:  " +  this.number);
		System.out.println("HomeInternetUser operator:  " + this.operator);
		System.out.println("HomeInternetUser isActive:  " + this.isActive);
	}
	
}