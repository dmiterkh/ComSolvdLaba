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
import com.solvd.mobileoperator.storage.ColleagueColl;

import com.solvd.mobileoperator.storage.ActiveUser;           // Polymorphizm: Abstract Class GoodUser
import com.solvd.mobileoperator.storage.ActiveUserAr;
import com.solvd.mobileoperator.storage.ActiveUserLi;

import com.solvd.mobileoperator.comparator.StatusCompare;            // Polymorphizm: Interface Staff 
import com.solvd.mobileoperator.comparator.SexCompare;
import com.solvd.mobileoperator.comparator.AgeCompare;
import com.solvd.mobileoperator.comparator.SalaryCompare;

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
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Menu {
	
	public Menu() {

	}	 
	
//	public void initData() {
//		
//		Scanner in = new Scanner(System.in);
//		String index = "";
//		
//		Employee employee1 = new Employee(25, "F"); 
//		employee1.setInfoAgain(26, "ff", 2000, "employee");
//		Employee employee2 = new Employee(20, "M"); 
//		Employee employee3 = new Employee(27, "F"); 
//		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
//		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
//		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
//		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
//		Boss boss1 = new Boss(76, "F"); 
//		boss1.setInfoAgain(46, "FF", 3000, "boss");
//		Boss boss2 = new Boss(77, "M"); 		
//		Boss boss3 = new Boss(75, "F"); 
//		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender");
//		expiriencedApplicant1.setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
//		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M");
//		ExpiriencedApplicant expiriencedApplicant3 = new ExpiriencedApplicant(44, "M");
//		
//		int employeeIndex = 0;
//		int badEmployeeIndex = 0;
//		int bossIndex = 0;
//		int expiriencedApplicantIndex = 0;	
//	}
		
	
	
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
					} while((!("f".equals(sexIndex)))&&(!("m".equals(sexIndex)))&&(!("trans".equals(sexIndex))));
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
		
//	}
//		
//	
//	
//	public void showArrayListOperations() {				
//		
//		Scanner in = new Scanner(System.in);
//		String index = "";
//		
//		Employee employee1 = new Employee(25, "F"); 
//		employee1.setInfoAgain(26, "ff", 2000, "employee");
//		Employee employee2 = new Employee(20, "M"); 
//		Employee employee3 = new Employee(27, "F"); 
//		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
//		badEmployee1.setInfoAgain(36, "MM", 700, "bad employee");
//		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
//		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
//		
//		int employeeIndex = 0;
//		int badEmployeeIndex = 0;	
		
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
    
		sexIndex = "";
		indexSex = 1;
	
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
					} while((!("f".equals(sexIndex)))&&(!("m".equals(sexIndex)))&&(!("trans".equals(sexIndex))));
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
					} while((!("f".equals(sexIndex)))&&(!("m".equals(sexIndex)))&&(!("trans".equals(sexIndex))));
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
		
		ColleagueHS colleagueHS2 = new ColleagueHS();
		
		colleagueHS2.setSetOfStaff(employee1);
		colleagueHS2.setSetOfStaff(employee2);
		colleagueHS2.setSetOfStaff(employee3);
		colleagueHS2.setSetOfStaff(badEmployee1);
		colleagueHS2.setSetOfStaff(badEmployee2);
		
	
		do {
			System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));		
  
		if ("y".equals(index)) {
			if ((colleagueHS1 != null)&&(!colleagueHS1.getSetOfStaff().isEmpty())) {
//			for(int i = 0; i < employeeIndex; i++) {
//				System.out.println(colleagueAr1.getListOfStaff().get(i).toString());
//				System.out.println("======");
//			}
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
		
		Iterator iterator = colleagueHS1.getSetOfStaff().iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
			System.out.println("======");
//?			System.out.println(iterator.next());
//?			System.out.println("======");
//?			System.out.println(iterator.next().remove());
//?			System.out.println("======");
		}		

		System.out.println(colleagueHS1.getSetOfStaff().equals(colleagueHS2.getSetOfStaff()));
		
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
			colleagueHM1.setMapOfStaff(11, employee1);
			break;
		case 2:
			colleagueHM1.setMapOfStaff(11, employee1);
			colleagueHM1.setMapOfStaff(12, employee2);
			break;
		case 3:
			colleagueHM1.setMapOfStaff(11, employee1);
			colleagueHM1.setMapOfStaff(12, employee2);
			colleagueHM1.setMapOfStaff(13, employee3);
			break;	
		default:
			break;				
		}
		switch (badEmployeeIndex){
		case 1:
			colleagueHM1.setMapOfStaff(21, badEmployee1);
			break;
		case 2:
			colleagueHM1.setMapOfStaff(21, badEmployee1);
			colleagueHM1.setMapOfStaff(22, badEmployee2);
			break;
		case 3:
			colleagueHM1.setMapOfStaff(21, badEmployee1);
			colleagueHM1.setMapOfStaff(22, badEmployee2);
			colleagueHM1.setMapOfStaff(23, badEmployee3);
			break;	
		default:
			break;				
		}
		
		ColleagueHM colleagueHM2 = new ColleagueHM();
		
		colleagueHM2.setMapOfStaff(11, employee1);
		colleagueHM2.setMapOfStaff(12, employee2);
		colleagueHM2.setMapOfStaff(13, employee3);
		colleagueHM2.setMapOfStaff(21, badEmployee1);
		colleagueHM2.setMapOfStaff(22, badEmployee2);
		
		System.out.println(colleagueHM1.getMapOfStaff().toString());
		System.out.println("======");
		System.out.println("==get==");
		System.out.println(colleagueHM1.getMapOfStaff().get(11));
		System.out.println("====================================");

		
