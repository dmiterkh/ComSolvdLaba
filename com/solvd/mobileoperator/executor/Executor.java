package com.solvd.mobileoperator.executor;

import com.solvd.mobileoperator.point.InternetMarket;         // Set, Get, Extension:  
import com.solvd.mobileoperator.point.Market;         
import com.solvd.mobileoperator.point.Office;         
import com.solvd.mobileoperator.point.MarketPlace;    	
    		 
import com.solvd.mobileoperator.staff.Employee;     		  // Initial Interface Trainee, Extension, Implementation: 
import com.solvd.mobileoperator.staff.Boss;         		 
import com.solvd.mobileoperator.staff.BadEmployee;           
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;   // Class ExpiriencedApplicant extends Abstract Class Unemployed
															  // and implements Interface Staff

import com.solvd.mobileoperator.user.NoMoneyUser;             // Initial Abstract Class BadUser; 
import com.solvd.mobileoperator.user.NoConnectionUser;   
import com.solvd.mobileoperator.user.MobilePhoneUser;         // Initial Abstract Class GoodUser; 
import com.solvd.mobileoperator.user.MobileInternetUser; 
import com.solvd.mobileoperator.user.HomeInternetUser;    

import com.solvd.mobileoperator.storage.Colleague;            // Polymorphizm: Interface Staff 
import com.solvd.mobileoperator.storage.ActiveUser;           // Polymorphizm: Abstract Class GoodUser

import java.util.Scanner;



public class Executor {

