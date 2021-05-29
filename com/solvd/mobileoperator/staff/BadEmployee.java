package com.solvd.mobileoperator.staff;

public class BadEmployee implements Staff , BadTrainee {

	private int salary;
	private int age; 
	private String sex; 
	private String status = "bad employee"; 
	
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
	
	// Overloading ???
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I cannot work 8 hours every day!");
		System.out.println("I cannot aquire new skills!");
		System.out.println("I can drink coffee or whiskey 8 hours every day at working place!");
	}
	
	// Overload ???
	public void printInfo(int age, String sex, int salary, String status) {
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.status = status;
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I can work 8 hours every day!");
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
	public String showStatus() {
			return this.status;
	}
		
	// Overloading ???
	@Override
	public void setInfoAgain(int age, String sex, int salary, String status) {
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.status = status;
	}
	
	// Overloading ???
	@Override
	public double showSalaryMaximum(int age, int salary, String status) {
		double salaryMaximum;
		double coefficient = 1;
		
		if (age < 30) {
			coefficient+=0.2;
		} else if (age < 50) {
			coefficient+=0.3;
		} else {
			coefficient+=0.1;
		}
		
		if (status == "expirienced applicant") {
			coefficient+=0.2;
		} else if (status == "employee") {
			coefficient+=0.3;
		} else if (status == "boss") {
			coefficient+=0.4;
		} else if (status == "bad employee") {
			coefficient+=0.1;
		}
		
		salaryMaximum = coefficient*salary;
		return salaryMaximum;
	}
	
	// Overloading
	@Override
	public void printInfoAgain(int age, String sex) {
		System.out.println(age);
		System.out.println(sex);
	}
	
	// Overloading
	@Override
	public void showStatusAgain(String status) {
		this.status = status;
		System.out.println(status);
	}
	
	@Override
	public int showAgeAgain(int age) {
		this.age = age;
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
	
	@Override
	public void drink() {
		System.out.println("I can drink coffee or whiskey 8 hours every day at working place!");
	}	
	
}