//	    ColleagueHM colleagueHM1 = new ColleagueHM();
		Iterator mapIterator = colleagueHM1.getMapOfStaff().entrySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(mapIterator.next());
			System.out.println("======");
//			Map.Entry<Integer, Staff> entry = mapIterator.next();
//		    System.out.println("Key: " + entry.getKey());
//		    System.out.println("Value: " + entry.getValue());
		}	
		
//		Map<String, Integer> map = new HashMap<>();
//		Iterator mapIterator = map.entrySet().iterator();
//		while (mapIterator.hasNext()) {
//		    Map.Entry<String, Integer> entry = mapIterator.next();
//		    System.out.println("Key: " + entry.getKey());
//		    System.out.println("Value: " + entry.getValue());
//		}
		
		
//		System.out.println(colleagueHM1.getMapOfStaff().containsValue(employee1));
//		System.out.println(colleagueHM1.getMapOfStaff().containsKey(11));
//		System.out.println(colleagueHM1.getMapOfStaff().equals(colleagueHM2.getMapOfStaff()));		
//		System.out.println(colleagueHM1.getMapOfStaff().isEmpty());
//		                   colleagueHM1.getMapOfStaff().remove(21, badEmployee1);
//		                   colleagueHM1.getMapOfStaff().replace(22, badEmployee2, badEmployee3);
//		System.out.println(colleagueHM1.getMapOfStaff().size());
//		System.out.println(colleagueHM1.getMapOfStaff().toString());
//		System.out.println(colleagueHM1.getMapOfStaff().get(11));
//		System.out.println("======");
//		System.out.println(colleagueHM1.getMapOfStaff().getClass());		
//		System.out.println(colleagueHM1.getMapOfStaff().keySet());
//		System.out.println(colleagueHM1.getMapOfStaff().values());
//		System.out.println("======");
//						   colleagueHM1.getMapOfStaff().replace(22, badEmployee1);
//		System.out.println(colleagueHM1.getMapOfStaff().toString());
//		System.out.println("======");

		
//		System.out.println(colleagueHM1.getMapOfStaff().entrySet());
//		System.out.println(colleagueHM1.getMapOfStaff().compute(null, null));
//		System.out.println(colleagueHM1.getMapOfStaff().computeIfAbsent(null, null));
//		System.out.println(colleagueHM1.getMapOfStaff().computeIfPresent(null, null));
//		System.out.println(colleagueHM1.getMapOfStaff().getOrDefault(21, badEmployee3));
//		System.out.println(colleagueHM1.getMapOfStaff().merge(null, badEmployee3, null));
//		System.out.println(colleagueHM1.getMapOfStaff().putIfAbsent(null, badEmployee3));
//		System.out.println(colleagueHM1.getMapOfStaff().forEach(null));		
		
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
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_5_Collection_Colleague================================");
		
		
		ColleagueColl colleagueColl1 = new ColleagueColl();
		
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
	
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
			badEmployeeIndex = in.nextInt();
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	

		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			bossIndex = in.nextInt();
		} while((bossIndex != 1)&&(bossIndex != 2)&&(bossIndex != 3));
		
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			expiriencedApplicantIndex = in.nextInt();
		} while((expiriencedApplicantIndex != 1)&&(expiriencedApplicantIndex != 2)&&(expiriencedApplicantIndex != 3));
		in.nextLine();
		
		switch (employeeIndex){
		case 1:
			colleagueColl1.setListOfEmployees(employee1);
			break;
		case 2:
			colleagueColl1.setListOfEmployees(employee1);
			colleagueColl1.setListOfEmployees(employee2);
			break;
		case 3:
			colleagueColl1.setListOfEmployees(employee1);
			colleagueColl1.setListOfEmployees(employee2);
			colleagueColl1.setListOfEmployees(employee3);
			break;	
		default:
			break;				
		}
		switch (badEmployeeIndex){
		case 1:
			colleagueColl1.setListOfBadEmployees(badEmployee1);
			break;
		case 2:
			colleagueColl1.setListOfBadEmployees(badEmployee1);
			colleagueColl1.setListOfBadEmployees(badEmployee2);
			break;
		case 3:
			colleagueColl1.setListOfBadEmployees(badEmployee1);
			colleagueColl1.setListOfBadEmployees(badEmployee2);
			colleagueColl1.setListOfBadEmployees(badEmployee3);
			break;	
		default:
			break;				
		}
		switch (bossIndex){
		case 1:
			colleagueColl1.setSetOfBosses(boss1);
			break;
		case 2:
			colleagueColl1.setSetOfBosses(boss1);
			colleagueColl1.setSetOfBosses(boss2);
			break;
		case 3:
			colleagueColl1.setSetOfBosses(boss1);
			colleagueColl1.setSetOfBosses(boss2);
			colleagueColl1.setSetOfBosses(boss3);
			break;	
		default:
			break;				
		}
		
		switch (expiriencedApplicantIndex){
		case 1:
			colleagueColl1.setMapOfStaff(1, boss1);
			break;
		case 2:
			colleagueColl1.setMapOfStaff(1, boss1);
			colleagueColl1.setMapOfStaff(2, boss2);
			break;
		case 3:
			colleagueColl1.setMapOfStaff(1, boss1);
			colleagueColl1.setMapOfStaff(2, boss2);
			colleagueColl1.setMapOfStaff(3, boss3);
			break;	
		default:
			break;				
		}
		
		
		colleagueColl1.setListOfStaff(employee1);
		colleagueColl1.setListOfStaff(boss1);
		colleagueColl1.setListOfStaff(badEmployee1);
		
		colleagueColl1.setSetOfStaff(employee1);
		colleagueColl1.setSetOfStaff(boss1);
		colleagueColl1.setSetOfStaff(badEmployee1);
		
		colleagueColl1.setMapOfStaff(31, employee1);
		colleagueColl1.setMapOfStaff(32, employee2);
		colleagueColl1.setMapOfStaff(33, employee3);
		colleagueColl1.setMapOfStaff(21, boss1);
		colleagueColl1.setMapOfStaff(22, boss2);
		colleagueColl1.setMapOfStaff(23, boss3);
		colleagueColl1.setMapOfStaff(11, badEmployee1);
		colleagueColl1.setMapOfStaff(12, badEmployee2);		
		colleagueColl1.setMapOfStaff(13, badEmployee3);

		
		System.out.println("========List_1,List_2,Set,List==========");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfEmployees());
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfBadEmployees());
		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfBosses());
		
		System.out.println("======Sorting_of_List_with_Comparable=======");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		Collections.sort(colleagueColl1.getListOfStaff());
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		
		
		System.out.println("======Sorting_of_Set_with_Comparable========");
		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfStaff());
		Collections.sort(colleagueColl1.getListOfStaff());
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		
		System.out.println("==========Sorting_of_Set_with_Treeset==========");
		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfStaff());	
		colleagueColl1.getSortedSetOfStaff().addAll(colleagueColl1.getSetOfStaff()); 
		colleagueColl1.printInfoStorage(colleagueColl1.getSortedSetOfStaff());	

		
		System.out.println("======Sorting_of_List_with_Comparator=======");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		StatusCompare statusCompare = new StatusCompare();
		Collections.sort(colleagueColl1.getListOfStaff(), statusCompare);
		
		SexCompare sexCompare = new SexCompare();