	public static void main(String[] args) {
		
/*		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Internet Market");		
		System.out.println("========================");
		
		InternetMarket internetMarket1 = new InternetMarket();
		internetMarket1.setSales(true);
		System.out.println(internetMarket1.getSales());
		System.out.println("============");
		
		InternetMarket internetMarket2 = new InternetMarket();
		internetMarket2.setInfo(true);
		internetMarket2.printInfo();
		System.out.println("============");

		
				
				
		System.out.println(" ");		
		System.out.println(" ");
		System.out.println("Class Of Market");
		System.out.println("========================");
		
		Market market1 = new Market();
		market1.setInfo("", true);
		market1.printInfo();
		System.out.println("============");
		
		Market market2 = new Market("", true);
		market2.printInfo();
		System.out.println("============");
		
		Market market3 = new Market();
		market3.setAdress("");
		System.out.println(market3.getAdress());
		System.out.println("======");
		market3.setSales(true);
		System.out.println(market3.getSales());
		System.out.println("======");
		market3.printInfo();
		System.out.println("============");
		
		Market market4 = new Market("Brovki", true);
		market4.printInfo();
		System.out.println("============");
		
		Market market5 = new Market();
		market5.setInfo("Pobedy", true);
		market5.printInfo();
		System.out.println("============");
		
		Market market6 = new Market();
		market6.setAdress("Lenina");
		market6.setSales(true);
		System.out.println(market6.getAdress());
		System.out.println(market6.getSales());		
		System.out.println("============");

		
		Employee employee1 = new Employee(25, "F"); 
		Employee employee2 = new Employee(20, "M"); 		
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 		
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 		
		Boss boss1 = new Boss(76, "F"); 		
		Boss boss2 = new Boss(77, "M"); 		
		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender"); 		
		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M"); 
		

		Office office1 = new Office();
		office1.printInfo();
		
		MarketPlace marketPlace1 = new MarketPlace();
		marketPlace1.printInfo();
		
	    NoMoneyUser noMoneyUser1 = new NoMoneyUser(1234567, "BelCom", true);
		System.out.println(noMoneyUser1.toString());

		NoMoneyUser noMoneyUser2 = new NoMoneyUser(12345678, "BelCom", true);
		System.out.println(noMoneyUser2.toString());

		NoConnectionUser noConnectionUser1 = new NoConnectionUser(567, "UserCom", true);
		System.out.println(noConnectionUser1.toString());
		
		NoConnectionUser noConnectionUser2 = new NoConnectionUser(678, "BulbaCom", true);
		System.out.println(noConnectionUser2.toString());
				
		MobilePhoneUser mobilePhoneUser1 = new MobilePhoneUser(1234567, "BelCom", true, 100);
		MobilePhoneUser mobilePhoneUser2 = new MobilePhoneUser(1234567, "BelCom", true, 100);
	    MobileInternetUser mobileInternetUser1 = new MobileInternetUser(1234567, "BelarusCom", true, 1200, 2500);
		MobileInternetUser mobileInternetUser2 = new MobileInternetUser(1234567, "MedvedCom", false, 1000, 1500);
		HomeInternetUser homeInternetUser1 = new HomeInternetUser(1234567, "BelarusCom", true, 10000);
		HomeInternetUser homeInternetUser2 = new HomeInternetUser(4567123, "BarsukCom", true, 15000);


		
// STORAGE!!! STORAGE!!! STORAGE!!!
		

        System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class (Storage) Of Colleague");
		System.out.println("========================");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Set 1 OverRiding");
		System.out.println("========================");
		
		Colleague colleague1 = new Colleague();

		colleague1.setStaff(employee1);
		colleague1.getStaff().printInfo();
		System.out.println(colleague1.getStaff().showAge());
		System.out.println(colleague1.getStaff().showSex());
		System.out.println(colleague1.getStaff().showStatus());
		System.out.println("======");
		colleague1.getStaff().setInfoAgain(26, "ff", 2000, "employee");
		System.out.println(colleague1.getStaff().showSalaryMaximum(26, 2000, "employee"));
		System.out.println(colleague1.getStaff().toString());

// OverLoading
		System.out.println("======");
		colleague1.getStaff().printInfo(36, "FF");
		System.out.println(colleague1.getStaff().showAge(42));
		System.out.println(colleague1.getStaff().showSex("ff"));
		System.out.println(colleague1.getStaff().showStatus("status11"));
		System.out.println("======");
		
		colleague1.setStaff(badEmployee1);
		colleague1.getStaff().printInfo();
		System.out.println(colleague1.getStaff().showAge());
		System.out.println(colleague1.getStaff().showSex());
		System.out.println(colleague1.getStaff().showStatus());
		System.out.println("======");
		colleague1.getStaff().setInfoAgain(36, "MM", 700, "bad employee");
		System.out.println(colleague1.getStaff().showSalaryMaximum(36, 700, "bad employee"));
		System.out.println(colleague1.getStaff().toString());

// OverLoading
		System.out.println("======");
		colleague1.getStaff().printInfo(46, "mm");
		System.out.println(colleague1.getStaff().showAge(52));
		System.out.println(colleague1.getStaff().showSex("mm"));
		System.out.println(colleague1.getStaff().showStatus("status12"));
		System.out.println("======");
		
		colleague1.setStaff(boss1);
		colleague1.getStaff().printInfo();
		System.out.println(colleague1.getStaff().showAge());
		System.out.println(colleague1.getStaff().showSex());
		System.out.println(colleague1.getStaff().showStatus());
		System.out.println("======");
		colleague1.getStaff().setInfoAgain(46, "FF", 3000, "boss");
		System.out.println(colleague1.getStaff().showSalaryMaximum(46, 3000, "boss"));		
		System.out.println(colleague1.getStaff().toString());

// OverLoading		
		System.out.println("======");
		colleague1.getStaff().printInfo(56, "ff");
		System.out.println(colleague1.getStaff().showAge(62));
		System.out.println(colleague1.getStaff().showSex("mmff"));
		System.out.println(colleague1.getStaff().showStatus("status13"));
		System.out.println("======");
		
		colleague1.setStaff(expiriencedApplicant1);
		colleague1.getStaff().printInfo();
		badEmployee1.printInfo(43, "female", 300, "bad employee");
		System.out.println(colleague1.getStaff().showAge());
		System.out.println(colleague1.getStaff().showSex());
		System.out.println(colleague1.getStaff().showStatus());
		System.out.println("======");
		colleague1.getStaff().setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
		System.out.println(colleague1.getStaff().showSalaryMaximum(16, 1500, "expirienced applicant"));	
		System.out.println(colleague1.getStaff().toString());

// OverLoading	
		System.out.println("======");
		colleague1.getStaff().printInfo(26, "TransGender");
		System.out.println(colleague1.getStaff().showAge(22));
		System.out.println(colleague1.getStaff().showSex("TransSexual"));
		System.out.println(colleague1.getStaff().showStatus("status14"));
		System.out.println("========================");

		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Set 2 OverRiding");
		System.out.println("========================");

		
		Colleague colleague2 = new Colleague();

		colleague2.setStaff(employee2);
		colleague2.getStaff().printInfo();
		System.out.println(colleague2.getStaff().showAge());
		System.out.println(colleague2.getStaff().showSex());
		System.out.println(colleague2.getStaff().showStatus());
		System.out.println("======");
		colleague2.getStaff().setInfoAgain(39, "ff", 2600, "employee");
		System.out.println(colleague2.getStaff().toString());

// OverLoading	
		System.out.println("======");
		colleague2.getStaff().printInfo(49, "ff");
		System.out.println(colleague2.getStaff().showAge(52));
		System.out.println(colleague2.getStaff().showSex("ff"));
		System.out.println(colleague2.getStaff().showStatus("status1"));
		System.out.println("======");

		colleague2.setStaff(badEmployee2);
		colleague2.getStaff().printInfo();
		System.out.println(colleague2.getStaff().showAge());
		System.out.println(colleague2.getStaff().showSex());
		System.out.println(colleague2.getStaff().showStatus());
		System.out.println("======");
		colleague2.getStaff().setInfoAgain(49, "ff", 1200, "bad employee");
		System.out.println(colleague2.getStaff().toString());
		
// OverLoading
		System.out.println("======");
		colleague2.getStaff().printInfo(59, "mm");
		System.out.println(colleague2.getStaff().showAge(62));
		System.out.println(colleague2.getStaff().showSex("mm"));
		System.out.println(colleague2.getStaff().showStatus("status2"));
		System.out.println("======");

		colleague2.setStaff(boss2);
		colleague2.getStaff().printInfo();
		System.out.println(colleague2.getStaff().showAge());
		System.out.println(colleague2.getStaff().showSex());
		System.out.println(colleague2.getStaff().showStatus());
		System.out.println("======");
		colleague2.getStaff().setInfoAgain(59, "mm", 4000, "boss");
		System.out.println(colleague2.getStaff().toString());

// OverLoading	
		System.out.println("======");
		colleague2.getStaff().printInfo(69, "ff");
		System.out.println(colleague2.getStaff().showAge(72));
		System.out.println(colleague2.getStaff().showSex("mmff"));
		System.out.println(colleague2.getStaff().showStatus("status3"));
		System.out.println("======");

		colleague2.setStaff(expiriencedApplicant2);
		colleague2.getStaff().printInfo();
		System.out.println(colleague2.getStaff().showAge());
		System.out.println(colleague2.getStaff().showSex());
		System.out.println(colleague2.getStaff().showStatus());
		System.out.println("======");
		colleague2.getStaff().setInfoAgain(19, "TransGender", 2500, "expirienced applicant");
		System.out.println(colleague2.getStaff().toString());
		
// OverLoading	
		System.out.println("======");
		colleague2.getStaff().printInfo(29, "TransGender");
		System.out.println(colleague2.getStaff().showAge(32));
		System.out.println(colleague2.getStaff().showSex("TransSexual"));
		System.out.println(colleague2.getStaff().showStatus("status4"));
		System.out.println("========================");
		

        System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class (Storage) Of ActiveUser");
		System.out.println("========================");
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Set 1 OverRiding");
		System.out.println("========================");
		

		ActiveUser activeUser1 = new ActiveUser();
		
		activeUser1.setGoodUser(mobilePhoneUser1);
		activeUser1.getGoodUser().printInfo();
		System.out.println(activeUser1.getGoodUser().showNumber());		
		System.out.println(activeUser1.getGoodUser().showOperator());		
		System.out.println(activeUser1.getGoodUser().showStatus());		
		System.out.println(activeUser1.getGoodUser().getNumber());
		System.out.println(activeUser1.getGoodUser().getOperator());
		System.out.println(activeUser1.getGoodUser().getStatus());
		System.out.println(activeUser1.getGoodUser().toString());
		
// OverLoading	
		System.out.println("======");
		activeUser1.getGoodUser().printInfo(345678, "LogoiskCom", true);
		System.out.println(activeUser1.getGoodUser().showNumber(5678345));
		System.out.println(activeUser1.getGoodUser().showOperator("DzerjinskCom"));
		System.out.println(activeUser1.getGoodUser().showStatus(false));
		System.out.println("======");
		
		activeUser1.setGoodUser(mobileInternetUser1);
		activeUser1.getGoodUser().printInfo();
		System.out.println(activeUser1.getGoodUser().showNumber());		
		System.out.println(activeUser1.getGoodUser().showOperator());		
		System.out.println(activeUser1.getGoodUser().showStatus());		
		System.out.println(activeUser1.getGoodUser().getNumber());
		System.out.println(activeUser1.getGoodUser().getOperator());
		System.out.println(activeUser1.getGoodUser().getStatus());
		System.out.println(activeUser1.getGoodUser().toString());
		
// OverLoading	
		System.out.println("======");
		activeUser1.getGoodUser().printInfo(345678, "LogoiskCom", true);
		System.out.println(activeUser1.getGoodUser().showNumber(5678345));
		System.out.println(activeUser1.getGoodUser().showOperator("DzerjinskCom"));
		System.out.println(activeUser1.getGoodUser().showStatus(false));
		System.out.println("======");
		
		activeUser1.setGoodUser(homeInternetUser1);
		activeUser1.getGoodUser().printInfo();
		System.out.println(activeUser1.getGoodUser().showNumber());		
		System.out.println(activeUser1.getGoodUser().showOperator());		
		System.out.println(activeUser1.getGoodUser().showStatus());		
		System.out.println(activeUser1.getGoodUser().getNumber());
		System.out.println(activeUser1.getGoodUser().getOperator());
		System.out.println(activeUser1.getGoodUser().getStatus());
		System.out.println(activeUser1.getGoodUser().toString());
		
// OverLoading		
		System.out.println("======");
		activeUser1.getGoodUser().printInfo(345678, "LogoiskCom", true);
		System.out.println(activeUser1.getGoodUser().showNumber(5678345));
		System.out.println(activeUser1.getGoodUser().showOperator("DzerjinskCom"));
		System.out.println(activeUser1.getGoodUser().showStatus(false));
		System.out.println("========================");
		System.out.println(" ");
		
	
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Set 2 OverRiding");
		System.out.println("========================");
		

		ActiveUser activeUser2 = new ActiveUser();
		activeUser2.setGoodUser(mobilePhoneUser2);
		activeUser2.getGoodUser().printInfo();
		System.out.println(activeUser2.getGoodUser().showNumber());		
		System.out.println(activeUser2.getGoodUser().showOperator());		
		System.out.println(activeUser2.getGoodUser().showStatus());		
		System.out.println(activeUser2.getGoodUser().getNumber());
		System.out.println(activeUser2.getGoodUser().getOperator());
		System.out.println(activeUser2.getGoodUser().getStatus());
		System.out.println(activeUser2.getGoodUser().toString());
		
// OverLoading	
		System.out.println("======");
		activeUser2.getGoodUser().printInfo(345678, "LogoiskCom", true);
		System.out.println(activeUser2.getGoodUser().showNumber(678345));
		System.out.println(activeUser2.getGoodUser().showOperator("LogoiskCom"));
		System.out.println(activeUser2.getGoodUser().showStatus(true));
		System.out.println("======");
		
		activeUser2.setGoodUser(mobileInternetUser2);
		activeUser2.getGoodUser().printInfo();
		System.out.println(activeUser2.getGoodUser().showNumber());		
		System.out.println(activeUser2.getGoodUser().showOperator());		
		System.out.println(activeUser2.getGoodUser().showStatus());		
		System.out.println(activeUser2.getGoodUser().getNumber());
		System.out.println(activeUser2.getGoodUser().getOperator());
		System.out.println(activeUser2.getGoodUser().getStatus());
		System.out.println(activeUser2.getGoodUser().toString());
		
// OverLoading	
		System.out.println("======");
		activeUser2.getGoodUser().printInfo(345678, "LogoiskCom", true);
		System.out.println(activeUser2.getGoodUser().showNumber(5678345));
		System.out.println(activeUser2.getGoodUser().showOperator("DzerjinskCom"));
		System.out.println(activeUser2.getGoodUser().showStatus(false));
		System.out.println("======");
		
		activeUser2.setGoodUser(homeInternetUser2);
		activeUser2.getGoodUser().printInfo();
		System.out.println(activeUser2.getGoodUser().showNumber());		
		System.out.println(activeUser2.getGoodUser().showOperator());		
		System.out.println(activeUser2.getGoodUser().showStatus());		
		System.out.println(activeUser2.getGoodUser().getNumber());
		System.out.println(activeUser2.getGoodUser().getOperator());
		System.out.println(activeUser2.getGoodUser().getStatus());
		System.out.println(activeUser2.getGoodUser().toString());
		
// OverLoading
		System.out.println("======");
    	activeUser2.getGoodUser().printInfo(345678, "LogoiskCom", true);
		System.out.println(activeUser2.getGoodUser().showNumber(5668345));
		System.out.println(activeUser2.getGoodUser().showOperator("LitvaCom"));
		System.out.println(activeUser2.getGoodUser().showStatus(false));
	
		System.out.println("========================");
		System.out.println(" ");	
		
		*/
		
		
		System.out.println("========================Scanner_1========================");
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
		int badEmployeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;

		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
//			String newIndex = in.nextLine();
//			Array indexArray = new Array<>();
//			indexArray = newIndex.split(' ');	
//          employeeIndex = indexArray[0];
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3))	;
		
		do {	
			System.out.println("Enter the number of Bad Employees from 1 to 3");
			badEmployeeIndex = in.nextInt();
		} while((badEmployeeIndex != 1)&&(badEmployeeIndex != 2)&&(badEmployeeIndex != 3))	;	
		
		do {	
			System.out.println("Enter the number of Bosses from 1 to 3");
			bossIndex = in.nextInt();
		} while((bossIndex != 1)&&(bossIndex != 2)&&(bossIndex != 3))	;		
	
		do {	
			System.out.println("Enter the number of Expirienced Applicants from 1 to 3");
			expiriencedApplicantIndex = in.nextInt();
		} while((expiriencedApplicantIndex != 1)&&(expiriencedApplicantIndex != 2)&&(expiriencedApplicantIndex != 3))	;					
		in.nextLine();
		
		do {
		System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
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
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("========================");

		do {
		System.out.println("Would you like to get all of the information about all of the Bad Employees? (y/n)");
		index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
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
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
				
		do {
		System.out.println("Would you like to get all of the information about all of the Bosses? (y/n)");
		index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
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
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");

		do {
		System.out.println("Would you like to get all of the information about all of the Expirienced Applicants? (y/n)");
		index = in.nextLine();
        } while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
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
			switch (employeeIndex){
			case 1:
				colleague3.setStaff(employee1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 2:
				colleague3.setStaff(employee1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(employee2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 3:
				colleague3.setStaff(employee1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(employee2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(employee3);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);				
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
		
		
		
		do {
		System.out.println("Would you like to set sex to all of the Bad Employees? (y/n)");
		index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		 
		if ("y".equals(index)) {
			switch (badEmployeeIndex){
			case 1:
				colleague3.setStaff(badEmployee1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 2:
				colleague3.setStaff(badEmployee1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(badEmployee2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 3:
				colleague3.setStaff(badEmployee1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(badEmployee2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(badEmployee3);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);				
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
		
		
		
		do {
		System.out.println("Would you like to set sex to all of the Bosses? (y/n)");
		index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		 		
		if ("y".equals(index)) {
			switch (bossIndex){
			case 1:
				colleague3.setStaff(boss1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 2:
				colleague3.setStaff(boss1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(boss2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 3:
				colleague3.setStaff(boss1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(boss2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(boss3);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);				
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
		
		
		
		do {
		System.out.println("Would you like to set sex to all of the Expirienced Applicants? (y/n)");
		index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		 		
		if ("y".equals(index)) {
			switch (employeeIndex){
			case 1:
				colleague3.setStaff(expiriencedApplicant1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 2:
				colleague3.setStaff(expiriencedApplicant1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(expiriencedApplicant2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				break;
			case 3:
				colleague3.setStaff(expiriencedApplicant1);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(expiriencedApplicant2);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);
				System.out.println("=======");
				indexSex++;
				colleague3.setStaff(expiriencedApplicant3);
				System.out.println("Sex of " + colleague3.getStaff().showStatus() + " " + indexSex + " is " + colleague3.getStaff().showSex());
				System.out.println("Set sex to " + colleague3.getStaff().showStatus() + " " + indexSex +" (f/m/trans)");
				sexIndex = in.nextLine();
				colleague3.getStaff().setSex(sexIndex);				
				break;	
			default:
				break;				
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
		
		
		
		
		
		System.out.println("========================Scanner_2========================");
		
		ActiveUser activeUser3 = new ActiveUser();
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
		
		System.out.println("Would you like to get all of the information about all of the Mobile Phone Users? (y/n)");
		index = in.nextLine();
		
		if ("y".equals(index)) {
			switch (mobilePhoneUserIndex){
			case 1:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 2:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobilePhoneUser2);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 3:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobilePhoneUser2);
				System.out.println(activeUser3.getGoodUser().toString());;
				System.out.println("=======");
				activeUser3.setGoodUser(mobilePhoneUser3);
				System.out.println(activeUser3.getGoodUser().toString());
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("========================");
		
		System.out.println("Would you like to get all of the information about all of the Mobile Internet Users? (y/n)");
		index = in.nextLine();
		
		if ("y".equals(index)) {
			switch (mobileInternetUserIndex){
			case 1:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 2:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobileInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 3:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobileInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());;
				System.out.println("=======");
				activeUser3.setGoodUser(mobileInternetUser3);
				System.out.println(activeUser3.getGoodUser().toString());
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
		System.out.println("Would you like to get all of the information about all of the Home Internet Users? (y/n)");
		index = in.nextLine();
		
		if ("y".equals(index)) {
			switch (homeInternetUserIndex){
			case 1:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 2:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(homeInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 3:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(homeInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());;
				System.out.println("=======");
				activeUser3.setGoodUser(homeInternetUser3);
				System.out.println(activeUser3.getGoodUser().toString());
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
		System.out.println("Would you like to set operator to all of the Mobile Phone Users? (y/n)");
		index = in.nextLine();
		int indexOperator = 1;
		String newOperator = "";
		
		if ("y".equals(index)) {
			switch (mobilePhoneUserIndex){
			case 1:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				break;
			case 2:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(mobilePhoneUser2);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				break;
			case 3:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(mobilePhoneUser2);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(mobilePhoneUser3);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);			
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
	
		
		System.out.println("Would you like to set operator to all of the Mobile Internet Users? (y/n)");
		index = in.nextLine();
		
		if ("y".equals(index)) {
			switch (mobileInternetUserIndex){
			case 1:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				break;
			case 2:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(mobileInternetUser2);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				break;
			case 3:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(mobileInternetUser2);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(mobileInternetUser3);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);			
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
		System.out.println("Would you like to set operator to all of the Home Internet Users? (y/n)");
		index = in.nextLine();
		
		if ("y".equals(index)) {
			switch (homeInternetUserIndex){
			case 1:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				break;
			case 2:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(homeInternetUser2);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				break;
			case 3:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(homeInternetUser2);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);
				System.out.println("=======");
				indexOperator++;
				activeUser3.setGoodUser(homeInternetUser3);
				System.out.println("Operator of "+ activeUser3.getGoodUser().showUser() + " " + indexOperator + " is " + activeUser3.getGoodUser().showOperator());
				System.out.println("Set operator to "+ activeUser3.getGoodUser().showUser() + " "  + indexOperator + " (enter new name of operator)");
				newOperator = in.nextLine();
				activeUser3.getGoodUser().setOperator(newOperator);			
				break;	
			default:
				break;				
			}
		} else {
			System.out.println("OK, move forward!");
		}
		System.out.println("========================");
		
		System.out.println("Would you like to get all of the information about all of the Active Users? (y/n)");
		index = in.nextLine();
		
		if ("y".equals(index)) {
			switch (mobilePhoneUserIndex){
			case 1:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 2:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobilePhoneUser2);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 3:
				activeUser3.setGoodUser(mobilePhoneUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobilePhoneUser2);
				System.out.println(activeUser3.getGoodUser().toString());;
				System.out.println("=======");
				activeUser3.setGoodUser(mobilePhoneUser3);
				System.out.println(activeUser3.getGoodUser().toString());
				break;	
			default:
				break;
			}
			System.out.println("========================");
			switch (mobileInternetUserIndex){
			case 1:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 2:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobileInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 3:
				activeUser3.setGoodUser(mobileInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(mobileInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());;
				System.out.println("=======");
				activeUser3.setGoodUser(mobileInternetUser3);
				System.out.println(activeUser3.getGoodUser().toString());
				break;	
			default:
				break;
			}
			System.out.println("========================");	
			switch (homeInternetUserIndex){
			case 1:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 2:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(homeInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());
				break;
			case 3:
				activeUser3.setGoodUser(homeInternetUser1);
				System.out.println(activeUser3.getGoodUser().toString());
				System.out.println("=======");
				activeUser3.setGoodUser(homeInternetUser2);
				System.out.println(activeUser3.getGoodUser().toString());;
				System.out.println("=======");
				activeUser3.setGoodUser(homeInternetUser3);
				System.out.println(activeUser3.getGoodUser().toString());
				break;	
			default:
				break;
			}
		} else {
			System.out.println("Bye! See You!");
		}
		
		System.out.println("========================");
		System.out.println("THAT'S IT");
		System.out.println("========================");

		
	}	
}

