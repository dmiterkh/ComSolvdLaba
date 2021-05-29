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
	public void work() {
		System.out.println("I can work 16 hours every day!");
		
	}

	@Override
	public void aquire() {
		System.out.println("I can aquire a lot of new skills!");
	}

	
	@Override
	public String showStatus() {
			return this.status;
	}
	
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I have got_ "  + this.power);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("I can work 16 hours every day!");
		System.out.println("I can aquire a lot of skills!");
		System.out.println("I can hire people!");
		System.out.println("I can fire out people!");
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
