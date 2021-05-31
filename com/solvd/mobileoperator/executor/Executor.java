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
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of MarketPlace");
		System.out.println("========================");
		
		MarketPlace marketPlace1 = new MarketPlace();
		marketPlace1.setInfo("Pritickogo", "Head", 1, false);
		marketPlace1.printInfo();
		System.out.println("============");
		
		MarketPlace marketPlace2 = new MarketPlace();
		marketPlace2.setAdress("Melezha");
		System.out.println(marketPlace2.getAdress());
		System.out.println("======");
		marketPlace2.setPriority("regional");
		System.out.println(marketPlace2.getPriority());
		System.out.println("======");
		marketPlace2.setNumber(3);
		System.out.println(marketPlace2.getNumber());
		System.out.println("======");
		marketPlace2.setSales(true);
		System.out.println(marketPlace2.getSales());
		System.out.println("============");
		marketPlace2.printInfo();
		System.out.println("============");
		
		MarketPlace marketPlace3 = new MarketPlace("Kedishko", "regional", 1, false);
		marketPlace3.printInfo();
		System.out.println("============");
		
		MarketPlace marketPlace4 = new MarketPlace();
		marketPlace4.setInfo("", "", -100, false);
		marketPlace4.printInfo();
		System.out.println("============");
						
		MarketPlace marketPlace5 = new MarketPlace();
		marketPlace5.setAdress("");
		System.out.println(marketPlace5.getAdress());
		System.out.println("======");
		marketPlace5.setPriority("");
		System.out.println(marketPlace5.getPriority());
		System.out.println("======");
		marketPlace5.setNumber(-30);
		System.out.println(marketPlace5.getNumber());
		System.out.println("======");
		marketPlace5.setSales(true);
		System.out.println(marketPlace5.getSales());
		System.out.println("============");
		marketPlace5.printInfo();
		System.out.println("============");
				
		MarketPlace marketPlace6 = new MarketPlace("", "", -100, false);
		marketPlace6.printInfo();
		System.out.println("============");
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Office");
		System.out.println("========================");
		
		Office office1 = new Office();
		office1.setInfo("Pritickogo", "Head", 1);
		office1.printInfo();
		System.out.println("============");
		
		Office office2 = new Office();
		office2.setAdress("Kolasa");
		System.out.println(office2.getAdress());
		System.out.println("======");
		office2.setPriority("Regional");
		System.out.println(office2.getPriority());
		System.out.println("======");
		office2.setNumber(2);
		System.out.println(office2.getNumber());
		System.out.println("============");
		office2.printInfo();
		System.out.println("============");
		
		Office office3 = new Office("Partizanski", "regional", 12);
		office3.printInfo();
		System.out.println("============");

		Office office4 = new Office();
		office4.setInfo("", "", -100);
		office4.printInfo();
		System.out.println("============");
						
		Office office5 = new Office();
		office5.setAdress("");
		System.out.println(office5.getAdress());
		System.out.println("======");
		office5.setPriority("");
		System.out.println(office5.getPriority());
		System.out.println("======");
		office5.setNumber(-30);
		System.out.println(office5.getNumber());
		System.out.println("============");
				
		Office office6 = new Office("", "", -100);
		office6.printInfo();
		System.out.println("============");
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Employee");
		System.out.println("========================");
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.printInfo();

		System.out.println("========================");
		Employee employee2 = new Employee(20, "M"); 
		employee2.aquire();
		System.out.println("======");
		System.out.println(employee2.showAge());
		System.out.println(employee2.showSex());		
		System.out.println("======");
		employee2.printInfo(21,"MM");
		System.out.println("======");
		System.out.println(employee2.showAge(22));
		System.out.println(employee2.showSex("FF"));
		System.out.println("======");
		employee2.work();
		System.out.println("========================");
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Bad Employee");
		System.out.println("========================");
		
		BadEmployee badEmployee1 = new BadEmployee(35, "F"); 
		badEmployee1.printInfo();
		System.out.println("========================");
		
		BadEmployee badEmployee2 = new BadEmployee(45, "M"); 
		badEmployee2.aquire();
		System.out.println("======");
		System.out.println(badEmployee2.showAge());
		System.out.println(badEmployee2.showSex());	
		System.out.println("======");
		badEmployee2.printInfo(21,"MM");
		System.out.println("======");
		System.out.println(badEmployee2.showAge(27));
		System.out.println(badEmployee2.showSex("FFMM"));
		System.out.println("======");
		badEmployee2.work();
		badEmployee2.drink();        
		System.out.println("========================");
		
		
		
		
    	System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Boss");
		System.out.println("========================");
		
		Boss boss1 = new Boss(76, "F"); 
		boss1.printInfo();
		System.out.println("========================");
		
		Boss boss2 = new Boss(77, "M"); 
		boss2.aquire();
		System.out.println("======");
		System.out.println(boss2.showAge());
		System.out.println(boss2.showSex());	
		System.out.println("======");
		boss2.printInfo(21,"MM");   
		System.out.println("======");
		System.out.println(boss2.showAge(42));
		System.out.println(boss2.showSex("FN"));		
		System.out.println("======");
		boss2.work();
		boss2.hirePeople();
		boss2.firePeople();
		System.out.println("========================");
		
		
		
		
    	System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Expirienced Applicant");
		System.out.println("========================");
		
		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender"); 
		expiriencedApplicant1.printInfo();
		expiriencedApplicant1.lookForJob();
		System.out.println("========================");
		
		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M"); 
		expiriencedApplicant2.aquire();
		expiriencedApplicant2.lookForJob();
		System.out.println("======");
		System.out.println(expiriencedApplicant2.showAge());
		System.out.println(expiriencedApplicant2.showSex());
		System.out.println("======");
		expiriencedApplicant2.printInfo(21,"MM");   
		System.out.println("======");
		System.out.println(expiriencedApplicant2.showAge(12));
		System.out.println(expiriencedApplicant2.showSex("TransSexual"));		
		System.out.println("======");
		expiriencedApplicant2.work();
		System.out.println("========================");
		
		
		
		
     	System.out.println(" ");
		System.out.println(" ");		
		System.out.println("Class Of NoMoneyUser");
		System.out.println("========================");
		
	    NoMoneyUser noMoneyUser1 = new NoMoneyUser(1234567, "BelCom", true);
		noMoneyUser1.printInfo();
		System.out.println("======");
		System.out.println(noMoneyUser1.showNumber());                 
		System.out.println(noMoneyUser1.showOperator());                
		System.out.println(noMoneyUser1.showStatus());                  
		System.out.println("======");	
		noMoneyUser1.printInfoAgain(123,"BalkanCom",false);
		System.out.println("======");
		System.out.println(noMoneyUser1.showNumberAgain(1234));         
		System.out.println(noMoneyUser1.showOperatorAgain("UkrCom"));   
		System.out.println(noMoneyUser1.showStatusAgain(true));		    
		System.out.println("========================");
				
		NoMoneyUser noMoneyUser2 = new NoMoneyUser(12345678, "BelCom", true);
		System.out.println(noMoneyUser2.getNumber());
		System.out.println(noMoneyUser2.getOperator());
		System.out.println(noMoneyUser2.getStatus());
		System.out.println("========================");
			
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of NoConnectionUser");
		System.out.println("========================");
		
		NoConnectionUser noConnectionUser1 = new NoConnectionUser(567, "UserCom", true);
		noConnectionUser1.printInfo();
		System.out.println("======");		
		System.out.println(noConnectionUser1.showNumber());                    
		System.out.println(noConnectionUser1.showOperator());                  
		System.out.println(noConnectionUser1.showStatus());                     
		System.out.println("======");		
		noConnectionUser1.printInfoAgain(12345,"BelkaCom",false);
		System.out.println("======");
		System.out.println(noConnectionUser1.showNumberAgain(1234));              
		System.out.println(noConnectionUser1.showOperatorAgain("PolskaCom"));   
		System.out.println(noConnectionUser1.showStatusAgain(true));		       
		System.out.println("========================");
				
		NoConnectionUser noConnectionUser2 = new NoConnectionUser(678, "BulbaCom", true);
		System.out.println(noConnectionUser2.getNumber());
		System.out.println(noConnectionUser2.getOperator());
		System.out.println(noConnectionUser2.getStatus());
		System.out.println("========================");
		
		
		
				
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of MobilePhoneUser");
		System.out.println("========================");
		
		MobilePhoneUser mobilePhoneUser1 = new MobilePhoneUser(1234567, "BelCom", true, 100);
		mobilePhoneUser1.printInfo();
		System.out.println("======");		
		System.out.println(mobilePhoneUser1.showNumber());                    
		System.out.println(mobilePhoneUser1.showOperator());                  
		System.out.println(mobilePhoneUser1.showStatus());                   
		System.out.println("======");		
		mobilePhoneUser1.printInfo(12345,"BelkaCom",false);
		System.out.println("======");
		System.out.println(mobilePhoneUser1.showNumber(1234));            
		System.out.println(mobilePhoneUser1.showOperator("PolskaCom"));    
		System.out.println(mobilePhoneUser1.showStatus(true));            
		System.out.println("========================");
	
		MobilePhoneUser mobilePhoneUser2 = new MobilePhoneUser(1234567, "BelCom", true, 100);
		System.out.println(mobilePhoneUser2.getNumber());
		System.out.println(mobilePhoneUser2.getOperator());
		System.out.println(mobilePhoneUser2.getStatus());
		System.out.println(mobilePhoneUser2.getMinutes());
		System.out.println("========================");
		
		
		
		
    	System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of MobileInternetUser");
		System.out.println("========================");
	    
	    MobileInternetUser mobileInternetUser1 = new MobileInternetUser(1234567, "BelarusCom", true, 1200, 2500);
		mobileInternetUser1.printInfo();
		System.out.println("======");		
		System.out.println(mobileInternetUser1.showNumber());                    
		System.out.println(mobileInternetUser1.showOperator());                  
		System.out.println(mobileInternetUser1.showStatus());                    
		System.out.println("======");		
		mobileInternetUser1.printInfo(12345,"ZubrCom",false);
		System.out.println("======");
		System.out.println(mobileInternetUser1.showNumber(5234));            
		System.out.println(mobileInternetUser1.showOperator("SerbskaCom"));    
		System.out.println(mobileInternetUser1.showStatus(true));            
		System.out.println("========================");		
	
		MobileInternetUser mobileInternetUser2 = new MobileInternetUser(1234567, "MedvedCom", false, 1000, 1500);
		System.out.println(mobileInternetUser2.getNumber());
		System.out.println(mobileInternetUser2.getOperator());
		System.out.println(mobileInternetUser2.getStatus());
		System.out.println(mobileInternetUser2.getMinutes());
		System.out.println(mobileInternetUser2.getBytes());		
		System.out.println("========================");
		
		
		
		
        System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of HomeInternetUser");
		System.out.println("========================");
				
		HomeInternetUser homeInternetUser1 = new HomeInternetUser(1234567, "BelarusCom", true, 10000);
		homeInternetUser1.printInfo();
		System.out.println("======");		
		homeInternetUser1.printInfo();
		System.out.println("======");	
		System.out.println(homeInternetUser1.showNumber());                    
		System.out.println(homeInternetUser1.showOperator());                  
		System.out.println(homeInternetUser1.showStatus());                    
		System.out.println("======");		
		homeInternetUser1.printInfo(12345,"BobrCom",false);
		homeInternetUser1.showHomeBonus();
		System.out.println("======");
		System.out.println(homeInternetUser1.showNumber(1234));            
		System.out.println(homeInternetUser1.showOperator("PolskaCom"));    
		System.out.println(homeInternetUser1.showStatus(true));            
		System.out.println("========================");	
		
		HomeInternetUser homeInternetUser2 = new HomeInternetUser(4567123, "BarsukCom", true, 15000);
		System.out.println(homeInternetUser2.getNumber());
		System.out.println(homeInternetUser2.getOperator());
		System.out.println(homeInternetUser2.getStatus());
		System.out.println(homeInternetUser2.getHomeBonus());		
		System.out.println("========================");
		
		
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
		colleague1.getStaff().aquire();
		colleague1.getStaff().work();
		colleague1.getStaff().setInfoAgain(26, "ff", 2000, "employee");
		System.out.println(colleague1.getStaff().showSalaryMaximum(26, 2000, "employee"));

