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
	
	@Override
	public void printInfo() {
		System.out.println("HomeInternetUser number: " +  this.number);
		System.out.println("HomeInternetUser operator: " + this.operator);
		System.out.println("HomeInternetUser isActive: " + this.isActive);
		System.out.println("HomeInternetUser homeBonus: " + this.homeBonus);
	}
	
	@Override
	public void printInfoAgain(int number, String operator, boolean isActive) {
		System.out.println("Again HomeInternetUser number: " + number);
		System.out.println("Again HomeInternetUser operator: " + operator);
		System.out.println("Again HomeInternetUser isActive: " + isActive);
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
	
	@Override
	public int showNumberAgain(int number) {
		return number;
	}
	
	@Override
	public String showOperatorAgain(String operator) {
		return operator;
	}
	
	@Override
	public boolean showStatusAgain(boolean isActive) {
		return isActive;
	}
}
