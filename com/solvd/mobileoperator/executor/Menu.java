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

public class Menu {
	
	public Menu() {

	}	 

	public void showMenu() {
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_1================================");
		
		Scanner in = new Scanner(System.in);
		String index = "";
			
		Colleague colleague3 = new Colleague();
		
		Employee employee1 = new Employee(25, "F"); 
		colleague3.setStaff(employee1);
		colleague3.getStaff().setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		colleague3.setStaff(badEmployee1);
		colleague3.getStaff().setInfoAgain(36, "MM", 700, "bad employee");
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		
		Boss boss1 = new Boss(76, "F"); 
		colleague3.setStaff(boss1);
		colleague3.getStaff().setInfoAgain(46, "FF", 3000, "boss");
		Boss boss2 = new Boss(77, "M"); 		
		Boss boss3 = new Boss(75, "F"); 
		
		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender"); 
		colleague3.setStaff(expiriencedApplicant1);
		colleague3.getStaff().setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M");
		ExpiriencedApplicant expiriencedApplicant3 = new ExpiriencedApplicant(44, "M");
				
		int employeeIndex = 0;
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
		in.nextLine();
		
		int badEmployeeIndex = 0;
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
//1			badEmployeeIndex = in.nextInt();
//2			
			String newIndex = in.nextLine();
			badEmployeeIndex = Integer.parseInt(newIndex);
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
		
		int bossIndex = 0;
		do {	
			System.out.println("Enter the number of Bosses from 1 to 3");
//1			bossIndex = in.nextInt();
//2			
//2			String newIndex = in.nextLine();
//2			String[] indexArray = new String[1];
//2			indexArray = newIndex.split(" ");
//2			bossIndex = Integer.parseInt(indexArray[0]);
//3			
			String newIndex = in.nextLine();
			String[] indexArray = newIndex.split(" ");
			bossIndex = Integer.parseInt(indexArray[0]);
		} while((bossIndex != 1)&&(bossIndex != 2)&&(bossIndex != 3));		
				
		int expiriencedApplicantIndex = 0;
		do {	
			System.out.println("Enter the number of Expirienced Applicants from 1 to 3");
//1			expiriencedApplicantIndex = in.nextInt();
//2			
//2			String newIndex = in.nextLine();
//2			ArrayList<String> indexArray = newIndex.split(" ");
//2			expiriencedApplicantIndex = Integer.parseInt(indexArray.get(0));
//3		
			String newIndex = in.nextLine();
			String[] newIndexSplit = newIndex.split(" ");
			ArrayList<String> stringArray = new ArrayList<String>();
			stringArray.add(0, newIndexSplit[0]);
			expiriencedApplicantIndex = Integer.parseInt(stringArray.get(0));		
		
		} while((expiriencedApplicantIndex != 1)&&(expiriencedApplicantIndex != 2)&&(expiriencedApplicantIndex != 3));				
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Attention================================");
		
		
		
		System.out.println("Enter Any list of numbers");	
		
		String intLine = in.nextLine();
		String[] intLineSplit = intLine.split(" ");
		int[] arr = new int[intLineSplit.length];
		for(int i = 0; i < intLineSplit.length; i++) {
			arr[i] = Integer.parseInt(intLineSplit[i]);
//?			System.out.println(Arrays.toString(arr[i]));
		}		
		System.out.println(Arrays.toString(arr));
				
		
		System.out.println("Enter Any list of numbers 1");	
				
 		String stringIndex = in.nextLine();
 		String[] stringIndexSplit = stringIndex.split(" ");
		ArrayList<String> stringArray = new ArrayList<String>();
		for(int i = 0; i < stringIndexSplit.length; i++) {
			stringArray.add(i, stringIndexSplit[i]);
			}
		System.out.println(stringArray.toString());
				
		
		System.out.println("Enter Any list of numbers 2");
		
		stringIndex = in.nextLine();
 		stringIndexSplit = stringIndex.split(" ");
//		ArrayList<String> stringArray = new ArrayList<String>(); 		
		for(int i = 0; i < stringIndexSplit.length; i++) {
			stringArray.set(i, stringIndexSplit[i]);
			}
		System.out.println(stringArray.toString());

		
		System.out.println("Enter Any list of numbers 3");

 		String intIndex = in.nextLine();
 		String[] intIndexSplit = intIndex.split(" ");
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i = 0; i < intIndexSplit.length; i++) {
			intArray.add(i, Integer.parseInt(intIndexSplit[i]));
			}		
		System.out.println(intArray.toString());
		
		
		System.out.println(employeeIndex);
		System.out.println(badEmployeeIndex);
		System.out.println(bossIndex);
		System.out.println(expiriencedApplicantIndex);
		
