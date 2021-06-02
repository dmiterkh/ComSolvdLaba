package com.solvd.mobileoperator.executor;

import com.solvd.mobileoperator.point.InternetMarket; // Set, Get 
import com.solvd.mobileoperator.point.Market;         // Extension:   Class Market extends Class InternetMarket;
import com.solvd.mobileoperator.point.Office;         // Set, Get
import com.solvd.mobileoperator.point.MarketPlace;    // Extension:   Class MarketPlace extends Class Office;	

//import com.solvd.mobileoperator.staff.Trainee;    		 // Initial Interface   Interface Trainee
//import com.solvd.mobileoperator.staff.Staff;      		 // Extension:          Interface Staff extends Interface Trainee;
import com.solvd.mobileoperator.staff.Employee;     		 // Implementation:     Class Employee implements Interface Staff, 
import com.solvd.mobileoperator.staff.Boss;         		 // Extension:          Class Boss extends Class Employee;
//import com.solvd.mobileoperator.staff.BadTrainee;          // Initial Interface   Interface BadTrainee
import com.solvd.mobileoperator.staff.BadEmployee;           // Multi Implement:    Class Employee implements Interfaces Staff and BadTrainee
//import com.solvd.mobileoperator.staff.Unemployed;          // Abstraction:        Abstract Class Unemployed;
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;  // Combination:        Class ExpiriencedApplicant extends Abstract Class Unemployed
															 //					    and implements Interface Staff

//import com.solvd.mobileoperator.user.BadUser;          // Abstraction:   Abstract Class BadUser; (Super)
import com.solvd.mobileoperator.user.NoMoneyUser;        // Extension:     Class NoMoneyUser extends Abstract Class BadUser; (Super)
import com.solvd.mobileoperator.user.NoConnectionUser;   // Extension:     Class NoConnectionUser extends Class NoMoneyUser; (Super)
//import com.solvd.mobileoperator.user.GoodUser;         // Abstraction:   Abstract Class GoodUser;
import com.solvd.mobileoperator.user.MobilePhoneUser;    // Extension:     Class MobilePhoneUser extends Abstract Class GoodUser;
import com.solvd.mobileoperator.user.MobileInternetUser; // Extension:     Class MobileInternetUser extends Class MobilePhoneUser;
//import com.solvd.mobileoperator.user.HomePhoneUser;         // Abstraction:   Abstract Class HomeUser extends Abstract Class GoodUser;
import com.solvd.mobileoperator.user.HomeInternetUser;   // Abstraction:   Class HomeInternetUser extends Abstract Class HomeUser, 

import com.solvd.mobileoperator.storage.Colleague;       // Polymorphizm: Interface Staff 
import com.solvd.mobileoperator.storage.ActiveUser;      // Polymorphizm: Abstract Class GoodUser



public class Executor {

	public static void main(String[] args) {
		
		System.out.println(" ");
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
		
		
		
		
		//System.out.println("========================Scanner========================");
		//int employeeIndex = 0;
		//int badEmployeeIndex = 0;
		//int bossIndex = 0;
		//int expiriencedApplicantIndex = 0;
		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter the number of bosses");
		//int bossIndex = in.nextLine();
		
		
		

	}	
}

