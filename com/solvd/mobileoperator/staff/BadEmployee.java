package com.solvd.mobileoperator.staff;

public class BadEmployee implements Staff , BadTrainee {

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
	public int showAgeAgain(int number) {
		this.age = number;
		return this.age;
	}
	
	@Override
	public String showSexAgain(String sex) {
		this.sex = sex;
		return sex;		
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