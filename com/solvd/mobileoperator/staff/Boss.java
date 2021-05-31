package com.solvd.mobileoperator.staff;

public class Boss extends Employee {

	private String status = "boss";
	private String power = "power";
	
	public Boss() {
		
	} 
	
	public Boss(int age, String sex) {
			this.age = age;
			this.sex = sex;
	} 
	
	@Override
	public void aquire() {
		System.out.println("I can aquire a lot of new skills!");
	}
	
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I have got_ "  + this.power);
		System.out.println("I can work 16 hours every day!");
		System.out.println("I can aquire a lot of skills!");
		System.out.println("I can hire people!");
		System.out.println("I can fire out people!");
	}
	
	// Overload ???
	public void printInfo(int age, String sex, int salary, String status, String power) {
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.status = status;
		this.power = power;
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I have got_ "  + this.power);
		System.out.println("I can work 16 hours every day!");
		System.out.println("I can aquire a lot of skills!");
		System.out.println("I can hire people!");
		System.out.println("I can fire out people!");
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
	
	@Override
	public void setInfoAgain(int age, String sex, int salary, String status /*, String power*/) {
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.status = status;
/*	this.power = power;
*/
	}	
	
	@Override
	public double showSalaryMaximum(int age, int salary, String status /*, String power*/) {
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
		
		if (this.power == "weak power") {
			coefficient+=0.1;
		} else if (this.power == "medium power") {
			coefficient+=0.2;
		} else if (this.power == "god power") {
			coefficient+=0.5;
		} 
		
		salaryMaximum = coefficient*salary;
		return salaryMaximum;
	}
	
	//OverLoading
	public void printInfo(int age, String sex) {
		System.out.println(salary);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(power);
	}
		
	//OverLoading
	public void showStatus(String status) {
		this.status = status;
		System.out.println(status);
	}
	
	//OverLoading
	public int showAge(int age) {
		this.age = age; 
		return this.age;
	}
		
	//OverLoading
	public String showSex(String sex) {
		this.sex = sex; 
		return this.sex;
	}
		
	@Override
	public void work() {
		System.out.println("I can work 16 hours every day!");
		
	}
	
	//new method
	public void hirePeople() {
		System.out.println("I can hire people!");
	}
	
	//new method
	public void firePeople() {
		System.out.println("I can fire out people!");
	}
	
}