// OverLoading
		System.out.println("======");
		colleague1.getStaff().printInfo(36, "FF");
		colleague1.getStaff().showStatus("status14");
		System.out.println(colleague1.getStaff().showAge(42));
		System.out.println(colleague1.getStaff().showSex("ff"));
		System.out.println("======");
		
		colleague1.setStaff(badEmployee1);
		colleague1.getStaff().printInfo();
		System.out.println(colleague1.getStaff().showAge());
		System.out.println(colleague1.getStaff().showSex());
		System.out.println(colleague1.getStaff().showStatus());
		colleague1.getStaff().aquire();
		colleague1.getStaff().work();
		colleague1.getStaff().setInfoAgain(36, "MM", 700, "bad employee");
		System.out.println(colleague1.getStaff().showSalaryMaximum(36, 700, "bad employee"));		

// OverLoading
		System.out.println("======");
		colleague1.getStaff().printInfo(46, "mm");
        colleague1.getStaff().showStatus("status14");
		System.out.println(colleague1.getStaff().showAge(52));
		System.out.println(colleague1.getStaff().showSex("mm"));
		System.out.println("======");
		
		colleague1.setStaff(boss1);
		colleague1.getStaff().printInfo();
		System.out.println(colleague1.getStaff().showAge());
		System.out.println(colleague1.getStaff().showSex());
		System.out.println(colleague1.getStaff().showStatus());
		colleague1.getStaff().aquire();
		colleague1.getStaff().work();
		colleague1.getStaff().setInfoAgain(46, "FF", 3000, "boss" /*, "god power"*/);
		System.out.println(colleague1.getStaff().showSalaryMaximum(46, 3000, "boss" /*, "god power"*/));		

