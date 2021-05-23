package com.solvd.mobileoperator.executor;

import com.solvd.mobileoperator.point.InternetMarket; // Set, Get 
import com.solvd.mobileoperator.point.Market;         // Extension:   Class Market extends Class InternetMarket;
import com.solvd.mobileoperator.point.Office;         // Set, Get
import com.solvd.mobileoperator.point.MarketPlace;    // Extension:   Class MarketPlace extends Class Office;	

//import com.solvd.mobileoperator.staff.Trainee;    // Initial Interface
//import com.solvd.mobileoperator.staff.Staff;      // Extension:         Interface Staff extends Interface Trainee;
import com.solvd.mobileoperator.staff.Employee;     // Implementation:    Class Employee implements Interface Staff, 
import com.solvd.mobileoperator.staff.Boss;         // Extension:         Class Boss extends Class Employee;
//import com.solvd.mobileoperator.staff.BadTrainee; // Initial Interface
import com.solvd.mobileoperator.staff.BadEmployee;  // Multi Implement:   Class Employee implements Interfaces Staff and BadTrainee

//import com.solvd.mobileoperator.user.BadUser;          // Abstraction: Abstract Class BadUser; (Super)
import com.solvd.mobileoperator.user.NoMoneyUser;        // Extension:   Class NoMoneyUser extends Abstract Class BadUser; (Super)
import com.solvd.mobileoperator.user.NoConnectionUser;   // Extension:   Class NoConnectionUser extends Class NoMoneyUser; (Super)
//import com.solvd.mobileoperator.user.GoodUser;         // Abstraction: Abstract Class GoodUser;
import com.solvd.mobileoperator.user.MobilePhoneUser;    // Extension:   Class MobilePhoneUser extends Abstract Class GoodUser;
import com.solvd.mobileoperator.user.MobileInternetUser; // Extension:   Class MobileInternetUser extends Class MobilePhoneUser;
//import com.solvd.mobileoperator.user.HomeUser;         // Abstraction: Abstract Class HomeUser extends Abstract Class GoodUser;
import com.solvd.mobileoperator.user.HomeInternetUser;   // Abstraction: Class HomeInternetUser extends Abstract Class HomeUser, 



public class Executor {

