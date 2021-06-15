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
		
	public void showMenu() {		
			
		Scanner in = new Scanner(System.in);
		String index = "";
	
		Colleague colleague3 = new Colleague();
		
		Employee employee1 = new Employee(25, "F"); 
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 	
		BadEmployee badEmployee3 = new BadEmployee(51, "M"); 	
		
		Boss boss1 = new Boss(76, "F"); 
		Boss boss2 = new Boss(77, "M"); 		
		Boss boss3 = new Boss(75, "F"); 
		
		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender"); 
		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M");
		ExpiriencedApplicant expiriencedApplicant3 = new ExpiriencedApplicant(44, "M");
		
		int employeeIndex = 0;
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_1_Usual_Storage================================");

		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
		in.nextLine();
		
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
//1			badEmployeeIndex = in.nextInt();
//2			
			String newIndex = in.nextLine();
			badEmployeeIndex = Integer.parseInt(newIndex);
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
		

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
				
		do {	
			System.out.println("Enter the number of Expirienced Applicants from 1 to 3");
//1			expiriencedApplicantIndex = in.nextInt();
//2			
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
		System.out.println(arr[i]);
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
		System.out.println("THAT'S IT for Scanner_1_Usual_Storage");
		System.out.println("========================");
		
		


		employeeIndex = 1;
		badEmployeeIndex = 1;
		bossIndex = 1;
		expiriencedApplicantIndex = 1;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_2_ArrayList_Colleague================================");	
		ColleagueAr colleagueAr1 = new ColleagueAr();
		
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
//!!!			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
		
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
//!!!			badEmployeeIndex = in.nextInt();
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
		
		do {	
			System.out.println("Enter the number of Bosses from 1 to 3");
//!!!			bossIndex = in.nextInt();
		} while((bossIndex != 1)&&(bossIndex != 2)&&(bossIndex != 3));		
	
		do {	
			System.out.println("Enter the number of Expirienced Applicants from 1 to 3");
//!!!			expiriencedApplicantIndex = in.nextInt();
		} while((expiriencedApplicantIndex != 1)&&(expiriencedApplicantIndex != 2)&&(expiriencedApplicantIndex != 3));					
//!!!		in.nextLine();
		
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
//!!!			index = in.nextLine();
			index = "n";
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
//!!!		index = in.nextLine();		
			index = "n";
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
//!!!			index = in.nextLine();
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
				
		System.out.println("========================");
		System.out.println("========================");

		for(Staff staff : colleagueAr1.getListOfStaff()) {
			System.out.println(staff.toString());
			System.out.println("======");
		}
		System.out.println(colleagueAr1.getListOfStaff().size());	
		
//		System.out.println(colleagueAr1.getListOfStaff().isEmpty());
//		colleagueAr1.getListOfStaff().add(expiriencedApplicant3);
//		colleagueAr1.getListOfStaff().add(0, expiriencedApplicant3);
//		colleagueAr1.getListOfStaff().set(colleagueAr1.getListOfStaff().size()-6, expiriencedApplicant3);
//		System.out.println(colleagueAr1.getListOfStaff().toString());
//		System.out.println(colleagueAr1.getListOfStaff().get(2));
//		System.out.println(colleagueAr1.getListOfStaff().getClass());
//		System.out.println(colleagueAr1.getListOfStaff().equals(colleagueLi1));
//		System.out.println(colleagueAr1.getListOfStaff().contains(expiriencedApplicant3));
//		System.out.println(colleagueAr1.getListOfStaff().indexOf(expiriencedApplicant1));
//		System.out.println(colleagueAr1.getListOfStaff().lastIndexOf(expiriencedApplicant3));
//		System.out.println(colleagueAr1.getListOfStaff().remove(expiriencedApplicant3));
//		System.out.println(colleagueAr1.getListOfStaff().subList(1, 2));	
//		colleagueAr1.getListOfStaff().clear();
		
	

	
		System.out.println("========================");
		System.out.println("========================");
		
//		System.out.println(colleagueAr1.getListOfStaff().remove(0));
		
//		for(Staff staff : colleagueAr1.getListOfStaff()) {
//			System.out.println(staff.toString());
//			System.out.println("======");
//		}
//		System.out.println(colleagueAr1.getListOfStaff().size());	
	

		System.out.println("========================");
		System.out.println("========================");		
//		System.out.println(colleagueAr1.getListOfStaff().hashCode());		
//?		System.out.println(colleagueAr1.getListOfStaff().iterator());
//?		System.out.println(colleagueAr1.getListOfStaff().listIterator());
//?		System.out.println(colleagueAr1.getListOfStaff().parallelStream());
//		System.out.println(colleagueAr1.getListOfStaff().spliterator());
//		System.out.println(colleagueAr1.getListOfStaff().stream());
//		colleagueAr1.getListOfStaff().notify();
//		colleagueAr1.getListOfStaff().notifyAll();
//		colleagueAr1.getListOfStaff().wait();
//		colleagueAr1.getListOfStaff().wait(indexSex);
//		colleagueAr1.getListOfStaff().wait(expiriencedApplicantIndex, indexSex);
		
		
		
//		System.out.println("========================");
//		System.out.println("THAT'S IT for Scanner_2_ArrayList_Colleague");
//		System.out.println("========================");		
//		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_3_LinkedList_Colleague================================");	
//		ColleagueLi colleagueLi1 = new ColleagueLi();
//	
//		do {	
//			System.out.println("Enter the number of Employees from 1 to 3");
//			employeeIndex = in.nextInt();
//		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
//	
//		do {	
//			System.out.println("Enter the number of Bad Employees from 1 to 3");
//			badEmployeeIndex = in.nextInt();
//		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3));	
//		in.nextLine();
//		
//		switch (employeeIndex){
//		case 1:
//			colleagueLi1.setListOfStaff(employee1);
//			break;
//		case 2:
//			colleagueLi1.setListOfStaff(employee1);
//			colleagueLi1.setListOfStaff(employee2);
//			break;
//		case 3:
//			colleagueLi1.setListOfStaff(employee1);
//			colleagueLi1.setListOfStaff(employee2);
//			colleagueLi1.setListOfStaff(employee3);
//			break;	
//		default:
//			break;				
//		}
//		switch (badEmployeeIndex){
//		case 1:
//			colleagueLi1.setListOfStaff(badEmployee1);
//			break;
//		case 2:
//			colleagueLi1.setListOfStaff(badEmployee1);
//			colleagueLi1.setListOfStaff(badEmployee2);
//			break;
//		case 3:
//			colleagueLi1.setListOfStaff(badEmployee1);
//			colleagueLi1.setListOfStaff(badEmployee2);
//			colleagueLi1.setListOfStaff(badEmployee3);
//			break;	
//		default:
//			break;				
//		}
//	
//		do {
//			System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
//			index = in.nextLine();
//		} while((!("y".equals(index)))&&(!("n".equals(index))));		
//  
//		if ("y".equals(index)) {
//			if ((colleagueLi1 != null)&&(!colleagueLi1.getListOfStaff().isEmpty())) {
//				for(int i = 0; i < employeeIndex; i++) {
//					System.out.println(colleagueLi1.getListOfStaff().get(i).toString());
//					System.out.println("======");
//				}
//			} else {
//				System.out.println("The required Storage is Null or Empty");	
//			}
//		} else {
//			System.out.println("OK, move forward!");
//		}
//    
//		sexIndex = "";
//		indexSex = 1;
//	
//		do {
//			System.out.println("Would you like to set sex to all of the Employees? (y/n)");
//			index = in.nextLine();
//		} while((!("y".equals(index)))&&(!("n".equals(index))));
//			
//		if ("y".equals(index)) {
//			if ((colleagueLi1 != null)&&(!colleagueLi1.getListOfStaff().isEmpty())) {
//				for(int i = 0; i < employeeIndex; i++) {
//					System.out.println("Sex of " + colleagueLi1.getListOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueLi1.getListOfStaff().get(i).showSex());
//					System.out.println("Set sex to " + colleagueLi1.getListOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
//					sexIndex = in.nextLine();
//					colleagueLi1.getListOfStaff().get(i).setSex(sexIndex);
//				}
//			} else {
//				System.out.println("The required Storage is Null or Empty");	
//			}			
//		} else {
//			System.out.println("OK, move forward!");
//		}
//	
//		System.out.println("========================");
//    
//		do {
//			System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
//			index = in.nextLine();
//		} while((!("y".equals(index)))&&(!("n".equals(index))));
//		
//		if ("y".equals(index)) {
//			if ((colleagueLi1 != null)&&(!colleagueLi1.getListOfStaff().isEmpty())) {
//				for(Staff staff : colleagueLi1.getListOfStaff()) {
//					System.out.println(staff.toString());
//					System.out.println("======");
//				}	
//			} else {
//				System.out.println("The required Storage is Null or Empty");	
//			}
//		} else {
//			System.out.println("OK, move forward!");
//		}
//
//
//
//		for(Staff staff : colleagueAr1.getListOfStaff()) {
//			System.out.println(staff.toString());
//			System.out.println("======");
//		}
//		System.out.println(colleagueAr1.getListOfStaff().size());	
//		
//		System.out.println("========================");
//		System.out.println("========================");
//		
//		for(Staff staff : colleagueLi1.getListOfStaff()) {
//			System.out.println(staff.toString());
//			System.out.println("======");
//		}
//		System.out.println(colleagueLi1.getListOfStaff().size());	
//
//		System.out.println("========================");
//		System.out.println("========================");

//		colleagueAr1.getListOfStaff().addAll(1, colleagueLi1.getListOfStaff());
//		colleagueAr1.getListOfStaff().addAll(colleagueLi1.getListOfStaff());
//		System.out.println(colleagueAr1.getListOfStaff().containsAll(colleagueLi1.getListOfStaff()));
//		System.out.println(colleagueAr1.getListOfStaff().removeAll(colleagueLi1.getListOfStaff()));
//		System.out.println(colleagueAr1.getListOfStaff().retainAll(colleagueLi1.getListOfStaff()));
					
//		String[] myArray = {};
//	    myArray = colleagueAr1.getListOfStaff().toArray(new String[colleagueAr1.getListOfStaff().size()]);
//	    System.out.println(myArray);
//		System.out.println(colleagueAr1.getListOfStaff().toArray(null));
//		System.out.println(colleagueAr1.getListOfStaff().toArray(null));
//		System.out.println(colleagueAr1.getListOfStaff().forEach(colleagueLi1.getListOfStaff()));		
//		System.out.println(colleagueAr1.getListOfStaff().sort(colleagueLi1.getListOfStaff()));		
//		colleagueAr1.getListOfStaff().replaceAll(null);	
	
//		for(Staff staff : colleagueAr1.getListOfStaff()) {
//			System.out.println(staff.toString());
//			System.out.println("======");
//		}
//		System.out.println(colleagueAr1.getListOfStaff().size());


//		if ("y".equals(index)) {
//			if ((activeUserLi1 != null)&&(!activeUserLi1.getListOfGoodUser().isEmpty())) {	
//				for(GoodUser goodUser : activeUserLi1.getListOfGoodUser()) {
//					System.out.println("Operator of " + goodUser.showUser() + " " + indexOperator + " is " + goodUser.showOperator());
//					System.out.println("Set sex to " + goodUser.showUser() + " " + indexOperator + " (enter new name of operator)");
//					newOperator = in.nextLine();
//					goodUser.setOperator(newOperator);
//				}
//			} else {
//				System.out.println("The required Storage is Null or Empty");	
//			}
//		} else {
//			System.out.println("OK, move forward!");
//		}
		
		System.out.println("========================");
		System.out.println("THAT'S IT for Scanner_3_LinkedList_Colleague");
		System.out.println("========================");
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_4_HashSet_Colleague================================");	
		
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
//				for(int i = 0; i < employeeIndex; i++) {
//					System.out.println(colleagueAr1.getListOfStaff().get(i).toString());
//					System.out.println("======");
//				}

			if ((colleagueHS1 != null)&&(!colleagueHS1.getSetOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
					System.out.println(colleagueHS1.getSetOfStaff().toString());
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
//			if ((colleagueHS1 != null)&&(!colleagueHS1.getSetOfStaff().isEmpty())) {
//				for(int i = 0; i < employeeIndex; i++) {
//					System.out.println("Sex of " + colleagueHS1.getSetOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueHS1.getSetOfStaff().get(i).showSex());
//					System.out.println("Set sex to " + colleagueHS1.getSetOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
//					sexIndex = in.nextLine();
//					colleagueHS1.getSetOfStaff().get(i).setSex(sexIndex);
//				}
//			} else {
//				System.out.println("The required Storage is Null or Empty");	
//			}			
		} else {
			System.out.println("OK, move forward!");
		}
	
		System.out.println("========================");
    
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
		
		System.out.println("========================");
		System.out.println("THAT'S IT for 4_HashSet_Colleague");
		System.out.println("========================");
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_5_HashMap_Colleague================================");	
		
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
}
		