// OverLoading		
		System.out.println("======");
		colleague1.getStaff().printInfo(56, "ff");
		colleague1.getStaff().showStatus("status14");
		System.out.println(colleague1.getStaff().showAge(62));
		System.out.println(colleague1.getStaff().showSex("mmff"));
		System.out.println("======");
		
		colleague1.setStaff(expiriencedApplicant1);
		colleague1.getStaff().printInfo();
		badEmployee1.printInfo(43, "female", 300, "bad employee");
		System.out.println(colleague1.getStaff().showAge());
		System.out.println(colleague1.getStaff().showSex());
		System.out.println(colleague1.getStaff().showStatus());
		colleague1.getStaff().aquire();
		colleague1.getStaff().work();
		colleague1.getStaff().setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
		System.out.println(colleague1.getStaff().showSalaryMaximum(16, 1500, "expirienced applicant"));	

// OverLoading	
		System.out.println("======");
		colleague1.getStaff().printInfo(26, "TransGender");
		colleague1.getStaff().showStatus("status14");
		System.out.println(colleague1.getStaff().showAge(22));
		System.out.println(colleague1.getStaff().showSex("TransSexual"));
		System.out.println("========================");
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Set 1 OverLoading");
		System.out.println("========================");

// OverLoading
		employee1.printInfo(33, "female", 500, "employee");
		boss1.printInfo(53, "female", 1500, "boss", "god power");
		
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
		colleague2.getStaff().aquire();
		colleague2.getStaff().work();
		colleague2.getStaff().setInfoAgain(39, "ff", 2600, "employee");