	public static void main(String[] args) {
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Internet Market");		
		System.out.println("========================");
		
		InternetMarket im1 = new InternetMarket();
		im1.setSales(true);
		System.out.println(im1.getSales());
		System.out.println("============");
		
		InternetMarket im2 = new InternetMarket();
		im2.setInfo(true);
		im2.printInfo();
		System.out.println("============");

		
				
				
		System.out.println(" ");		
		System.out.println(" ");
		System.out.println("Class Of Market");
		System.out.println("========================");
		
		Market m1 = new Market();
		m1.setInfo("", true);
		m1.printInfo();
		System.out.println("============");
		
		Market m2 = new Market("", true);
		m2.printInfo();
		System.out.println("============");
		
		Market m3 = new Market();
		m3.setAdress("");
		System.out.println(m3.getAdress());
		System.out.println("======");
		m3.setSales(true);
		System.out.println(m3.getSales());
		System.out.println("======");
		m3.printInfo();
		System.out.println("============");
		
		Market m4 = new Market("Brovki", true);
		m4.printInfo();
		System.out.println("============");
		
		Market m5 = new Market();
		m5.setInfo("Pobedy", true);
		m5.printInfo();
		System.out.println("============");
		
		Market m6 = new Market();
		m6.setAdress("Lenina");
		m6.setSales(true);
		System.out.println(m6.getAdress());
		System.out.println(m6.getSales());		
		System.out.println("============");
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of MarketPlace");
		System.out.println("========================");
		
		MarketPlace mp1 = new MarketPlace();
		mp1.setInfo("Pritickogo", "Head", 1, false);
		mp1.printInfo();
		System.out.println("============");
		
		MarketPlace mp2 = new MarketPlace();
		mp2.setAdress("Melezha");
		System.out.println(mp2.getAdress());
		System.out.println("======");
		mp2.setPriority("regional");
		System.out.println(mp2.getPriority());
		System.out.println("======");
		mp2.setNumber(3);
		System.out.println(mp2.getNumber());
		System.out.println("======");
		mp2.setSales(true);
		System.out.println(mp2.getSales());
		System.out.println("============");
		mp2.printInfo();
		System.out.println("============");
		
		MarketPlace mp3 = new MarketPlace("Kedishko", "regional", 1, false);
		mp3.printInfo();
		System.out.println("============");
		
		MarketPlace mp4 = new MarketPlace();
		mp4.setInfo("", "", -100, false);
		mp4.printInfo();
		System.out.println("============");
						
		MarketPlace mp5 = new MarketPlace();
		mp5.setAdress("");
		System.out.println(mp5.getAdress());
		System.out.println("======");
		mp5.setPriority("");
		System.out.println(mp5.getPriority());
		System.out.println("======");
		mp5.setNumber(-30);
		System.out.println(mp5.getNumber());
		System.out.println("======");
		mp5.setSales(true);
		System.out.println(mp5.getSales());
		System.out.println("============");
		mp5.printInfo();
		System.out.println("============");
				
		MarketPlace mp6 = new MarketPlace("", "", -100, false);
		mp6.printInfo();
		System.out.println("============");
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Office");
		System.out.println("========================");
		
		Office of1 = new Office();
		of1.setInfo("Pritickogo", "Head", 1);
		of1.printInfo();
		System.out.println("============");
		
		Office of2 = new Office();
		of2.setAdress("Kolasa");
		System.out.println(of2.getAdress());
		System.out.println("======");
		of2.setPriority("Regional");
		System.out.println(of2.getPriority());
		System.out.println("======");
		of2.setNumber(2);
		System.out.println(of2.getNumber());
		System.out.println("============");
		of2.printInfo();
		System.out.println("============");
		
		Office of3 = new Office("Partizanski", "regional", 12);
		of3.printInfo();
		System.out.println("============");

		Office of4 = new Office();
		of4.setInfo("", "", -100);
		of4.printInfo();
		System.out.println("============");
						
		Office of5 = new Office();
		of5.setAdress("");
		System.out.println(of5.getAdress());
		System.out.println("======");
		of5.setPriority("");
		System.out.println(of5.getPriority());
		System.out.println("======");
		of5.setNumber(-30);
		System.out.println(of5.getNumber());
		System.out.println("============");
				
		Office of6 = new Office("", "", -100);
		of6.printInfo();
		System.out.println("============");
	
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Employee");
		System.out.println("========================");
		
		Employee em1 = new Employee(25, "F"); 
		em1.printInfo();
		System.out.println(em1.api);
		System.out.println(em1.pi);
		System.out.println("========================");
		
		Employee em2 = new Employee(20, "M"); 
		em2.aquire();
		System.out.println("======");
		System.out.println(em2.showAge());
		System.out.println(em2.showSex());
		System.out.println(em2.api);
		System.out.println(em2.pi);		
		System.out.println("======");
		em2.printInfoAgain(21,"MM");
		System.out.println("======");
		System.out.println(em2.showAgeAgain(22));
		System.out.println(em2.showSexAgain("FF"));
		System.out.println(em2.setApi(7));			  //???
		System.out.println(em2.setPi(7.14));		  //???
		System.out.println("======");
		em2.work();
		System.out.println("========================");
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Bad Employee");
		System.out.println("========================");
		
		BadEmployee bem1 = new BadEmployee(35, "F"); 
		bem1.printInfo();
		System.out.println(bem1.api);
		System.out.println(bem1.pi);
		System.out.println("========================");
		
		BadEmployee bem2 = new BadEmployee(45, "M"); 
		bem2.aquire();
		System.out.println("======");
		System.out.println(bem2.showAge());
		System.out.println(bem2.showSex());
		System.out.println("======");
		bem2.printInfoAgain(21,"MM");
		System.out.println("======");
		System.out.println(bem2.showAgeAgain(27));
		System.out.println(bem2.showSexAgain("FFMM"));
		System.out.println(em2.setApi(8));			  //???
		System.out.println(em2.setPi(8.14));		  //???
		System.out.println("======");
		bem2.work();
		bem2.drink();        
		System.out.println("========================");
		
		
		
		
    	System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of Boss");
		System.out.println("========================");
		
		Boss boss1 = new Boss(76, "F"); 
		boss1.printInfo();
		System.out.println(boss1.api);
		System.out.println(boss1.pi);
		System.out.println("========================");
		
		Boss boss2 = new Boss(77, "M"); 
		boss2.aquire();
		System.out.println("======");
		System.out.println(boss2.showAge());
		System.out.println(boss2.showSex());
		System.out.println("======");
		boss2.printInfoAgain(21,"MM");   
		System.out.println("======");
		System.out.println(boss2.showAgeAgain(22));
		System.out.println(boss2.showSexAgain("FF"));
		System.out.println(em2.setApi(9));			  //???
		System.out.println(em2.setPi(9.14));		  //???		
		System.out.println("======");
		boss2.work();
		boss2.hirePeople();
		boss2.firePeople();
		System.out.println("========================");
		
		
		
		
     	System.out.println(" ");
		System.out.println(" ");		
		System.out.println("Class Of NoMoneyUser");
		System.out.println("========================");
		
	    NoMoneyUser nmu1 = new NoMoneyUser(1234567, "BelCom", true);
		nmu1.printInfo();
		System.out.println("======");
		System.out.println(nmu1.showNumber());                 
		System.out.println(nmu1.showOperator());                
		System.out.println(nmu1.showStatus());                  
		System.out.println("======");	
		nmu1.printInfoAgain(123,"BalkanCom",false);
		System.out.println("======");
		System.out.println(nmu1.showNumberAgain(1234));         
		System.out.println(nmu1.showOperatorAgain("UkrCom"));   
		System.out.println(nmu1.showStatusAgain(true));		    
		System.out.println("========================");
				
		NoMoneyUser nmu2 = new NoMoneyUser(12345678, "BelCom", true);
		System.out.println(nmu2.getNumber());
		System.out.println(nmu2.getOperator());
		System.out.println(nmu2.getStatus());
		System.out.println("========================");
			
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of NoConnectionUser");
		System.out.println("========================");
		
		NoConnectionUser ncu1 = new NoConnectionUser(567, "UserCom", true);
		ncu1.printInfo();
		System.out.println("======");		
		System.out.println(ncu1.showNumber());                    
		System.out.println(ncu1.showOperator());                  
		System.out.println(ncu1.showStatus());                     
		System.out.println("======");		
		ncu1.printInfoAgain(12345,"BelkaCom",false);
		System.out.println("======");
		System.out.println(ncu1.showNumberAgain(1234));              
		System.out.println(ncu1.showOperatorAgain("PolskaCom"));   
		System.out.println(ncu1.showStatusAgain(true));		       
		System.out.println("========================");
				
		NoConnectionUser ncu2 = new NoConnectionUser(678, "BulbaCom", true);
		System.out.println(ncu2.getNumber());
		System.out.println(ncu2.getOperator());
		System.out.println(ncu2.getStatus());
		System.out.println("========================");
		
		
		
				
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of MobilePhoneUser");
		System.out.println("========================");
		
		MobilePhoneUser mpu1 = new MobilePhoneUser(1234567, "BelCom", true, 100);
		mpu1.printInfo();
		System.out.println("======");		
		System.out.println(mpu1.showNumber());                    
		System.out.println(mpu1.showOperator());                  
		System.out.println(mpu1.showStatus());                   
		System.out.println("======");		
		mpu1.printInfoAgain(12345,"BelkaCom",false);
		System.out.println("======");
		System.out.println(mpu1.showNumberAgain(1234));            
		System.out.println(mpu1.showOperatorAgain("PolskaCom"));    
		System.out.println(mpu1.showStatusAgain(true));            
		System.out.println("========================");
	
		MobilePhoneUser mpu2 = new MobilePhoneUser(1234567, "BelCom", true, 100);
		System.out.println(mpu2.getNumber());
		System.out.println(mpu2.getOperator());
		System.out.println(mpu2.getStatus());
		System.out.println(mpu2.getMinutes());
		System.out.println("========================");
		
		
		
		
    	System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of MobileInternetUser");
		System.out.println("========================");
	    
	    MobileInternetUser miu1 = new MobileInternetUser(1234567, "BelarusCom", true, 1200, 2500);
		miu1.printInfo();
		System.out.println("======");		
		System.out.println(miu1.showNumber());                    
		System.out.println(miu1.showOperator());                  
		System.out.println(miu1.showStatus());                    
		System.out.println("======");		
		miu1.printInfoAgain(12345,"ZubrCom",false);
		System.out.println("======");
		System.out.println(miu1.showNumberAgain(1234));            
		System.out.println(miu1.showOperatorAgain("PolskaCom"));    
		System.out.println(miu1.showStatusAgain(true));            
		System.out.println("========================");		
	
		MobileInternetUser miu2 = new MobileInternetUser(1234567, "MedvedCom", true, 1000, 1500);
		System.out.println(miu2.getNumber());
		System.out.println(miu2.getOperator());
		System.out.println(miu2.getStatus());
		System.out.println(miu2.getMinutes());
		System.out.println(miu2.getBytes());		
		System.out.println("========================");
		
		
		
		
        System.out.println(" ");
		System.out.println(" ");
		System.out.println("Class Of HomeInternetUser");
		System.out.println("========================");
				
		HomeInternetUser hiu1 = new HomeInternetUser(1234567, "BelarusCom", true, 10000);
		hiu1.printInfo();
		System.out.println("======");		
		System.out.println(hiu1.showNumber());                    
		System.out.println(hiu1.showOperator());                  
		System.out.println(hiu1.showStatus());                    
		System.out.println("======");		
		hiu1.printInfoAgain(12345,"ZayacCom",false);
		hiu1.showHomeBonus();
		System.out.println("======");
		System.out.println(hiu1.showNumberAgain(1234));            
		System.out.println(hiu1.showOperatorAgain("PolskaCom"));    
		System.out.println(hiu1.showStatusAgain(true));            
		System.out.println("========================");	
		
		HomeInternetUser hiu2 = new HomeInternetUser(1234567, "MedvedCom", true, 15000);
		System.out.println(hiu2.getNumber());
		System.out.println(hiu2.getOperator());
		System.out.println(hiu2.getStatus());
		System.out.println(hiu2.getHomeBonus());		
		System.out.println("========================");
	}
	
}

