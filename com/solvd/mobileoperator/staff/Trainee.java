package com.solvd.mobileoperator.staff;

public interface Trainee {

	public void aquire();	
	
	public void printInfo();
	
	public int showAge();
	
	public String showSex();
	
	public String showStatus();
	
	public void setInfoAgain(int age, String sex, int salary, String status);
	
	public double showSalaryMaximum(int age, int salary, String status);
	
	public void printInfoAgain(int age, String sex);
	
	public void showStatusAgain(String status);
	
	public int showAgeAgain(int age);
		
	public String showSexAgain(String sex);
		
}
