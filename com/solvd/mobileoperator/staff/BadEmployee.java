package com.solvd.mobileoperator.staff;

public class BadEmployee implements Staff , BadTrainee {

	public int API = 6;
	public double PI = 6.14;
	private int age; 
	private String sex; 
	private String status = "bad_employee"; 
	
	public BadEmployee() {
		
	} 
	
	public BadEmployee(int age, String sex) {
			this.age = age;
			this.sex = sex;
	} 

	@Override
	public void aquire() {
		System.out.println("I cannot aquire new skills!");
	}
	
	@Override
	public int showAge() {
		return 10;
	}
	
	@Override
	public String showSex() {
		return "bla-bla-bla";
	}
	
	@Override
	public void printInfoAgain(int age, String sex) {
		System.out.println(age);
		System.out.println(sex);
	}
	
	@Override
	public int showAgeAgain(int number) {
		return 10;
	}
	
	@Override
	public String showSexAgain(String operator) {
		return "bla-bla-bla";		
	}
		
	@Override
	public int setApi(int number) {
		this.API = number; 
		return this.API;
	} 
		
	@Override	
	public double setPi(double number) {
		this.PI = number; 
		return this.PI;
	} 
	
	@Override
	public void work() {
		System.out.println("I cannot work 8 hours every day!");
	}
	
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("I cannot work 8 hours every day!");
		System.out.println("I cannot aquire new skills!");
		System.out.println("I can drink coffee or whiskey 8 hours every day at working place!");
	}
	
	@Override
	public void drink() {
		System.out.println("I can drink coffee or whiskey 8 hours every day at working place!");
	}	
	
}