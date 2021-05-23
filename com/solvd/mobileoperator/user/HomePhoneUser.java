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
	
}