//?		Collections.sort(colleagueColl1.getListOfStaff(), statusCompare, sexCompare);

//?		AgeCompare ageCompare = new AgeCompare();
//?		SalaryCompare salaryCompare = new SalaryCompare();
		System.out.println("========================");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		System.out.println("========================");
		Collections.sort(colleagueColl1.getListOfStaff(), sexCompare);		
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
//?		Collections.sort(colleagueColl1.getSetOfStaff(), statusCompare);
		
		
		System.out.println("========================");
		Iterator mapIterator = colleagueColl1.getMapOfStaff().entrySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(mapIterator.next());
			System.out.println("======");
		}

		colleagueColl1.getSortedMapOfStaff().putAll(colleagueColl1.getMapOfStaff()); 
		
		System.out.println("========================");
		mapIterator = colleagueColl1.getSortedMapOfStaff().entrySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(mapIterator.next());
			System.out.println("======");
		}
		
		colleagueColl1.printInfoSize1(colleagueColl1.getListOfStaff());
		colleagueColl1.printInfoSize1(colleagueColl1.getListOfEmployees());
		colleagueColl1.printInfoSize1(colleagueColl1.getListOfBadEmployees());
		colleagueColl1.printInfoSize1(colleagueColl1.getSetOfBosses());
		System.out.println("========================");
		colleagueColl1.printInfoSize2(colleagueColl1.getListOfEmployees());
		colleagueColl1.printInfoSize2(colleagueColl1.getSetOfBosses());
		
	}
		
}
		