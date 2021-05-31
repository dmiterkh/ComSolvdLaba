package com.solvd.mobileoperator.user;

public class HomeInternetUser extends HomePhoneUser {

	private int homeBonus;
	
	public HomeInternetUser() {

	}

	public HomeInternetUser(int number, String operator, boolean isActive, int homeBonus) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		this.homeBonus = homeBonus;
	}

	public int getHomeBonus() {
		return this.homeBonus;
	}
	
	public void printInfo() {
		System.out.println("HomeInternetUser number: " +  this.number);
		System.out.println("HomeInternetUser operator: " + this.operator);
		System.out.println("HomeInternetUser isActive: " + this.isActive);
		System.out.println("HomeInternetUser homeBonus: " + this.homeBonus);
	}
	
	
	@Override
	public void showHomeBonus() {
		System.out.println("     HomeInternetUser homeBonus: " + this.homeBonus);
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

	// OverLoading	
	@Override
	public void printInfo(int number, String operator, boolean isActive) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		System.out.println("Again HomeInternetUser number: " + this.number);
		System.out.println("Again HomeInternetUser operator: " + this.operator);
		System.out.println("Again HomeInternetUser isActive: " + this.isActive);
	}
	
	// OverLoading	
	@Override
	public int showNumber(int number) {
		this.number = number;
		return this.number;
	}
	
	// OverLoading	
	@Override
	public String showOperator(String operator) {
		this.operator = operator;
		return this.operator;
	}
	
	// OverLoading	
	@Override
	public boolean showStatus(boolean isActive) {
		this.isActive = isActive;
		return this.isActive;
	}
	
}
