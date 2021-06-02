package com.solvd.mobileoperator.staff;

public class ExpiriencedApplicant extends Unemployed implements Staff {
	
	protected int salary;
	protected int age; 
	protected String sex; 
	private String status = "expirienced applicant"; 
		
	public ExpiriencedApplicant() {
		
	} 
	
	public ExpiriencedApplicant(int age, String sex) {
		this.age = age;
		this.sex = sex;
	} 

	// Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I can work 8 hours every day!");
		System.out.println("I can aquire new skills!");
	}
	
	// Overloading
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
	
	@Override
	public void setInfoAgain(int age, String sex, int salary, String status) {
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.status = status;
	}	
	
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
	
	//OverLoading
	public void printInfo(int age, String sex) {
		System.out.println(age);
		System.out.println(sex);
	}
	
	//OverLoading
	public int showAge(int age) {
		return age;
	}
	
	//OverLoading
	public String showSex(String sex) {
		return sex;
	}
	
	//OverLoading
	public String showStatus(String status) {;
		return status;
	} 
	
	@Override
	public String aquire() {
		return "I can aquire new skills!";
	}
	
	@Override
	public String work() {
		return"I can work 8 hours every day!";
	}
	
	@Override
	public String lookForJob() {
		return"I'm looking for job!";
	}
	
	@Override
	public String toString() {
		return "I am a(an)_ "  + this.status + "\n" + 
			   "I am_  " + this.age + "  _years old" + "\n" + 
			   "My sex is_ " + this.sex + "\n" + 
			   "My salary is_ " + this.salary + "\n" + 
			   this.aquire() + "\n" + 
			   this.work() + "\n" +
			   this.lookForJob();
	}
	
	@Override
	public void setSex(String sex) {
		this.sex = sex;	
	}
	
}