// OverLoading	
		System.out.println("======");
		colleague2.getStaff().printInfo(49, "ff");
		colleague2.getStaff().showStatus("status1");
		System.out.println(colleague1.getStaff().showAge(52));
		System.out.println(colleague1.getStaff().showSex("ff"));
		System.out.println("======");

		colleague2.setStaff(badEmployee2);
		colleague2.getStaff().printInfo();
		System.out.println(colleague2.getStaff().showAge());
		System.out.println(colleague2.getStaff().showSex());
		System.out.println(colleague2.getStaff().showStatus());
		colleague2.getStaff().aquire();
		colleague2.getStaff().work();
		colleague2.getStaff().setInfoAgain(49, "ff", 1200, "bad employee");
		
// OverLoading
		System.out.println("======");
		colleague2.getStaff().printInfo(59, "mm");
		colleague2.getStaff().showStatus("status2");
		System.out.println(colleague1.getStaff().showAge(62));
		System.out.println(colleague1.getStaff().showSex("mm"));
		System.out.println("======");

		colleague2.setStaff(boss2);
		colleague2.getStaff().printInfo();
		System.out.println(colleague2.getStaff().showAge());
		System.out.println(colleague2.getStaff().showSex());
		System.out.println(colleague2.getStaff().showStatus());
		colleague2.getStaff().aquire();
		colleague2.getStaff().work();
		colleague2.getStaff().setInfoAgain(59, "mm", 4000, "boss");

// OverLoading	
		System.out.println("======");
		colleague2.getStaff().printInfo(69, "ff");
		colleague2.getStaff().showStatus("status3");
		System.out.println(colleague1.getStaff().showAge(72));
		System.out.println(colleague1.getStaff().showSex("mmff"));
		System.out.println("======");

		colleague2.setStaff(expiriencedApplicant2);
		colleague2.getStaff().printInfo();
		System.out.println(colleague2.getStaff().showAge());
		System.out.println(colleague2.getStaff().showSex());
		System.out.println(colleague2.getStaff().showStatus());
		colleague2.getStaff().aquire();
		colleague2.getStaff().work();
		colleague2.getStaff().setInfoAgain(19, "TransGender", 2500, "expirienced applicant");
		
// OverLoading	
		System.out.println("======");
		colleague2.getStaff().printInfo(29, "TransGender");
		colleague2.getStaff().showStatus("status4");
		System.out.println(colleague1.getStaff().showAge(32));
		System.out.println(colleague1.getStaff().showSex("TransSexual"));
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
		
// OverLoading
		System.out.println("======");
    	activeUser2.getGoodUser().printInfo(345678, "LogoiskCom", true);
		System.out.println(activeUser2.getGoodUser().showNumber(5668345));
		System.out.println(activeUser2.getGoodUser().showOperator("LitvaCom"));
		System.out.println(activeUser2.getGoodUser().showStatus(false));
	
		System.out.println("========================");
		System.out.println(" ");		
		
	}	
}

