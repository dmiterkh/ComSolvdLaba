package com.solvd.mobileoperator.executor;

import com.solvd.mobileoperator.point.InternetMarket;         // Set, Get, Extension:  
import com.solvd.mobileoperator.point.Market;         
import com.solvd.mobileoperator.point.Office;         
import com.solvd.mobileoperator.point.MarketPlace;    	

import com.solvd.mobileoperator.staff.Employee;               // Initial Interface Trainee, Extension, Implementation: 
import com.solvd.mobileoperator.staff.Boss;         		 
import com.solvd.mobileoperator.staff.BadEmployee;           
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;   // Class ExpiriencedApplicant extends Abstract Class Unemployed and implements Interface Staff

import com.solvd.mobileoperator.user.NoMoneyUser;             // Initial Abstract Class BadUser; 
import com.solvd.mobileoperator.user.NoConnectionUser;   
import com.solvd.mobileoperator.user.MobilePhoneUser;         // Initial Abstract Class GoodUser; 
import com.solvd.mobileoperator.user.MobileInternetUser; 
import com.solvd.mobileoperator.user.HomeInternetUser;    

import com.solvd.mobileoperator.storage.Colleague;            // Polymorphizm: Interface Staff 
import com.solvd.mobileoperator.storage.ColleagueAr;
import com.solvd.mobileoperator.storage.ColleagueLi;
import com.solvd.mobileoperator.storage.ColleagueHS;
import com.solvd.mobileoperator.storage.ColleagueHM;

