package com.solvd.mobileoperator.staff;

public class Employee implements Staff {

	public int API = 21;
	public double PI = 21.14;
	protected int age; 
	protected String sex; 
	private String status = "employee"; 
		
	public Employee() {
		
	} 
	
	public Employee(int age, String sex) {
		this.age = age;
		this.sex = sex;
	} 
	
	@Override
	public void aquire() {
		System.out.println("I can aquire new skills!");
	}
	
	@Override
	public int showAge() {
		return this.age;

	}
	
	@Override
	public String showSex() {
		return this.sex;

	}
	
	@Override
	public void printInfoAgain(int age, String sex) {
		System.out.println(age);
		System.out.println(sex);
	}
	
	@Override
	public int showAgeAgain(int age) {
		this.age = age; 
		return this.age;
	}
	
	@Override
	public String showSexAgain(String sex) {
		this.sex = sex; 
		return this.sex;
	}
	
	@Override
	public int setApi(int number) {
		API = number; 
		return API;
	} 
		
	@Override	
	public double setPi(double number) {
		PI = number; 
		return PI;
	} 
	
	@Override
	public void work() {
		System.out.println("I can work 8 hours every day!");
	}
	
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("I can work 8 hours every day!");
		System.out.println("I can aquire new skills!");
	}	
	
}