		do {
		System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
		index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		 
		if ("y".equals(index)) {
			switch (employeeIndex){
			case 1:
				colleague3.setStaff(employee1);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 2:
				colleague3.setStaff(employee1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(employee2);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 3:
				colleague3.setStaff(employee1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(employee2);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(employee3);
				System.out.println(colleague3.getStaff().toString());
				break;	
			default:
				break;				
			}
			System.out.println("========================");
			switch (badEmployeeIndex){
			case 1:
				colleague3.setStaff(badEmployee1);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 2:
				colleague3.setStaff(badEmployee1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(badEmployee2);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 3:
				colleague3.setStaff(badEmployee1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(badEmployee2);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(badEmployee3);
				System.out.println(colleague3.getStaff().toString());
				break;	
			default:
				break;				
			}
			System.out.println("========================");
			switch (bossIndex){
			case 1:
				colleague3.setStaff(boss1);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 2:
				colleague3.setStaff(boss1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(boss2);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 3:
				colleague3.setStaff(boss1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(boss2);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(boss3);
				System.out.println(colleague3.getStaff().toString());
				break;	
			default:
				break;				
			}		
			System.out.println("========================");
			switch (expiriencedApplicantIndex){
			case 1:
				colleague3.setStaff(expiriencedApplicant1);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 2:
				colleague3.setStaff(expiriencedApplicant1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(expiriencedApplicant2);
				System.out.println(colleague3.getStaff().toString());
				break;
			case 3:
				colleague3.setStaff(expiriencedApplicant1);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(expiriencedApplicant2);
				System.out.println(colleague3.getStaff().toString());
				System.out.println("=======");
				colleague3.setStaff(expiriencedApplicant3);
				System.out.println(colleague3.getStaff().toString());
				break;	
			default:
				break;				
			}
			System.out.println("========================");
		} else {
			System.out.println("Bye! See You!");
		}		
	
		System.out.println("========================");
		System.out.println("THAT'S IT for Scaner 1");
		System.out.println("========================");
		
		
		

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_3================================");	
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
		colleagueAr1.getListOfStaff().remove(3);
		colleagueAr1.getListOfStaff().remove(2);
		colleagueAr1.getListOfStaff().remove(1);
		colleagueAr1.getListOfStaff().remove(0);
		
		
		
		do {
			System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));		
      
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
					System.out.println(colleagueAr1.getListOfStaff().get(i).toString());
					System.out.println("======");
					colleagueAr1.getListOfStaff().get(i).printInfo();
					System.out.println("======");
					System.out.println(colleagueAr1.getListOfStaff().get(i).aquire());
					System.out.println(colleagueAr1.getListOfStaff().get(i).work());
					System.out.println(colleagueAr1.getListOfStaff().get(i).showAge());
					System.out.println(colleagueAr1.getListOfStaff().get(i).showSex());
					System.out.println(colleagueAr1.getListOfStaff().get(i).showStatus());
					System.out.println("======");
					colleagueAr1.getListOfStaff().get(i).setInfoAgain(26, "ff", 2000, "employee");
					System.out.println(colleagueAr1.getListOfStaff().get(i).showSalaryMaximum(26, 2000, "employee"));
				// OverLoading
					System.out.println("======");
					colleagueAr1.getListOfStaff().get(i).printInfo(36, "FF");
					System.out.println(colleagueAr1.getListOfStaff().get(i).showAge(42));
					System.out.println(colleagueAr1.getListOfStaff().get(i).showSex("ff"));
					System.out.println(colleagueAr1.getListOfStaff().get(i).showStatus("status11"));
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
        	}
 		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("========================");
		
		String sexIndex = "";
		int indexSex = 1;
		
		do {
			System.out.println("Would you like to set sex to all of the Employees? (y/n)");
			index = in.nextLine();		
		} while((!("y".equals(index)))&&(!("n".equals(index))));
				
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
	         		System.out.println("Sex of " + colleagueAr1.getListOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueAr1.getListOfStaff().get(i).showSex());
					System.out.println("Set sex to " + colleagueAr1.getListOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
					sexIndex = in.nextLine();
					colleagueAr1.getListOfStaff().get(i).setSex(sexIndex);
	         	}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("========================");
		
		do {
			System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
			index = in.nextLine();
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
				
		System.out.println("========================");
		System.out.println("THAT'S IT for Scanner 3");
		System.out.println("========================");
	

		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_4================================");	
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
					System.out.println("Sex of " + colleagueLi1.getListOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueLi1.getListOfStaff().get(i).showSex());
					System.out.println("Set sex to " + colleagueLi1.getListOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
					sexIndex = in.nextLine();
					colleagueLi1.getListOfStaff().get(i).setSex(sexIndex);
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}			
		} else {
			System.out.println("OK, move forward!");
		}
	
		System.out.println("========================");
    
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
		
		System.out.println("========================");
		System.out.println("THAT'S IT for Scanner 4");
		System.out.println("========================");
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_5================================");
		
		index = "";
			
		MobilePhoneUser mobilePhoneUser1 = new MobilePhoneUser(1234567, "BelCom", true, 100);
		MobilePhoneUser mobilePhoneUser2 = new MobilePhoneUser(2345671, "PolskaCom", true, 200);
		MobilePhoneUser mobilePhoneUser3 = new MobilePhoneUser(3456712, "LitvaCom", true, 300);		
		MobileInternetUser mobileInternetUser1 = new MobileInternetUser(2345678, "BelarusCom", true, 1200, 2500);
		MobileInternetUser mobileInternetUser2 = new MobileInternetUser(3456782, "MedvedCom", false, 1000, 1500);
		MobileInternetUser mobileInternetUser3 = new MobileInternetUser(4567823, "BelkaCom", false, 1700, 3500);	
		HomeInternetUser homeInternetUser1 = new HomeInternetUser(3456789, "ZubrCom", true, 10000);
		HomeInternetUser homeInternetUser2 = new HomeInternetUser(4567893, "BarsukCom", true, 15000);
		HomeInternetUser homeInternetUser3 = new HomeInternetUser(5678934, "BobrCom", true, 25000); 
						
		int mobilePhoneUserIndex = 0;
		int mobileInternetUserIndex = 0;
		int homeInternetUserIndex = 0;
		
		ActiveUserAr activeUserAr1 = new ActiveUserAr();

		do {	
			System.out.println("Enter the number of Mobile Phone Users from 1 to 3");
			mobilePhoneUserIndex = in.nextInt();
		} while((mobilePhoneUserIndex != 1)&&(mobilePhoneUserIndex != 2)&&(mobilePhoneUserIndex != 3));
		
		do {	
			System.out.println("Enter the number of Mobile Internet Users from 1 to 3");
			mobileInternetUserIndex = in.nextInt();
		} while((mobileInternetUserIndex != 1)&&(mobileInternetUserIndex != 2)&&(mobileInternetUserIndex != 3));	
		
		do {	
			System.out.println("Enter the number of Home Internet Users from 1 to 3");
			homeInternetUserIndex = in.nextInt();
		} while((homeInternetUserIndex != 1)&&(homeInternetUserIndex != 2)&&(homeInternetUserIndex != 3));		
		in.nextLine();
				
		switch (mobilePhoneUserIndex){
		case 1:
			activeUserAr1.setListOfGoodUser(mobilePhoneUser1);
			break;
		case 2:
			activeUserAr1.setListOfGoodUser(mobilePhoneUser1);
			activeUserAr1.setListOfGoodUser(mobilePhoneUser2);
			break;
		case 3:
			activeUserAr1.setListOfGoodUser(mobilePhoneUser1);
			activeUserAr1.setListOfGoodUser(mobilePhoneUser2);
			activeUserAr1.setListOfGoodUser(mobilePhoneUser3);
			break;	
		default:
			break;				
		}
		switch (mobileInternetUserIndex){
		case 1:
			activeUserAr1.setListOfGoodUser(mobileInternetUser1);
			break;
		case 2:
			activeUserAr1.setListOfGoodUser(mobileInternetUser1);
			activeUserAr1.setListOfGoodUser(mobileInternetUser2);
			break;
		case 3:
			activeUserAr1.setListOfGoodUser(mobileInternetUser1);
			activeUserAr1.setListOfGoodUser(mobileInternetUser2);
			activeUserAr1.setListOfGoodUser(mobileInternetUser3);
			break;	
		default:
			break;				
		}
		switch (homeInternetUserIndex){
		case 1:
			activeUserAr1.setListOfGoodUser(homeInternetUser1);
			break;
		case 2:
			activeUserAr1.setListOfGoodUser(homeInternetUser1);
			activeUserAr1.setListOfGoodUser(homeInternetUser2);
			break;
		case 3:
			activeUserAr1.setListOfGoodUser(homeInternetUser1);
			activeUserAr1.setListOfGoodUser(homeInternetUser2);
			activeUserAr1.setListOfGoodUser(homeInternetUser3);
			break;	
		default:
			break;								
		}
		
		do {
			System.out.println("Would you like to get all of the information about all of the Mobile Phone Users? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));		
      
		if ("y".equals(index)) {
			if ((activeUserAr1 != null)&&(!activeUserAr1.getListOfGoodUser().isEmpty())) {
				for(int i = 0; i < mobilePhoneUserIndex; i++) {
					System.out.println(activeUserAr1.getListOfGoodUser().get(i).toString());
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}	
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("========================");
		
		String newOperator = "";
		int indexOperator = 1;
		
		do {
			System.out.println("Would you like to set operator to all of the Mobile Phone Users? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
				
		if ("y".equals(index)) {
			if ((activeUserAr1 != null)&&(!activeUserAr1.getListOfGoodUser().isEmpty())) {
        		for(int i = 0; i < mobilePhoneUserIndex; i++) {
        			System.out.println("Operator of " + activeUserAr1.getListOfGoodUser().get(i).showUser() + " " + indexOperator + " is " + activeUserAr1.getListOfGoodUser().get(i).showOperator());
        			System.out.println("Set sex to " + activeUserAr1.getListOfGoodUser().get(i).showUser() + " " + indexOperator + " (enter new name of operator)");
        			newOperator = in.nextLine();
        			activeUserAr1.getListOfGoodUser().get(i).setOperator(newOperator);
        		}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}	
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("========================");
		
		do {
			System.out.println("Would you like to get all of the information about all of the Active Users? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((activeUserAr1 != null)&&(!activeUserAr1.getListOfGoodUser().isEmpty())) {
				for(GoodUser goodUser : activeUserAr1.getListOfGoodUser()) {
					System.out.println(goodUser.toString());
					System.out.println("======");
				}	
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
				
		System.out.println("========================");
		System.out.println("THAT'S IT for Scanner 5");
		System.out.println("========================");

		
		

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_6================================");

		index = "";
		
		ActiveUserLi activeUserLi1 = new ActiveUserLi();

		do {	
			System.out.println("Enter the number of Mobile Phone Users from 1 to 3");
			mobilePhoneUserIndex = in.nextInt();
		} while((mobilePhoneUserIndex != 1)&&(mobilePhoneUserIndex != 2)&&(mobilePhoneUserIndex != 3));
		
		do {	
			System.out.println("Enter the number of Mobile Internet Users from 1 to 3");
			mobileInternetUserIndex = in.nextInt();
		} while((mobileInternetUserIndex != 1)&&(mobileInternetUserIndex != 2)&&(mobileInternetUserIndex != 3));	
		in.nextLine();
	
		switch (mobilePhoneUserIndex){
		case 1:
			activeUserLi1.setListOfGoodUser(mobilePhoneUser1);
			break;
		case 2:
			activeUserLi1.setListOfGoodUser(mobilePhoneUser1);
			activeUserLi1.setListOfGoodUser(mobilePhoneUser2);
			break;
		case 3:
			activeUserLi1.setListOfGoodUser(mobilePhoneUser1);
			activeUserLi1.setListOfGoodUser(mobilePhoneUser2);
			activeUserLi1.setListOfGoodUser(mobilePhoneUser3);
			break;	
		default:
			break;				
		}
		switch (mobileInternetUserIndex){
		case 1:
			activeUserLi1.setListOfGoodUser(mobileInternetUser1);
			break;
		case 2:
			activeUserLi1.setListOfGoodUser(mobileInternetUser1);
			activeUserLi1.setListOfGoodUser(mobileInternetUser2);
			break;
		case 3:
			activeUserLi1.setListOfGoodUser(mobileInternetUser1);
			activeUserLi1.setListOfGoodUser(mobileInternetUser2);
			activeUserLi1.setListOfGoodUser(mobileInternetUser3);
			break;	
		default:
			break;				
		}
		
	    do {
	    	System.out.println("Would you like to get all of the information about all of the Mobile Phone Users? (y/n)");
	    	index = in.nextLine();
	    } while((!("y".equals(index)))&&(!("n".equals(index))));		
	    		
	    if ("y".equals(index)) {
	    	if ((activeUserLi1 != null)&&(!activeUserLi1.getListOfGoodUser().isEmpty())) {
	    		for(int i = 0; i < mobilePhoneUserIndex; i++) {
	    			System.out.println(activeUserLi1.getListOfGoodUser().get(i).toString());
	    			System.out.println("======");
	    		}
	    	} else {
	    		System.out.println("The required Storage is Null or Empty");	
	    	}	
	    } else {
	    	System.out.println("OK, move forward!");
	    }
                
    	System.out.println("========================");
		
		newOperator = "";
		indexOperator = 1;
		
		do {
			System.out.println("Would you like to set operator to all of the Active Users? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
				
		if ("y".equals(index)) {
			if ((activeUserLi1 != null)&&(!activeUserLi1.getListOfGoodUser().isEmpty())) {	
				for(GoodUser goodUser : activeUserLi1.getListOfGoodUser()) {
					System.out.println("Operator of " + goodUser.showUser() + " " + indexOperator + " is " + goodUser.showOperator());
					System.out.println("Set sex to " + goodUser.showUser() + " " + indexOperator + " (enter new name of operator)");
					newOperator = in.nextLine();
					goodUser.setOperator(newOperator);
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("========================");
		
		do {
			System.out.println("Would you like to get all of the information about all of the Active Users? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((activeUserLi1 != null)&&(!activeUserLi1.getListOfGoodUser().isEmpty())) {	
				for(GoodUser goodUser : activeUserLi1.getListOfGoodUser()) {
					System.out.println(goodUser.toString());
					System.out.println("======");
				}	
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
				
		System.out.println("========================");
		System.out.println("THAT'S IT for Scanner 6");
		System.out.println("========================");
		
		
	}
	
}