import com.solvd.mobileoperator.storage.ActiveUser;           // Polymorphizm: Abstract Class GoodUser
import com.solvd.mobileoperator.storage.ActiveUserAr;
import com.solvd.mobileoperator.storage.ActiveUserLi;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import com.solvd.mobileoperator.staff.Staff; 
import com.solvd.mobileoperator.user.GoodUser; 
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Menu {
	
	public Menu() {

	}	 
	
	public void initData() {
		
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		Boss boss1 = new Boss(76, "F"); 
		boss1.setInfoAgain(46, "FF", 3000, "boss");
		Boss boss2 = new Boss(77, "M"); 		
		Boss boss3 = new Boss(75, "F"); 
		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender");
		expiriencedApplicant1.setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M");
		ExpiriencedApplicant expiriencedApplicant3 = new ExpiriencedApplicant(44, "M");
		
		int employeeIndex = 0;
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
	}
		
	
	
	public void showArrayListOperations() {		
			
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		Boss boss1 = new Boss(76, "F"); 
		boss1.setInfoAgain(46, "FF", 3000, "boss");
		Boss boss2 = new Boss(77, "M"); 		
		Boss boss3 = new Boss(75, "F"); 
		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender");
		expiriencedApplicant1.setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M");
		ExpiriencedApplicant expiriencedApplicant3 = new ExpiriencedApplicant(44, "M");
		
		int employeeIndex = 0;
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	

//		initData();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_1_ArrayList_Colleague================================");	
		ColleagueAr colleagueAr1 = new ColleagueAr();
		
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
			badEmployeeIndex = in.nextInt();
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
		do {	
			System.out.println("Enter the number of Bosses from 1 to 3");
			bossIndex = in.nextInt();
		} while((bossIndex != 1)&&(bossIndex != 2)&&(bossIndex != 3));		
		do {	
			System.out.println("Enter the number of Expirienced Applicants from 1 to 3");
			expiriencedApplicantIndex = in.nextInt();
		} while((expiriencedApplicantIndex != 1)&&(expiriencedApplicantIndex != 2)&&(expiriencedApplicantIndex != 3));					
		in.nextLine();
		
		switch (employeeIndex){
		case 1:
			colleagueAr1.setListOfStaff(employee1);
			break;
		case 2:
			colleagueAr1.setListOfStaff(employee1);
			colleagueAr1.setListOfStaff(employee2);
			break;
		case 3:
			colleagueAr1.setListOfStaff(employee1);
			colleagueAr1.setListOfStaff(employee2);
			colleagueAr1.setListOfStaff(employee3);
			break;	
		default:
			break;				
		}
		switch (badEmployeeIndex){
		case 1:
			colleagueAr1.setListOfStaff(badEmployee1);
			break;
		case 2:
			colleagueAr1.setListOfStaff(badEmployee1);
			colleagueAr1.setListOfStaff(badEmployee2);
			break;
		case 3:
			colleagueAr1.setListOfStaff(badEmployee1);
			colleagueAr1.setListOfStaff(badEmployee2);
			colleagueAr1.setListOfStaff(badEmployee3);
			break;	
		default:
			break;				
		}
		switch (bossIndex){
		case 1:
			colleagueAr1.setListOfStaff(boss1);
			break;
		case 2:
			colleagueAr1.setListOfStaff(boss1);
			colleagueAr1.setListOfStaff(boss2);
			break;
		case 3:
			colleagueAr1.setListOfStaff(boss1);
			colleagueAr1.setListOfStaff(boss2);
			colleagueAr1.setListOfStaff(boss3);
			break;	
		default:
			break;				
		}		
		switch (expiriencedApplicantIndex){
		case 1:
			colleagueAr1.setListOfStaff(expiriencedApplicant1);
			break;
		case 2:
			colleagueAr1.setListOfStaff(expiriencedApplicant1);
			colleagueAr1.setListOfStaff(expiriencedApplicant2);
			break;
		case 3:
			colleagueAr1.setListOfStaff(expiriencedApplicant1);
			colleagueAr1.setListOfStaff(expiriencedApplicant2);
			colleagueAr1.setListOfStaff(expiriencedApplicant3);
			break;	
		default:
			break;				
		}
		
		do {
			System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));		
      
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
					System.out.println(colleagueAr1.getListOfStaff().get(i).toString());
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
        	}
 		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
		
		String sexIndex = "";
		int indexSex = 1;
		
		do {
			System.out.println("Would you like to set sex to all of the Employees? (y/n)");
			index = in.nextLine();		
		} while((!("y".equals(index)))&&(!("n".equals(index))));
				
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
					do {
						System.out.println("Sex of " + colleagueAr1.getListOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueAr1.getListOfStaff().get(i).showSex());
						System.out.println("Set sex to " + colleagueAr1.getListOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
						sexIndex = in.nextLine();
					} while((!("f".equals(index)))&&(!("m".equals(index)))&&(!("trans".equals(index))));
					colleagueAr1.getListOfStaff().get(i).setSex(sexIndex);
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
	
		do {
			System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
			index = in.nextLine();
			index = "y";
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					System.out.println(staff.toString());
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}				
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
		System.out.println("THAT'S IT for Scanner_1_ArrayList_Colleague");
		System.out.println("====================================");	
		
	}	
		
	
	
	public void showLinkedListOperations() {		
		
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		
		int employeeIndex = 0;
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_2_LinkedList_Colleague================================");	
		ColleagueLi colleagueLi1 = new ColleagueLi();
	
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
	
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
			badEmployeeIndex = in.nextInt();
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
		in.nextLine();
		
		switch (employeeIndex){
		case 1:
			colleagueLi1.setListOfStaff(employee1);
			break;
		case 2:
			colleagueLi1.setListOfStaff(employee1);
			colleagueLi1.setListOfStaff(employee2);
			break;
		case 3:
			colleagueLi1.setListOfStaff(employee1);
			colleagueLi1.setListOfStaff(employee2);
			colleagueLi1.setListOfStaff(employee3);
			break;	
		default:
			break;				
		}
		switch (badEmployeeIndex){
		case 1:
			colleagueLi1.setListOfStaff(badEmployee1);
			break;
		case 2:
			colleagueLi1.setListOfStaff(badEmployee1);
			colleagueLi1.setListOfStaff(badEmployee2);
			break;
		case 3:
			colleagueLi1.setListOfStaff(badEmployee1);
			colleagueLi1.setListOfStaff(badEmployee2);
			colleagueLi1.setListOfStaff(badEmployee3);
			break;	
		default:
			break;				
		}
	
		do {
			System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));		
  
		if ("y".equals(index)) {
			if ((colleagueLi1 != null)&&(!colleagueLi1.getListOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
					System.out.println(colleagueLi1.getListOfStaff().get(i).toString());
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
    
		String sexIndex = "";
		int indexSex = 1;
	
		do {
			System.out.println("Would you like to set sex to all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
			
		if ("y".equals(index)) {
			if ((colleagueLi1 != null)&&(!colleagueLi1.getListOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
					do {
						System.out.println("Sex of " + colleagueLi1.getListOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueLi1.getListOfStaff().get(i).showSex());
						System.out.println("Set sex to " + colleagueLi1.getListOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
						sexIndex = in.nextLine();
					} while((!("f".equals(index)))&&(!("m".equals(index)))&&(!("trans".equals(index))));
					colleagueLi1.getListOfStaff().get(i).setSex(sexIndex);
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}			
		} else {
			System.out.println("OK, move forward!");
		}
		
		do {
			System.out.println("Would you like to set sex to all of the Colleagues? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
	
		if ("y".equals(index)) {
			if ((colleagueLi1 != null)&&(!colleagueLi1.getListOfStaff().isEmpty())) {	
				for(Staff staff : colleagueLi1.getListOfStaff()) {
					do {
						System.out.println("Sex of " + staff.showStatus() + " " + indexSex + " is " + staff.showSex());
						System.out.println("Set sex to " + staff.showStatus() + " " + indexSex + " (f/m/trans)");
						sexIndex = in.nextLine();
					} while((!("f".equals(index)))&&(!("m".equals(index)))&&(!("trans".equals(index))));
					staff.setSex(sexIndex);
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
    
		do {
			System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((colleagueLi1 != null)&&(!colleagueLi1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueLi1.getListOfStaff()) {
					System.out.println(staff.toString());
					System.out.println("======");
				}	
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
		System.out.println("THAT'S IT for Scanner_2_LinkedList_Colleague");
		System.out.println("====================================");
		
	}	
		
	
	
	public void showHashSetOperations() {	
		
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		
		int employeeIndex = 0;
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_3_HashSet_Colleague================================");	
		
		ColleagueHS colleagueHS1 = new ColleagueHS();
	
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
	
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
			badEmployeeIndex = in.nextInt();
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
		in.nextLine();
		
		switch (employeeIndex){
		case 1:
			colleagueHS1.setSetOfStaff(employee1);
			break;
		case 2:
			colleagueHS1.setSetOfStaff(employee1);
			colleagueHS1.setSetOfStaff(employee2);
			break;
		case 3:
			colleagueHS1.setSetOfStaff(employee1);
			colleagueHS1.setSetOfStaff(employee2);
			colleagueHS1.setSetOfStaff(employee3);
			break;	
		default:
			break;				
		}
		switch (badEmployeeIndex){
		case 1:
			colleagueHS1.setSetOfStaff(badEmployee1);
			break;
		case 2:
			colleagueHS1.setSetOfStaff(badEmployee1);
			colleagueHS1.setSetOfStaff(badEmployee2);
			break;
		case 3:
			colleagueHS1.setSetOfStaff(badEmployee1);
			colleagueHS1.setSetOfStaff(badEmployee2);
			colleagueHS1.setSetOfStaff(badEmployee3);
			break;	
		default:
			break;				
		}
	
		do {
			System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));		
  
		if ("y".equals(index)) {
//			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
//			for(int i = 0; i < employeeIndex; i++) {
//				System.out.println(colleagueAr1.getListOfStaff().get(i).toString());
//				System.out.println("======");
//			}

			if ((colleagueHS1 != null)&&(!colleagueHS1.getSetOfStaff().isEmpty())) {
				System.out.println(colleagueHS1.getSetOfStaff().toString());
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
    
		String sexIndex = "";
		int indexSex = 1;
	
		do {
			System.out.println("Would you like to set sex to all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
			
		if ("y".equals(index)) {
			if ((colleagueHS1 != null)&&(!colleagueHS1.getSetOfStaff().isEmpty())) {
//				for(int i = 0; i < employeeIndex; i++) {
//					System.out.println("Sex of " + colleagueHS1.getSetOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueHS1.getSetOfStaff().get(i).showSex());
//					System.out.println("Set sex to " + colleagueHS1.getSetOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
//					sexIndex = in.nextLine();
//					colleagueHS1.getSetOfStaff().get(i).setSex(sexIndex);
//				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}			
		} else {
			System.out.println("OK, move forward!");
		}
	
		System.out.println("====================================");
    
		do {
			System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((colleagueHS1 != null)&&(!colleagueHS1.getSetOfStaff().isEmpty())) {
				for(Staff staff : colleagueHS1.getSetOfStaff()) {
					System.out.println(staff.toString());
					System.out.println("======");
				}	
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}	
		
		System.out.println("====================================");
		System.out.println("THAT'S IT for 3_HashSet_Colleague");
		System.out.println("====================================");
		
	}	
		
	
	
	public void showHashMapOperations() {
		
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		
		int employeeIndex = 0;
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
				
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_4_HashMap_Colleague================================");	
		
		ColleagueHM colleagueHM1 = new ColleagueHM();
	
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
	
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
			badEmployeeIndex = in.nextInt();
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
		in.nextLine();
		
		switch (employeeIndex){
		case 1:
			colleagueHM1.setMapOfStaff(employee1, employee1.showAge());
			break;
		case 2:
			colleagueHM1.setMapOfStaff(employee1, employee1.showAge());
			colleagueHM1.setMapOfStaff(employee2, employee2.showAge());
			break;
		case 3:
			colleagueHM1.setMapOfStaff(employee1, employee1.showAge());
			colleagueHM1.setMapOfStaff(employee2, employee2.showAge());
			colleagueHM1.setMapOfStaff(employee3, employee3.showAge());
			break;	
		default:
			break;				
		}
		switch (badEmployeeIndex){
		case 1:
			colleagueHM1.setMapOfStaff(badEmployee1, badEmployee1.showAge());
			break;
		case 2:
			colleagueHM1.setMapOfStaff(badEmployee1, badEmployee1.showAge());
			colleagueHM1.setMapOfStaff(badEmployee2, badEmployee2.showAge());
			break;
		case 3:
			colleagueHM1.setMapOfStaff(badEmployee1, badEmployee1.showAge());
			colleagueHM1.setMapOfStaff(badEmployee2, badEmployee2.showAge());
			colleagueHM1.setMapOfStaff(badEmployee3, badEmployee3.showAge());
			break;	
		default:
			break;				
		}
		System.out.println(colleagueHM1.getMapOfStaff().toString());
		System.out.println(colleagueHM1.getMapOfStaff().get(employee1));
		
		
	}
		
	
	
	public void showColletionOperations() {	
		
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		
		int employeeIndex = 0;
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_3_HashSet_Colleague================================");	
		
	}
		
}
		